

// Java implementation of the approach 
  
class GFG 
{ 
  
    // Iterative Function to calculate (x^y)%p in O(log y) 
    static int power(int x, int y, int p)  
    { 
  
        // Initialize result 
        int res = 1; 
  
        // Update x if it is >= p 
        x = x % p; 
  
        while (y > 0) 
        { 
  
            // If y is odd, multiply x with result 
            if (y % 2 == 1) 
            { 
                res = (res * x) % p; 
            } 
  
            // Y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p; 
        } 
        return res; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int L = 2; 
        int P = (int) Math.pow(10, 9); 
  
        int ans = power(325, L, P); 
        System.out.println(ans); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

