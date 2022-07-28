

class GFG  
{ 
static int mod = 1000000007; 
  
// Iterative function to compute modular power 
static long modularexpo(long x, long y, long p) 
{ 
    // Initialize result 
    long res = 1;  
      
    // Update x if it is more than or 
    // equal to p 
    x = x % p;  
  
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y % 2 == 1) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1;  
        x = (x * x) % p; 
    } 
    return res; 
} 
  
// Helper function that multiplies 2 matrices 
// F and M of size 2*2, and puts the 
// multiplication result back to F[][] 
static void multiply(long F[][],  
                     long M[][], long m) 
{ 
    long x = ((F[0][0] * M[0][0]) % m +  
              (F[0][1] * M[1][0]) % m) % m; 
  
    long y = ((F[0][0] * M[0][1]) % m +  
              (F[0][1] * M[1][1]) % m) % m; 
  
    long z = ((F[1][0] * M[0][0]) % m +  
              (F[1][1] * M[1][0]) % m) % m; 
  
    long w = ((F[1][0] * M[0][1]) % m +  
              (F[1][1] * M[1][1]) % m) % m; 
  
    F[0][0] = x; 
    F[0][1] = y; 
    F[1][0] = z; 
    F[1][1] = w; 
} 
  
// Helper function that calculates F[][] raise to  
// the power n and puts the result in F[][]  
// Note that this function is designed only for fib()  
// and won't work as general power function  
static void power(long F[][], long n, long m) 
{ 
    if (n == 0 || n == 1) 
        return; 
    long M[][] = { { 1, 1 }, { 1, 0 } }; 
  
    power(F, n / 2, m); 
    multiply(F, F, m); 
  
    if (n % 2 != 0) 
        multiply(F, M, m); 
} 
  
// Function that returns nth Fibonacci number  
static long fib(long n, long m) 
{ 
    long F[][] = { { 1, 1 }, { 1, 0 } }; 
    if (n == 0) 
        return 0; 
    power(F, n - 1, m); 
    return F[0][0]; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    long n = 4; 
    long base = fib(n, mod) % mod; 
    long expo = fib(n, mod - 1) % (mod - 1); 
    long result = modularexpo(base, expo, mod) % mod; 
    System.out.println(result); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

