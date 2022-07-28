

// Java implementation of the approach 
  
class GFG 
{ 
      
static long mod =(long) (1e9 + 7); 
  
// Function to return n! % p 
static long factorial(long n, long p) 
{ 
    long res = 1; // Initialize result 
    for (int i = 2; i <= n; i++) 
        res = (res * i) % p; 
    return res; 
} 
  
// Iterative Function to calculate (x^y)%p 
// in O(log y) 
static long power(long x, long y, long p) 
{ 
    long res = 1; // Initialize result 
  
    x = x % p; // Update x if it is more than or 
    // equal to p 
  
    while (y > 0)  
    { 
        // If y is odd, multiply x with result 
        if ((y & 1)==1) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1; // y = y/2 
        x = (x * x) % p; 
    } 
    return res; 
} 
  
// Returns n^(-1) mod p 
static long modInverse(long n, long p) 
{ 
    return power(n, p - 2, p); 
} 
  
// Returns nCr % p using Fermat's little 
// theorem. 
static long nCrModP(long n, long r, long p) 
{ 
    // Base case 
    if (r == 0) 
        return 1; 
  
    // Fill factorial array so that we 
    // can find all factorial of r, n 
    // and n-r 
    long fac[] = new long[(int)n + 1]; 
    fac[0] = 1; 
    for (int i = 1; i <= n; i++) 
        fac[i] = fac[i - 1] * i % p; 
  
    return (fac[(int)n] * modInverse(fac[(int)r], p) % p  
                    * modInverse(fac[(int)n - (int)r], p) % p) % p; 
} 
  
// Function to return the number of ways to 
// arrange K different objects taking N objects 
// at a time 
static long countArrangements(long n, long k, long p) 
{ 
    return (factorial(n, p) * nCrModP(k, n, p)) % p; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    long N = 5, K = 8; 
    // Function call 
    System.out.println(countArrangements(N, K, mod)); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

