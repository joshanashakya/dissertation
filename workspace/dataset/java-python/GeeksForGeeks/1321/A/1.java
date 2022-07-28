

// Java program to check Primorial prime 
  
import java.util.*; 
  
class GFG { 
  
    static final int MAX = 1000000; 
    static Vector<Integer> arr = new Vector<Integer>(); 
    static boolean[] prime = new boolean[MAX]; 
  
    // Function to get the prime numbers 
    static void SieveOfEratosthenes() 
    { 
  
        // make all entries of boolean array 'prime' 
        // as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
  
        for (int i = 0; i < MAX; i++) 
            prime[i] = true; 
  
        for (int p = 2; p * p < MAX; p++) { 
  
            // If prime[p] is not changed, then it is a prime 
            if (prime[p] == true) { 
  
                // Update all multiples of p 
                for (int i = p * 2; i < MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // store all prime numbers 
        // to vector 'arr' 
        for (int p = 2; p < MAX; p++) 
            if (prime[p]) 
                arr.add(p); 
    } 
  
    // Function to check the number for Primorial prime 
    static boolean isPrimorialPrime(int n) 
    { 
        // If n is not prime 
        // Then return false 
        if (!prime[n]) 
            return false; 
  
        long product = 1; 
        int i = 0; 
        while (product < n) { 
  
            // Multiply next prime number 
            // and check if product + 1 = n or product -1=n 
            // holds or not 
            product = product * arr.get(i); 
  
            if (product + 1 == n || product - 1 == n) 
                return true; 
  
            i++; 
        } 
  
        return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        SieveOfEratosthenes(); 
  
        int n = 31; 
  
        if (isPrimorialPrime(n)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

