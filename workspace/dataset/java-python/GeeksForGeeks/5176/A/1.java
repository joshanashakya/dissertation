

// Java code to print prime Quarduplet in a range 
import java.util.Arrays; 
import java.util.Collections; 
  
class GFG { 
  
    static final int MAX = 1000000; 
    static boolean[] prime = new boolean[MAX]; 
  
    // utility function to generate prime number 
    public static void sieve() 
    { 
        // Sieve Of Eratosthenes for generating 
        // prime number. 
  
        // memset(prime, true, sizeof(prime)); 
        Arrays.fill(prime, true); 
  
        for (int p = 2; p * p < MAX; p++) { 
  
            // If prime[p] is not changed, 
            // then it is a prime 
            if (prime[p] == true) { 
  
                // Update all multiples of p 
                for (int i = p * 2; i < MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
  
    // function to print prime Quadruplet 
    static void printPrimeQuad(int n) 
    { 
        for (int i = 0; i < n - 7; i++) { 
  
            if (prime[i] && prime[i + 2] && prime[i + 6] 
                && prime[i + 8]) { 
  
                System.out.println(i + " " + (i + 2) + " "
                                   + (i + 6) + " " + (i + 8)); 
            } 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 20; 
  
        sieve(); 
  
        printPrimeQuad(n); 
    } 
} 

