

// Java implementation of above approach 
  
class GFG 
{ 
    // Function to calculate the 
    // sum of digits 
    static long sumOfDigits( long n ) 
    { 
        long sum = 0; 
      
        while (n > 0)  
        { 
            sum += n % 10; 
            n /= 10; 
        } 
      
        return sum; 
    } 
      
    // Function to count the numbers 
    static long countDigits(long num, long limit) 
    { 
        long left = 1, right = num, result = 0; 
      
        // use binary search 
        while (left <= right) 
        { 
            long mid = (right + left) / 2; 
      
            // Check if you are at a valid number or not 
            if ((mid - sumOfDigits(mid)) >= limit) 
            { 
      
                // update the answer at each valid step 
                result = num - mid + 1; 
                right = mid - 1; 
            } 
            else
            { 
                left = mid + 1; 
            } 
        } 
      
        // return the answer 
        return result; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        // Get the value of N and L 
        long N = 1546300, L = 30651; 
      
        // Count the numbers 
        System.out.println(countDigits(N, L)); 
    } 
} 
  
// This code is contributed by ihritik 

