

// Java program to check if the 
// given number is prime using 
// Wheel Factorization Method 
import java.util.*; 
  
class GFG{ 
  
// Function to check if a given 
// number x is prime or not 
static void isPrime(int N) 
{ 
    boolean isPrime = true; 
      
        // The Wheel for checking 
    // prime number 
    int []arr = { 7, 11, 13, 17,19, 23, 29, 31 }; 
  
    // Base Case 
    if (N < 2) { 
        isPrime = false; 
    } 
  
    // Check for the number taken 
    // as basis 
    if (N % 2 == 0 || N % 3 == 0
        || N % 5 == 0) { 
        isPrime = false; 
    } 
  
    // Check for Wheel 
    // Here i, acts as the layer 
    // of the wheel 
    for (int i = 0; i < Math.sqrt(N); i += 30) { 
  
        // Check for the list of 
        // Sieve in arr[] 
        for (int c : arr) { 
  
            // If number is greater 
            // than sqrt(N) break 
            if (c > Math.sqrt(N)) { 
                break; 
            } 
  
            // Check if N is a multiple 
            // of prime number in the 
            // wheel 
            else { 
                if (N % (c + i) == 0) { 
                    isPrime = false; 
                    break; 
                } 
            } 
  
            // If at any iteration 
            // isPrime is false, 
            // break from the loop 
            if (!isPrime) 
                break; 
        } 
    } 
  
    if (isPrime) 
        System.out.println("Prime Number"); 
    else
        System.out.println("Not a Prime Number"); 
} 
  
// Driver's Code 
public static void main(String args[]) 
{ 
    int N = 121; 
  
    // Function call for primality 
    // check 
    isPrime(N); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

