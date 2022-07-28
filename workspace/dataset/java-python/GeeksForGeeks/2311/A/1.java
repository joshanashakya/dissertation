

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to return the digit product of n 
static int digitProduct(int n) 
{ 
    int prod = 1; 
    while (n > 0)  
    { 
        prod = prod * (n % 10); 
        n = n / 10; 
    } 
    return prod; 
} 
  
// Function to print all multiplicative primes <= n 
static void printMultiplicativePrimes(int n) 
{ 
    // Create a boolean array "prime[0..n+1]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    boolean prime[] = new boolean[n + 1 ]; 
    for(int i = 0; i <= n; i++) 
     prime[i] = true; 
  
    prime[0] = prime[1] = false; 
    for (int p = 2; p * p <= n; p++)  
    { 
  
        // If prime[p] is not changed, then 
        // it is a prime 
        if (prime[p])  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
  
    for (int i = 2; i <= n; i++) 
    { 
  
        // If i is prime and its digit sum is also prime 
        // i.e. i is a multiplicative prime 
        if (prime[i] && prime[digitProduct(i)]) 
            System.out.print( i + " "); 
    } 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 10; 
        printMultiplicativePrimes(n); 
    } 
} 
  
// This code is contributed by shs.. 

