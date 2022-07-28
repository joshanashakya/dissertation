

// Java program to implement 
// the above approach 
class GFG 
{ 
  
static int MAXN = 100000; 
static int MOD = 1000000007; 
  
// Initialize an array to store factorial values 
static long fact[] = new long[MAXN]; 
  
// Function to calculate and store X! values 
static void factorial() 
{ 
    fact[0] = 1; 
    for (int i = 1; i < MAXN; i++) 
        fact[i] = (fact[i - 1] * i) % MOD; 
} 
  
// Iterative Function to calculate (x^y)%p in O(log y) 
static long power(long x, long y, long p) 
{ 
    long res = 1; // Initialize result 
  
    x = x % p; // Update x if it is more than or 
    // equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y % 2== 1) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1; // y = y/2 
        x = (x * x) % p; 
    } 
    return res; 
} 
  
// Function that return modular 
// inverse of x under modulo p 
static long modInverse(long x, long p) 
{ 
    return power(x, p - 2, p); 
} 
  
// Function that returns the count of 
// different number possible by using 
// along the digits its frequency times 
static long countDifferentNumbers(long arr[], long P) 
{ 
    // Preprocess factorial values 
    factorial(); 
  
    // Initialize the result and sum 
    // of aint the frequencies 
    long res = 0, X = 0; 
  
    // Calculate the sum of frequencies 
    for (int i = 0; i < 10; i++) 
        X += arr[i]; 
  
    // Putting res equal to x! 
    res = fact[(int)X]; 
  
    // Multiplying res with modular 
    // inverse of X0!, X1!, .., X9! 
    for (int i = 0; i < 10; i++) 
    { 
        if (arr[i] > 1) 
            res = (res * modInverse(fact[(int)arr[i]], P)) % P; 
    } 
  
    return res; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    long arr[] = { 1, 0, 2, 0, 0, 7, 4, 0, 0, 3 }; 
    System.out.println(countDifferentNumbers(arr, MOD)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

