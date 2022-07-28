

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static int sz = (int) 1e5; 
static boolean []isPrime = new boolean [sz + 1]; 
  
// Function for Sieve of Eratosthenes 
static void sieve() 
{ 
    Arrays.fill(isPrime, true); 
  
    isPrime[0] = isPrime[1] = false; 
  
    for (int i = 2; i * i <= sz; i++) 
    { 
        if (isPrime[i]) 
        { 
            for (int j = i * i; j < sz; j += i) 
            { 
                isPrime[j] = false; 
            } 
        } 
    } 
} 
  
// Function to return the minimum difference 
// between any two prime numbers 
// from the given range [L, R] 
static int minDifference(int L, int R) 
{ 
  
    // Find the first prime from the range 
    int fst = 0; 
    for (int i = L; i <= R; i++)  
    { 
        if (isPrime[i]) 
        { 
            fst = i; 
            break; 
        } 
    } 
  
    // Find the second prime from the range 
    int snd = 0; 
    for (int i = fst + 1; i <= R; i++)  
    { 
        if (isPrime[i]) 
        { 
            snd = i; 
            break; 
        } 
    } 
  
    // If the number of primes in 
    // the given range is < 2 
    if (snd == 0) 
        return -1; 
  
    // To store the minimum difference between 
    // two consecutive primes from the range 
    int diff = snd - fst; 
  
    // Range left to check for primes 
    int left = snd + 1; 
    int right = R; 
  
    // For every integer in the range 
    for (int i = left; i <= right; i++) 
    { 
  
        // If the current integer is prime 
        if (isPrime[i])  
        { 
  
            // If the difference between i 
            // and snd is minimum so far 
            if (i - snd <= diff)  
            { 
                fst = snd; 
                snd = i; 
                diff = snd - fst; 
            } 
        } 
    } 
    return diff; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
      
    // Generate primes 
    sieve(); 
  
    int L = 21, R = 50; 
    System.out.println(minDifference(L, R)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

