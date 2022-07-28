

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
      
// Function to create Sieve to check primes 
static void SieveOfEratosthenes(boolean prime[],  
                                int p_size) 
{ 
    // False here indicates 
    // that it is not prime 
    prime[0] = false; 
    prime[1] = false; 
  
    for (int p = 2; p * p <= p_size; p++)  
    { 
  
        // If prime[p] is not changed, 
        // then it is a prime 
        if (prime[p]) 
        { 
  
            // Update all multiples of p, 
            // set them to non-prime 
            for (int i = p * 2;  
                     i <= p_size; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the GCD of elements 
// in an array having prime frequency 
static int gcdPrimeFreq(int arr[], int n) 
{ 
    boolean []prime = new boolean[n + 1]; 
    for (int i = 0; i < n + 1; i++)  
        prime[i] = true; 
  
    SieveOfEratosthenes(prime, n + 1); 
  
    int i, j; 
  
    // Map is used to store 
    // element frequencies 
    HashMap<Integer, 
            Integer> mp = new HashMap<Integer, 
                                      Integer>(); 
  
    for (i = 0 ; i < n; i++) 
    { 
        if(mp.containsKey(arr[i])) 
        { 
            mp.put(arr[i], mp.get(arr[i]) + 1); 
        } 
        else
        { 
            mp.put(arr[i], 1); 
        } 
    } 
    int gcd = 0; 
  
    // Traverse the map using iterators 
    for (Map.Entry<Integer, 
                   Integer> it : mp.entrySet()) 
    { 
  
        // Count the number of elements 
        // having prime frequencies 
        if (prime[it.getValue()]) 
        { 
            gcd = __gcd(gcd, it.getKey()); 
        } 
    } 
    return gcd; 
} 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
} 
  
// Driver code 
static public void main ( String []arg) 
{ 
    int arr[] = { 5, 4, 6, 5, 4, 6 }; 
    int n = arr.length; 
  
    System.out.println(gcdPrimeFreq(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

