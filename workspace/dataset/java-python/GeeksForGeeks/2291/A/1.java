

// Java implementation of above approach 
  
class GFG  
{ 
  
    // Function to check if given number is divisible 
    // by any of its digits 
    static String isDivisible(int n)  
    { 
        int temp = n; 
  
        // check if any of digit divides n 
        while (n > 0) 
        { 
            int k = n % 10; 
  
            // check if K divides N 
            if (temp % k == 0) 
            { 
                return "YES"; 
            } 
            n /= 10; 
        } 
  
        return "NO"; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n = 9876543; 
        System.out.println(isDivisible(n)); 
    } 
}  
  
// This code is contributed by 29AjayKumar 

