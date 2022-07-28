

// Java program to find the length of 
// Longest Prime Subsequence in an Array 
import java.util.*; 
  
class GFG 
{ 
static final int N = 100005; 
   
// Function to create Sieve 
// to check primes 
static void SieveOfEratosthenes( 
    boolean prime[], int p_size) 
{ 
   
    // False here indicates 
    // that it is not prime 
    prime[0] = false; 
    prime[1] = false; 
   
    for (int p = 2; p * p <= p_size; p++) { 
   
        // If prime[p] is not changed, 
        // then it is a prime 
        if (prime[p]) { 
   
            // Update all multiples of p, 
            // set them to non-prime 
            for (int i = p * 2; 
                 i <= p_size; 
                 i += p) 
                prime[i] = false; 
        } 
    } 
} 
   
// Function to find the longest subsequence 
// which contain all prime numbers 
static int longestPrimeSubsequence(int arr[], int n) 
{ 
    boolean []prime = new boolean[N + 1]; 
    Arrays.fill(prime, true); 
   
    // Precompute N primes 
    SieveOfEratosthenes(prime, N); 
   
    int answer = 0; 
   
    // Find the length of 
    // longest prime subsequence 
    for (int i = 0; i < n; i++) { 
        if (prime[arr[i]]) { 
            answer++; 
        } 
    } 
   
    return answer; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 4, 11, 2, 9, 21 }; 
    int n = arr.length; 
   
    // Function call 
    System.out.print(longestPrimeSubsequence(arr, n) 
         +"\n");  
} 
} 
  
// This code is contributed by 29AjayKumar 

