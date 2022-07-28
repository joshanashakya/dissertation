

// Java program to find length of the longest 
// subarray with all primes except possibily 
// one. 
import java.util.*; 
  
class GFG 
{ 
      
static int N = 100000; 
  
static boolean prime[] = new boolean[N]; 
  
static void SieveOfEratosthenes() 
{ 
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true. A value 
    // in prime[i] will finally be false if i is  
    // Not a prime, else true. 
    Arrays.fill(prime,true); 
  
    for (int p = 2; p * p <= N; p++)  
    { 
  
        // If prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == true) 
        { 
              
            // Update all multiples of p 
            for (int i = p * 2; i < N; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
  
static int longestPrimeSubarray(int arr[], int n) 
{ 
    int []left = new int[n];int[] right = new int[n]; 
    int primecount = 0, res = 0; 
  
    // left array used to count number of  
    // continuous prime numbers starting  
    // from left of current element 
    for (int i = 0; i < n; i++) 
    { 
        left[i] = primecount; 
        if (prime[arr[i]]) 
        { 
            primecount++; 
        } 
        else
            primecount = 0; 
    } 
  
    // right array used to count number of  
    // continuous prime numbers starting from  
    // right of current element 
    primecount = 0; 
    for (int i = n - 1; i >= 0; i--)  
    { 
        right[i] = primecount; 
        if (prime[arr[i]]) 
        { 
            primecount++; 
        } 
        else
            primecount = 0; 
    } 
  
    for (int i = 0; i < n; i++)  
        res = Math.max(res, left[i] + right[i]); 
      
    return res; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 2, 8, 5, 7, 9, 5, 7 }; 
  
    // used of SieveOfEratosthenes method to  
    // detect a number prime or not 
    SieveOfEratosthenes(); 
    int n = arr.length; 
  
    System.out.println("largest length of PrimeSubarray "
        + longestPrimeSubarray(arr, n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

