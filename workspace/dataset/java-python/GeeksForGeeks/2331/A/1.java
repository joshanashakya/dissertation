

// Java implementation of the approach 
  
class GFG 
{ 
static int MAX=1000000; 
static boolean[] prime=new boolean[MAX + 1]; 
static void SieveOfEratosthenes() 
{ 
    // Create a boolean array "prime[0..n]" 
    // and initialize all the entries as true. 
    // A value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    //memset(prime, true, sizeof(prime)); 
  
    // 0 and 1 are not prime numbers 
    prime[1] = true; 
    prime[0] = true; 
  
    for (int p = 2; p * p <= MAX; p++) { 
  
        // If prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == false) { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= MAX; i += p) 
                prime[i] = true; 
        } 
    } 
} 
  
// compute the answer 
static void productOfKthPrimes(int arr[], int n, int k) 
{ 
    // count of primes 
    int c = 0; 
  
    // product of the primes 
    int product = 1; 
  
    // traverse the array 
    for (int i = 0; i < n; i++) { 
  
        // if the number is a prime 
        if (!prime[arr[i]]) { 
  
            // increase the count 
            c++; 
  
            // if it is the K'th prime 
            if (c % k == 0) { 
                product *= arr[i]; 
                c = 0; 
            } 
        } 
    } 
    System.out.println(product); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    // create the sieve 
    SieveOfEratosthenes(); 
  
    int n = 5, k = 2; 
   
    int[] arr=new int[]{ 2, 3, 5, 7, 11 }; 
   
    productOfKthPrimes(arr, n, k); 
} 
} 
// This code is contributed by mits 

