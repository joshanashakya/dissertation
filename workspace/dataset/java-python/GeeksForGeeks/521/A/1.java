

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the required 
// prime number from the array 
static int getPrime(int arr[], int n) 
{ 
    // Find maximum value in the array 
    int max_val = Arrays.stream(arr).max().getAsInt(); 
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
    // THAN OR EQUAL TO max_val 
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    Vector<Boolean> prime = new Vector<>(max_val + 1); 
    for(int i = 0; i < max_val + 1; i++) 
        prime.add(i,Boolean.TRUE); 
  
    // Remaining part of SIEVE 
    prime.add(1,Boolean.FALSE); 
    prime.add(2,Boolean.FALSE); 
    for (int p = 2; p * p <= max_val; p++)  
    { 
  
        // If prime[p] is not changed, then 
        // it is a prime 
        if (prime.get(p) == true)  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= max_val; i += p) 
                prime.add(i,Boolean.FALSE); 
        } 
    } 
  
    // To store the maximum prime number 
    int maximum = -1; 
    for (int i = 0; i < n; i++)  
    { 
  
        // If current element is prime 
        // then update the maximum prime 
        if (prime.get(arr[i])) 
        { 
            maximum = Math.max(maximum, arr[i]); 
        } 
              
    } 
  
    // Return the maximum prime 
    // number from the array 
    return maximum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 2, 10, 15, 7, 6, 8, 13 }; 
    int n = arr.length; 
  
    System.out.println(getPrime(arr, n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

