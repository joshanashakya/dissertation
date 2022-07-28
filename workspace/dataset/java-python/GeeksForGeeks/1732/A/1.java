

// Java program to calculate to find last  
// digit of above expression  
  
class GFG{ 
/* Iterative Function to calculate (x^y)%p in O(log y) */
static long powermod(long x, long y, long p)  
{  
    long res = 1; // Initialise result  
  
    x = x % p; // Update x if it is more than or  
            // equal to p  
  
    while (y > 0) {  
  
        // If y is odd, multiply x with result  
        if ((y & 1L)>0)  
            res = (res * x) % p;  
  
        // y must be even now  
        y = y >> 1L; // y = y/2  
        x = (x * x) % p;  
    }  
    return res;  
}  
  
// Returns modulo inverse of a with respect to m  
// using extended Euclid Algorithm  
static long modInverse(long a, long m)  
{  
    long  m0 = m, t, q;  
    long  x0 = 0, x1 = 1;  
  
    if (m == 1)  
        return 0;  
  
    while (a > 1) {  
  
        // q is quotient  
        q = a / m;  
  
        t = m;  
  
        // m is remainder now, process same as  
        // Euclid's algo  
        m = a % m; 
        a = t;  
  
        t = x0;  
  
        x0 = x1 - q * x0;  
  
        x1 = t;  
    }  
  
    // Make x1 positive  
    if (x1 < 0)  
        x1 += m0;  
  
    return x1;  
}  
  
// Function to calculate the above expression  
static long evaluteExpression(long n)  
{  
    // Initialize the result  
    long firstsum = 0, mod = 10;  
  
    // Compute first part of expression  
    for (long i = 2, j = 0; (1L << j) <= n; i *= i, ++j)  
        firstsum = (firstsum + i) % mod;  
  
    // Compute second part of expression  
    // i.e., ((4^(n+1) - 1) / 3) mod 10  
    // Since division of 3 in modulo can't  
    // be performed directly therefore we  
    // need to find it's modulo Inverse  
    long secondsum = (powermod(4L, n + 1, mod) - 1) *  
                        modInverse(3L, mod);  
  
    return (firstsum * secondsum) % mod;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    long n = 3;  
    System.out.println(evaluteExpression(n));  
  
    n = 10;  
    System.out.println(evaluteExpression(n));  
  
}  
} 
// This code is contributed by mits 

