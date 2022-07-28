

// Java program to find  
// GCD of a^n and b. 
class GFG 
{ 
/* Iterative Function to calculate  
(x^y)%p in O(log y) */
static long modPower(long x, long y,  
                             long p) 
{ 
    long res = 1; // Initialize result 
  
    x = x % p; // Update x if it is more  
               // than or equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply  
        // x with result 
        if ((y & 1) > 0) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1; // y = y/2 
        x = (x * x) % p;  
    } 
    return res; 
} 
  
// Finds GCD of a and b 
static long gcd(long a, long b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
} 
  
// Finds GCD of a^n and c 
static long gcdPow(long a,  
                   long n, long c) 
{ 
    // check if c is a divisor of a 
    if (a % c == 0) 
        return c; 
  
    // First compute (a^n) % c 
    long modexpo = modPower(a, n, c); 
  
    // Now simply return GCD  
    // of modulo power and c. 
    return gcd(modexpo, c); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long a = 10248585,  
         n = 1000000, c = 12564; 
    System.out.println(gcdPow(a, n, c)); 
} 
} 
  
// This code is contributed by mits 

