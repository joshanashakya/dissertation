

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to return length 
    // of the resulatant number 
    static int numLen(int K) 
    { 
  
        // If K is a multiple of 2 or 5 
        if (K % 2 == 0 || K % 5 == 0) 
        { 
            return -1; 
        } 
  
        int number = 0; 
  
        int len = 1; 
  
        for (len = 1; len <= K; len++) 
        { 
  
            // Generate all possible numbers 
            // 1, 11, 111, 111, ..., K 1's 
            number = number * 10 + 1; 
  
            // If number is divisible by k 
            // then return the length 
            if ((number % K == 0))  
            { 
                return len; 
            } 
        } 
  
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int K = 7; 
        System.out.println(numLen(K)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

