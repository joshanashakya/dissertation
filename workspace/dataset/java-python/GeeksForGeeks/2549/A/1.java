

// Java program for Digit Product Sequence 
  
// function to produce and print Digit 
// Product Sequence 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
    public static void digit_product_Sum(int N) 
    { 
        // Array which store sequence 
        int a[] = new int[N+1] ; 
  
        // Temporary variable to store product 
        int product = 1; 
  
        // Initialize first element of the 
        // array with 1 
        a[0] = 1; 
  
        // Run a loop from 1 to N. Check if 
        // previous number is single digit or 
        // not. If yes then product = 1 else 
        // take modulus. Then again check if 
        // previous number is sigle digit or 
        // not if yes then store previous number, 
        // else store its first value Then for 
        // every i store value in the array. 
        for (int i = 1; i <= N; i++) 
        { 
            product = a[i - 1] / 10; 
  
            if (product == 0) 
                product = 1; 
            else
                product = a[i - 1] % 10; 
  
            int val = a[i - 1] / 10; 
  
            if (val == 0) 
                val = a[i - 1]; 
  
            a[i] = a[i - 1] + (val * product); 
        } 
  
        // Print sequence 
        for (int i = 0; i < N; i++) 
            System.out.print(a[i] + " "); 
    } 
  
// Driver Code 
    public static void main(String[] args) 
    { 
        // Value of N 
        int N = 10; 
  
        // Calling function 
        digit_product_Sum(N); 
  
    } 
} 
// Code contributed by Mohit Gupta_OMG <(0_o)> 

