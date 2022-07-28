

// Java Program to find the minimum  
// number of square free divisors  
  
import java.util.Vector; 
  
public class GFG { 
  
// Initializing MAX with SQRT(10 ^ 6)  
    static final int MAX = 1005; 
  
    static void SieveOfEratosthenes(Vector<Integer> primes) { 
        // Create a boolean array "prime[0..n]" and initialize  
        // all entries it as true. A value in prime[i] will  
        // finally be false if i is Not a prime, else true.  
        boolean prime[] = new boolean[MAX]; 
        for (int i = 0; i < prime.length; i++) { 
            prime[i] = true; 
        } 
        for (int p = 2; p * p < MAX; p++) { 
  
            // If prime[p] is not changed, then it is a prime  
            if (prime[p] == true) { 
  
                // Update all multiples of p  
                for (int i = p * 2; i < MAX; i += p) { 
                    prime[i] = false; 
                } 
            } 
        } 
  
        // Print all prime numbers  
        for (int p = 2; p < MAX; p++) { 
            if (prime[p]) { 
                primes.add(primes.size(), p); 
            } 
        } 
    } 
  
// This function returns the minimum number of  
// Square Free divisors  
    static int minimumSquareFreeDivisors(int N) { 
        Vector<Integer> primes = new Vector<>(); 
  
        // Precomputing Prime Factors  
        SieveOfEratosthenes(primes); 
  
        // holds max of max power of all prime factors  
        int max_count = 0; 
        for (int i = 0; i < primes.size() && primes.get(i) *  
                         primes.get(i) <= N; i++) { 
            if (N % primes.get(i) == 0) { 
  
                // holds the max power of current prime factor  
                int tmp = 0; 
                while (N % primes.get(i) == 0) { 
                    tmp++; 
                    N /= primes.get(i); 
                } 
                max_count = Math.max(max_count, tmp); 
            } 
        } 
  
        // If number itself is prime, it will be included  
        // as answer and thus minimum required answer is 1  
        if (max_count == 0) { 
            max_count = 1; 
        } 
  
        return max_count; 
    } 
  
// Driver Code to test above functions  
    public static void main(String[] args) { 
        int N = 24; 
        System.out.println("Minimum Number of Square Free Divisors is "
                + minimumSquareFreeDivisors(N)); 
  
        N = 6; 
        System.out.println("Minimum Number of Square Free Divisors is "
                + minimumSquareFreeDivisors(N)); 
    } 
} 

