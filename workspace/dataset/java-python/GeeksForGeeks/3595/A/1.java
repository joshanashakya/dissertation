

// Java implementation of the above approach 
  
class GFG  
{ 
    static final int modd = 1000000007; 
  
    // Function for finding the power 
    static long power(long x, long y, long p)  
    { 
        long res = 1; // Initialize result 
  
        // Update x if it is more than or 
        // equal to p 
        x = x % p;  
  
        while (y > 0)  
        { 
            // If y is odd, multiply x with result 
            if (y % 2 == 1)  
            { 
                res = (res * x) % p; 
            } 
  
            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p; 
        } 
        return res; 
    } 
  
    // Function to calculate the number of ways 
    static int ways(int n, int m)  
    { 
        // Answer must be modulo of 10^9 + 7 
        return (int) (power(m - 1, n - 1, modd)  
                            * m % modd); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 5, m = 5; 
        System.out.println(ways(n, m)); 
          
    } 
} 
  
// This code is contributed by 29AjayKumar 

