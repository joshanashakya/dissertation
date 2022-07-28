

// Java program for computing 
// x^x^x^x.. %m 
class GFG 
{ 
  
// Create an array to store 
// phi or totient values 
static int N = 1000000; 
static long phi[] = new long[N + 5]; 
  
// Function to calculate  
// Euler Totient values 
static void computeTotient() 
{ 
    // indicates not evaluated  
    // yet and initializes for 
    // product formula. 
    for (int i = 1; i <= N; i++) 
        phi[i] = i;  
  
    // Compute other Phi values 
    for (int p = 2; p <= N; p++)  
    { 
  
        // If phi[p] is not  
        // computed already, 
        // then number p is prime 
        if (phi[p] == p)  
        { 
  
            // Phi of a prime number p  
            // is always equal to p-1. 
            phi[p] = p - 1; 
  
            // Update phi values of  
            // all multiples of p 
            for (int i = 2 * p; i <= N; i += p)  
            { 
  
                // Add contribution of p  
                // to its multiple i by  
                // multiplying with (1 - 1/p) 
                phi[i] = (phi[i] / p) *  
                              (p - 1); 
            } 
        } 
    } 
} 
  
// Iterative Function to 
// calculate (x^y)%p in O(log y) 
static long power(long x, long y, long p) 
{ 
    long res = 1; // Initialize result 
  
    x = x % p; // Update x if it is  
               // more than or equal to p 
  
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
  
// Function to calculate 
// (x^x^x^x...k times)%m 
static long calculate(long x, long k, 
                      long mod) 
{ 
    // to store different 
    // mod values 
    long arr[] = new long[N]; 
  
    long count = 0; 
  
    while (mod > 1)  
    { 
        arr[(int)count++] = mod; 
        mod = phi[(int)mod]; 
    } 
  
    long result = 1; 
    long loop = count + 1; 
    arr[(int)count] = 1; 
  
    // run loop in reverse  
    // to calculate result 
    for (int i = (int)Math.min(k, loop) - 1;  
                                i >= 0; i--) 
        result = power(x, result, arr[i]); 
  
    return result; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // compute euler totient 
    // function values 
    computeTotient(); 
  
    long x = 3, k = 2, m = 3; 
  
    // Calling function  
    // to compute answer 
    System.out.println(calculate(x, k, m)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

