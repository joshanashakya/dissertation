

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    static final int N = 1000005; 
  
    // To check if a number is prime or not 
    static boolean prime[] = new boolean[N]; 
  
    // Sieve of Eratosthenes 
    // function to find all prime numbers 
    static void sieve()  
    { 
        Arrays.fill(prime, true); 
        prime[1] = false; 
        prime[0] = false; 
  
        for (int i = 2; i < N; i++)  
        { 
            if (prime[i])  
            { 
                for (int j = i * 2; j < N; j += i) 
                { 
                    prime[j] = false; 
                } 
            } 
        } 
    } 
  
    // Function to return the sum of 
    // all truncatable primes below n 
    static int sumTruncatablePrimes(int n)  
    { 
        // To store the required sum 
        int sum = 0; 
  
        // Check every number below n 
        for (int i = 2; i < n; i++)  
        { 
  
            int num = i; 
            boolean flag = true; 
  
            // Check from right to left 
            while (num > 0) 
            { 
  
                // If number is not prime at any stage 
                if (!prime[num])  
                { 
                    flag = false; 
                    break; 
                } 
                num /= 10; 
            } 
  
            num = i; 
            int power = 10; 
  
            // Check from left to right 
            while (num / power > 0) 
            { 
  
                // If number is not prime at any stage 
                if (!prime[num % power]) 
                { 
                    flag = false; 
                    break; 
                } 
                power *= 10; 
            } 
  
            // If flag is still true 
            if (flag)  
            { 
                sum += i; 
            } 
        } 
  
        // Return the required sum 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 25; 
        sieve(); 
        System.out.println(sumTruncatablePrimes(n)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

