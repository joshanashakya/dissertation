

// Java program to find product of primes 
// in range L to R 
  
import java.io.*; 
  
class GFG { 
     
  
static int mod = 1000000007; 
static  int MAX = 10000; 
  
// prefix[i] is going to store product of primes 
// till i (including i). 
static int []prefix = new int[MAX+1]; 
  
// Function to build the prefix product array 
static void buildPrefix() 
{ 
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    boolean prime[] = new boolean[MAX + 1]; 
    for(int i=0;i<MAX +1;i++) 
    prime[i]= true; 
    //memset(prime, true, sizeof(prime)); 
  
    for (int p = 2; p * p <= MAX; p++) { 
  
        // If prime[p] is not changed, then 
        // it is a prime 
        if (prime[p] == true) { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= MAX; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // Build prefix array 
    prefix[0] = prefix[1] = 1; 
    for (int p = 2; p <= MAX; p++) { 
        prefix[p] = prefix[p - 1]; 
        if (prime[p]) 
            prefix[p] = (prefix[p] * p) % mod; 
    } 
} 
  
/* Iterative Function to calculate (x^y)%p in O(log y) */
static long power(long  x, long y, int p) 
{ 
  
    // Initialize result 
    long  res = 1; 
  
    // Update x if it is more than or 
    // equal to p 
    x = x % p; 
  
    while (y > 0) { 
  
        // If y is odd, multiply x with result 
        if ((y & 1)>0) 
            res = (res * x) % p; 
  
        // y must be even now 
        // y = y/2 
        y = y >> 1; 
        x = (x * x) % p; 
    } 
  
    return res; 
} 
  
// Returns modular inverse 
static long  inverse(long n) 
{ 
    return power(n, mod - 2, mod); 
} 
  
// Function to return product of prime in range 
static long  productPrimeRange(int L, int R) 
{ 
  
    return (prefix[R] * inverse(prefix[L - 1])) % mod; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            buildPrefix(); 
  
    int L = 10, R = 20; 
    System.out.println( productPrimeRange(L, R)); 
    } 
} 
  
//This code is contributed by shs.. 

