

// Java program to find the Absolute Difference  
// between the Product of Non-Prime numbers  
// and Prime numbers of an Array  
import java.util.*;   
import java.util.Arrays;  
import java.util.Collections; 
  
    
class GFG{ 
  
    // Function to find the difference between  
    // the product of non-primes and the  
    // product of primes of an array.  
    public static int calculateDifference(int []arr, int n)  
    {  
        // Find maximum value in the array  
  
        int max_val = Arrays.stream(arr).max().getAsInt(); 
        
        // USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
        // THAN OR EQUAL TO max_val  
        // Create a boolean array "prime[0..n]". A  
        // value in prime[i] will finally be false  
        // if i is Not a prime, else true.  
        boolean[] prime = new boolean[max_val + 1];  
        Arrays.fill(prime, true); 
        
        // Remaining part of SIEVE  
        prime[0] = false;  
        prime[1] = false;  
        for (int p = 2; p * p <= max_val; p++) {  
        
            // If prime[p] is not changed, then  
            // it is a prime  
            if (prime[p] == true) {  
        
                // Update all multiples of p  
                for (int i = p * 2 ;i <= max_val ;i += p)  
                    prime[i] = false;  
            }  
        }  
        
        // Store the product of primes in P1 and  
        // the product of non primes in P2  
        int P1 = 1, P2 = 1;  
        for (int i = 0; i < n; i++) {  
        
            if (prime[arr[i]]) {  
        
                // the number is prime  
                P1 *= arr[i];  
            }  
            else if (arr[i] != 1) {  
        
                // the number is non-prime  
                P2 *= arr[i];  
            }  
        }  
        
        // Return the absolute difference  
        return Math.abs(P2 - P1);  
    }  
        
    // Driver Code  
    public static void main(String []args)  
    {  
        int[] arr = new int []{ 1, 3, 5, 10, 15, 7 };  
        int n     = arr.length;  
        
        // Find the absolute difference  
        System.out.println(calculateDifference(arr, n));  
        
        System.exit(0); 
    }  
} 
// This code is contributed  
// by Harshit Saini   

