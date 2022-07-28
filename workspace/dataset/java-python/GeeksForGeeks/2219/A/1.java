

// JAVA Code for Break a number such that sum 
// of maximum divisors of all parts is minimum 
import java.util.*; 
  
class GFG { 
  
    // Function to check if a number is 
    // prime or not. 
    static boolean isPrime(int n) 
    { 
        int i = 2; 
  
        while (i * i <= n) { 
            if (n % i == 0) 
                return false; 
            i++; 
        } 
        return true; 
    } 
  
    static int minimumSum(int n) 
    { 
        if (isPrime(n)) 
            return 1; 
  
        // If n is an even number (we can 
        // write it as sum of two primes) 
        if (n % 2 == 0) 
            return 2; 
  
        // If n is odd and n-2 is prime. 
        if (isPrime(n - 2)) 
            return 2; 
  
        // If n is odd, n-3 must be even. 
        return 3; 
    } 
  
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        int n = 4; 
        System.out.println(minimumSum(n)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

