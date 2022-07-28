

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
    static int MAX = 1000000; 
    static int []prime = new int[MAX + 1]; 
  
    // Function to update prime[] 
    // such prime[i] stores the 
    // count of prime numbers <= i 
    static void updatePrimes() 
    { 
        // prime[] marks all prime numbers as true 
        // so prime[i] = 1 if ith number is a prime 
      
        // Initialization 
        for (int i = 2; i <= MAX; i++)  
        { 
            prime[i] = 1; 
        } 
      
        // 0 and 1 are not primes 
        prime[0] = prime[1] = 0; 
      
        // Mark composite numbers as false 
        // and prime numbers as true 
        for (int i = 2; i * i <= MAX; i++)  
        { 
            if (prime[i] == 1)  
            { 
                for (int j = i * i; j <= MAX; j += i)  
                { 
                    prime[j] = 0; 
                } 
            } 
        } 
  
        // Update prime[] such that 
        // prime[i] will store the count of 
        // all the prime numbers <= i 
        for (int i = 1; i <= MAX; i++)  
        { 
            prime[i] += prime[i - 1]; 
        } 
    } 
  
    // Function to return the absolute difference 
    // between the number of primes and the number 
    // of composite numbers in the range [l, r] 
    static int getDifference(int l, int r) 
    { 
      
        // Total elements in the range 
        int total = r - l + 1; 
      
        // Count of primes in the range [l, r] 
        int primes = prime[r] - prime[l - 1]; 
      
        // Count of composite numbers 
        // in the range [l, r] 
        int composites = total - primes; 
      
        // Return the sbsolute difference 
        return (Math.abs(primes - composites)); 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
  
        int queries[][] = { { 1, 10 }, { 5, 30 } }; 
        int q = queries.length; 
        updatePrimes(); 
          
        // Perform queries 
        for (int i = 0; i < q; i++) 
            System.out.println (getDifference(queries[i][0], 
                                queries[i][1])); 
  
    } 
} 
  
// This code is contributed by jit_t 

