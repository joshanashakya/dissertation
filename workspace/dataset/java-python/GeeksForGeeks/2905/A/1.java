

// Java implementation of the approach 
  
class GFG 
{ 
      
static int MAX = (int)(1E5 + 5); 
static long MOD = (long)(1E9 + 7); 
  
// Function that returns true if the num contains 
// a and b digits only 
static boolean check(long num, long a, long b) 
{ 
    while (num > 0)  
    { 
        long rem = num % 10; 
        num /= 10; 
        if (rem != a && rem != b) 
            return false; 
    } 
    return true; 
} 
  
// Modular Exponentiation 
static long power(long x, long y) 
{ 
    long ans = 1; 
    while (y > 0)  
    { 
        if ((y & 1) > 0) 
            ans = (ans * x) % MOD; 
        y >>= 1; 
        x = (x * x) % MOD; 
    } 
    return ans % MOD; 
} 
  
// Function to return the modular inverse 
// of x modulo MOD 
static long modInverse(long x) 
{ 
    return power(x, MOD - 2); 
} 
  
// Function to return the required count 
// of numbers 
static long countNumbers(long n, long a, long b) 
{  
    long[] fact = new long[MAX]; 
    long[] inv = new long[MAX]; 
    long ans = 0; 
  
    // Generating factorials of all numbers 
    fact[0] = 1; 
    for (int i = 1; i < MAX; i++) 
    { 
        fact[i] = (1 * fact[i - 1] * i); 
        fact[i] %= MOD; 
    } 
  
    // Generating inverse of factorials modulo 
    // MOD of all numbers 
    inv[MAX - 1] = modInverse(fact[MAX - 1]); 
    for (int i = MAX - 2; i >= 0; i--) 
    { 
        inv[i] = (inv[i + 1] * (i + 1)); 
        inv[i] %= MOD; 
    } 
  
    // Keeping a as largest number 
    if (a < b) 
    { 
        long x = a; 
        a = b; 
        b = x; 
    } 
  
    // Iterate over all possible values of s and 
    // if it is a valid S then proceed further 
    for (long s = n; s <= 9 * n; s++) 
    { 
        if (!check(s, a, b)) 
            continue; 
  
        // Check for invalid cases in the equation 
        if (s < n * b || (s - n * b) % (a - b) != 0) 
            continue; 
        int numDig = (int)((s - n * b) / (a - b)); 
        if (numDig > n) 
            continue; 
  
        // Find answer using combinatorics 
        long curr = fact[(int)n]; 
        curr = (curr * inv[numDig]) % MOD; 
        curr = (curr * inv[(int)n - numDig]) % MOD; 
  
        // Add this result to final answer 
        ans = (ans + curr) % MOD; 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    long n = 3, a = 1, b = 3; 
    System.out.println(countNumbers(n, a, b)); 
} 
} 
  
// This code is contributed by mits 

