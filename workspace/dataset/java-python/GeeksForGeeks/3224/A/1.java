

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the minimum number of  
    // given operations required to reduce n to 1  
    static long minOperations(long n)  
    {  
        // To store the count of operations  
        long count = 0;  
      
        // To store the digit  
        long d = 0;  
      
        // If n is already then no  
        // operation is required  
        if (n == 1)  
            return 0;  
      
        // Extract all the digits except  
        // the first digit  
        while (n > 9)  
        {  
      
            // Store the maximum of that digits  
            d = Math.max(n % 10, d);  
            n /= 10;  
      
            // for each digit  
            count += 10;  
        }  
      
        // First digit  
        d = Math.max(d, n - 1);  
      
        // Add the value to count  
        count += Math.abs(d);  
      
        return count - 1;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        long n = 240;  
      
        System.out.println(minOperations(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

