

// Java implementation of the approach  
import java.util.Arrays;  
import java.util.Collections;  
import java.util.List; 
  
class GFG 
{ 
    static int getMax(int[] A) 
    { 
        int max = Integer.MIN_VALUE; 
        for (int i: A)  
        { 
            max = Math.max(max, i); 
        } 
        return max; 
    } 
  
    // Function to return the bitwise AND of the  
    // sum of primes and the sum of non-primes  
    static int calculateAND(int arr[], int n)  
    {  
        // using Collections.max() to find  
        // maximum element using only 1 line.  
        // Find maximum value in the array  
        int max_val = getMax(arr);  
  
        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
        // THAN OR EQUAL TO max_val  
        // Create a boolean array "prime[0..n]". A  
        // value in prime[i] will finally be false  
        // if i is Not a prime, else true.  
        boolean prime[] = new boolean [max_val + 1]; 
        int i; 
          
        for (i = 0; i < max_val + 1; i++) 
            prime[i] = true; 
              
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
                for ( i = p * 2; i <= max_val; i += p)  
                    prime[i] = false;  
            }  
        }  
      
        // Store the sum of primes in S1 and  
        // the sum of non-primes in S2  
        int S1 = 0, S2 = 0;  
        for (i = 0; i < n; i++) 
        {  
            if (prime[arr[i]])  
            {  
      
                // The number is prime  
                S1 += arr[i];  
            }  
            else if (arr[i] != 1) 
            {  
      
                // The number is not prime  
                S2 += arr[i];  
            }  
        }  
      
        // Return the bitwise AND of the sums  
        return (S1 & S2);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 3, 4, 6, 7 };  
        int n = arr.length;  
      
        System.out.println(calculateAND(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

