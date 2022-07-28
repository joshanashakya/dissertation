

// Java implementation of the approach 
class GFG 
{ 
  
static int MAX = 100005; 
static boolean []prime = new boolean[MAX]; 
  
// Function for Sieve of Eratosthenes 
static void SieveOfEratosthenes() 
{ 
  
    for (int i = 0; i < MAX; i++) 
        prime[i] = true; 
  
    // false here indicates 
    // that it is not prime 
    prime[0] = false; 
    prime[1] = false; 
  
    for (int p = 2; p * p < MAX; p++)  
    { 
        // If prime[p] is not changed, 
        // then it is a prime 
        if (prime[p]) 
        { 
            // Update all multiples of p, 
            // set them to non-prime 
            for (int i = p * 2; i < MAX; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the count of primes 
// less than or equal to n which can be 
// expressed as the sum of two primes 
static int countPrimes(int n) 
{ 
    SieveOfEratosthenes(); 
  
    // To store the required count 
    int cnt = 0; 
  
    for (int i = 2; i < n; i++) 
    { 
        // If the integer is prime and it 
        // can be expressed as the sum of 
        // 2 and a prime number 
        if (prime[i] && prime[i - 2]) 
            cnt++; 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 11; 
  
    System.out.print(countPrimes(n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

