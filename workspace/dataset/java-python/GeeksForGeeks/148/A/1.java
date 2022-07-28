

// Java program to find the Absolute  
// Difference between the Sum of 
// Non-Prime numbers and Prime numbers 
// of an Array 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the difference  
// between the sum of non-primes  
// and the sum of primes of an array. 
static int CalculateDifference(int arr[],  
                               int n) 
{ 
    // Find maximum value in the array 
    int max_val = Integer.MIN_VALUE; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] > max_val) 
            max_val = arr[i]; 
    } 
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS  
    // LESS THAN OR EQUAL TO max_val 
    // Create a boolean array "prime[0..n]".  
    // A value in prime[i] will finally be  
    // false if i is Not a prime, else true. 
    boolean []prime = new boolean[max_val + 1]; 
      
    for(int i = 0; i <= max_val; i++) 
        prime[i] = true; 
  
    // Remaining part of SIEVE 
    prime[0] = false; 
    prime[1] = false; 
    for (int p = 2;  
             p * p <= max_val; p++)  
    { 
  
        // If prime[p] is not changed, 
        // then it is a prime 
        if (prime[p] == true)  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2;  
                     i <= max_val; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // Store the sum of primes in  
    // S1 and the sum of non  
    // primes in S2 
    int S1 = 0, S2 = 0; 
    for (int i = 0; i < n; i++)  
    { 
  
        if (prime[arr[i]])  
        { 
  
            // the number is prime 
            S1 += arr[i]; 
        } 
        else if (arr[i] != 1)  
        { 
  
            // the number is non-prime 
            S2 += arr[i]; 
        } 
    } 
  
    // Return the absolute difference 
    return Math.abs(S2 - S1); 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
  
    // Get the array 
    int arr[] = { 1, 3, 5, 10, 15, 7 }; 
    int n = arr.length; 
  
    // Find the absolute difference 
    System.out.println(CalculateDifference(arr, n)); 
} 
} 
  
// This code is contributed 
// by ihritik 

