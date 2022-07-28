

// Java program to find product of 
// primes in given array. 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the product of prime numbers 
// in the given array 
static int primeProduct(int arr[], int n) 
{ 
    // Find maximum value in the array 
    int max_val = Arrays.stream(arr).max().getAsInt(); 
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS 
    // THAN OR EQUAL TO max_val 
    // Create a boolean array "prime[0..n]". A 
    // value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    Vector<Boolean> prime = new Vector<Boolean>(max_val + 1); 
    for(int i = 0; i < max_val + 1; i++) 
        prime.add(i, Boolean.TRUE); 
  
    // Remaining part of SIEVE 
    prime.add(0, Boolean.FALSE); 
    prime.add(1, Boolean.FALSE); 
    for (int p = 2; p * p <= max_val; p++) 
    { 
  
        // If prime[p] is not changed, then 
        // it is a prime 
        if (prime.get(p) == true)  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2; i <= max_val; i += p) 
                prime.add(i, Boolean.FALSE); 
        } 
    } 
  
    // Product all primes in arr[] 
    int prod = 1; 
    for (int i = 0; i < n; i++) 
        if (prime.get(arr[i])) 
            prod *= arr[i]; 
  
    return prod; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
    int n = arr.length; 
  
    System.out.print(primeProduct(arr, n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

