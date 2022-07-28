

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{  
      
//returns the max element 
static int max_element(int a[]) 
{ 
    int m = a[0]; 
    for(int i = 0; i < a.length; i++) 
        m = Math.max(a[i], m); 
      
    return m; 
} 
  
// Function to return the count of primes 
// in the given array 
static int primeCount(int arr[], int n) 
{ 
    // Find maximum value in the array 
    int max_val = max_element(arr); 
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
    // THAN OR EQUAL TO max_val 
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    boolean prime[] = new boolean[max_val + 1]; 
    for (int p = 0; p <= max_val; p++) 
        prime[p] = true;  
  
    // Remaining part of SIEVE 
    prime[0] = false; 
    prime[1] = false; 
    for (int p = 2; p * p <= max_val; p++)  
    { 
  
        // If prime[p] is not changed, then 
        // it is a prime 
        if (prime[p] == true)  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= max_val; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // Find all primes in arr[] 
    int count = 0; 
    for (int i = 0; i < n; i++) 
        if (prime[arr[i]]) 
            count++; 
  
    return count; 
} 
  
// Function to generate the prefix array 
static int[] getPrefixArray(int arr[], int n, int pre[]) 
{ 
  
    // Fill the prefix array 
    pre[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
    { 
        pre[i] = pre[i - 1] + arr[i]; 
    } 
    return pre; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    int arr[] = { 1, 4, 8, 4 }; 
    int n = arr.length; 
  
    // Prefix array of arr[] 
    int pre[]=new int[n]; 
    pre=getPrefixArray(arr, n, pre); 
  
    // Count of primes in the prefix array 
    System.out.println(primeCount(pre, n)); 
  
} 
} 
  
// This code is contributed by Arnab Kundu 

