

// Java program to check if a number can be 
// raised to k 
  
class GFG 
{ 
    static boolean isPowerOfK(int n,int k) 
    { 
        // loop to change base n to base = k 
        boolean oneSeen = false; 
        while (n > 0)  
        { 
      
            // Find current digit in base k 
            int digit = n % k; 
      
            // If digit is neither 0 nor 1  
            if (digit > 1) 
                return false; 
      
            // Make sure that only one 1 
            // is present.  
            if (digit == 1) 
            { 
                if (oneSeen) 
                return false; 
                oneSeen = true; 
            }      
      
            n /= k; 
        } 
          
        return true;  
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 64, k = 4; 
      
        if (isPowerOfK(n ,k)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

