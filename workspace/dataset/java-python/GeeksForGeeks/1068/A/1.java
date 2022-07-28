

// Java program to find sum of 
// non-primes in given array 
import java.util.*; 
  
class GFG 
{ 
  
//returns the maximum element 
static int max_element(int arr[]) 
{ 
    int max_e = Integer.MIN_VALUE; 
    for(int i = 0; i < arr.length; i++) 
    { 
    max_e = Math.max(max_e, arr[i]);  
    } 
    return max_e; 
} 
  
// Function to return the sum of 
// non-prime elements from the array 
static int nonPrimeSum(int arr[], int n) 
{ 
    // Find maximum value in the array 
    int max_val = max_element(arr); 
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
    // THAN OR EQUAL TO max_val 
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    boolean prime[] = new boolean[max_val + 1]; 
      
    for(int i = 0; i < prime.length; i++) 
    prime[i] = true; 
  
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
  
    // Sum all non-prime elements in arr[] 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        if (!prime[arr[i]]) 
            sum += arr[i]; 
  
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    int arr[] = { 1, 3, 7, 4, 9, 8 }; 
    int n = arr.length; 
    System.out.println( nonPrimeSum(arr, n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

