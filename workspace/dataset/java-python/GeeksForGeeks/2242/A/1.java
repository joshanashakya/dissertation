

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to calculate x^y %mod efficiently  
    static int power(long x, int y, int mod)  
    {  
      
        // Initialize the answer  
        long res = 1;  
        while (y != 0) 
        {  
      
            // If power is odd  
            if ((y & 1) == 1)  
      
                // Update the answer  
                res = (res * x) % mod;  
      
            // Square the base and half the exponent  
            x = (x * x) % mod;  
            y = (y >> 1);  
        }  
      
        // Return the value  
        return (int)(res % mod);  
    }  
      
    // Function to calculate ncr%mod efficiently  
    static int ncr(int n, int r, int mod)  
    {  
      
        // Initialize the answer  
        long res = 1;  
      
        // Calculate ncr in O(r)  
        for (int i = 1; i <= r; i += 1)  
        {  
      
            // Multiply with the numerator factor  
            res = (res * (n - i + 1)) % mod;  
      
            // Calculate the inverse of  
            // factor of denominator  
            int inv = power(i, mod - 2, mod);  
      
            // Multiply with inverse value  
            res = (res * inv) % mod;  
        }  
      
        // Return answer value  
        return (int)(res % mod);  
    }  
      
    // Function to return the number  
    // of non intersecting chords  
    static int NoOfChords(int A)  
    {  
      
        // define mod value  
        int mod = (int)(1e9 + 7);  
      
        // Value of C(2n, n)  
        long ans = ncr(2 * A, A, mod);  
      
        // Modulo inverse of (n+1)  
        int inv = power(A + 1, mod - 2, mod);  
      
        // Multiply with modulo inverse  
        ans = (ans * inv) % mod;  
      
        // Return the answer  
        return (int)(ans % mod);  
    }  
      
    // Driver code  
    public static void main(String[] args)  
    { 
        int N = 2;  
      
        // Function call  
        System.out.println(NoOfChords(N)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

