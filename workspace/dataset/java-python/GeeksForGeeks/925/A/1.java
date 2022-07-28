

// Java Program to find product 
// of prime numbers between 1 to n 
import java.util.Arrays; 
  
class GFG { 
      
    // Returns product of primes in range from 
    // 1 to n. 
    static long ProdOfPrimes(int n) 
    { 
                
        // Array to store prime numbers 
        boolean prime[]=new boolean[n + 1]; 
      
        // Create a boolean array "prime[0..n]" 
        // and initialize all entries it as true. 
        // A value in prime[i] will finally be 
        // false if i is Not a prime, else true. 
        Arrays.fill(prime, true); 
      
        for (int p = 2; p * p <= n; p++) { 
      
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[p] == true) { 
      
                // Update all multiples of p 
                for (int i = p * 2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
      
        // Return product of primes generated 
        // through Sieve. 
        long prod = 1; 
  
        for (int i = 2; i <= n; i++) 
            if (prime[i]) 
                prod *= i; 
  
        return prod; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
          
        int n = 10; 
          
        System.out.print(ProdOfPrimes(n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

