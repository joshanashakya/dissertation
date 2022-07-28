

// Java implementation of the approach  
import java.util.Arrays; 
  
class GFG 
{ 
  
    // Function to return  
    // max_element from an array 
    static int max_element(int[] arr)  
    { 
        int max = arr[0]; 
  
        for (int ele : arr) 
            if (max < ele) 
                max = ele; 
  
        return max; 
    } 
  
    // Function to find the absolute difference 
    // between the XOR of non-primes and the 
    // XOR of primes in the given array 
    static int calculateDifference(int[] arr, int n)  
    { 
  
        // Find maximum value in the array 
        int max_val = max_element(arr); 
  
        // USE SIEVE TO FIND ALL PRIME NUMBERS  
        // LESS THAN OR EQUAL TO max_val 
        // Create a boolean array "prime[0..n]".  
        // A value in prime[i] will finally be false 
        // if i is Not a prime, else true. 
        boolean[] prime = new boolean[max_val + 1]; 
        Arrays.fill(prime, true); 
  
        // Remaining part of SIEVE 
        prime[0] = false; 
        prime[1] = false; 
        for (int p = 2; p * p <= max_val; p++)  
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
  
        // Store the XOR of primes in X1 and 
        // the XOR of non primes in X2 
        int x1 = 1, x2 = 1; 
        for (int i = 0; i < n; i++)  
        { 
            if (prime[arr[i]]) 
  
                // The number is prime 
                x1 ^= arr[i]; 
            else if (arr[i] != 1) 
  
                // The number is non-prime 
                x2 ^= arr[i]; 
        } 
  
        // Return the absolute difference 
        return Math.abs(x1 - x2); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] arr = { 1, 3, 5, 10, 15, 7 }; 
        int n = arr.length; 
  
        // Find the absolute difference 
        System.out.println(calculateDifference(arr, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

