

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Vector to store the primes 
static Vector<Long> pr = new Vector<>(); 
  
// Create a boolean array "prime[0..n]" 
static boolean prime[] = new boolean[10000000 + 1]; 
static void sieve(long n) 
{ 
  
    // Initialize along prime values to be true 
    for (int i = 2; i <= n; i += 1)  
    { 
        prime[i] = true; 
    } 
  
    for (int p = 2; (int)p * (int)p <= n; p++) 
    { 
  
        // If prime[p] is not changed then it is a prime 
        if (prime[p] == true) 
        { 
  
            // Update along multiples of p greater than or 
            // equal to the square of it 
            // numbers which are multiple of p and are 
            // less than p^2 are already been marked 
            for (int i = (int)p * (int)p; i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // Print all prime numbers 
    for (int p = 2; p <= n; p++) 
        if (prime[p]) 
            pr.add((long)p); 
} 
  
// Function to return the semi-prime sum 
static long SemiPrimeSum(long N) 
{ 
  
    // Variable to store the sum of semi-primes 
    long ans = 0; 
  
    // Iterate over the prime values 
    for (int i = 0; i < pr.size(); i += 1)  
    { 
  
        for (int j = i; j < pr.size(); j += 1)  
        { 
  
            // Break the loop once the product exceeds N 
            if ((long)pr.get(i) * (long)pr.get(j) > N) 
                break; 
  
            // Add valid products which are less than 
            // or equal to N 
            // each product is a semi-prime number 
            ans += (long)pr.get(i) * (long)pr.get(j); 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long N = 6; 
  
    sieve(N); 
  
    System.out.println(SemiPrimeSum(N)); 
} 
} 
  
// This code is contributed by Princi Singh 

