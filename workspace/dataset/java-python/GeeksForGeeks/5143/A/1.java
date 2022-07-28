

// Java program to print all primes between 1 
// to N in reverse order using Sieve of 
// Eratosthenes 
import java.io.*; 
import java.util.*; 
  
class GFG { 
    static void reverseorder(int n) 
    { 
  
        // Create a boolean array "prime[0..n]" and 
        // initialize all entries it as true. A value 
        // in prime[i] will finally be false if i 
        // is Not a prime, else true. 
        boolean prime[] = new boolean[n + 1]; 
        for (int i = 0; i < n; i++) 
            prime[i] = true; 
  
        for (int p = 2; p * p <= n; p++) { 
  
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[p] == true) { 
  
                // Update all multiples of p 
                for (int i = p * 2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // Print all prime numbers 
        for (int i = n; i >= 2; i--) 
            if (prime[i] == true) 
                System.out.print(i + " "); 
    } 
  
    // Driver Program to test above function 
    public static void main(String args[]) 
    { 
        // static input 
        int N = 25; 
        // To display 
        System.out.println("Prime number in reverse order"); 
  
        if (N == 1) 
            System.out.println("No prime no exist in this range"); 
        else
            reverseorder(N); // calling the function 
    } 
} 

