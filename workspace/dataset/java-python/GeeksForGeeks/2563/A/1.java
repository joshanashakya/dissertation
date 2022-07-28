

// Java implementation of the 
// above approach 
import java.util.*; 
  
class GFG{ 
   
// Function to print the largest 
// N-digit even and odd numbers 
// of base B 
static void findNumbers(int n, int b) 
{ 
    // Intialise the Number 
    double even = 0, odd = 0; 
   
    // If Base B is even, then 
    // B^n will give largest 
    // Even number of N+1 digit 
    if (b % 2 == 0) { 
   
        // To get even number of 
        // N digit subtract 2 from 
        // B^n 
        even = Math.pow(b, n) - 2; 
   
        // To get odd number of 
        // N digit subtract 1 from 
        // B^n 
        odd = Math.pow(b, n) - 1; 
    } 
   
    // If Base B is odd, then 
    // B^n will give largest 
    // Odd number of N+1 digit 
    else { 
   
        // To get even number of 
        // N digit subtract 1 from 
        // B^n 
        even = Math.pow(b, n) - 1; 
   
        // To get odd number of 
        // N digit subtract 2 from 
        // B^n 
        odd = Math.pow(b, n) - 2; 
    } 
    System.out.println("Even Number = " +  (int)even ); 
    System.out.print("Odd Number = " +  (int)odd); 
} 
   
// Driver's Code 
public static void main(String[] args) 
{ 
    int N = 2, B = 5; 
   
    // Function to find the 
    // numbers 
    findNumbers(N, B); 
} 
} 
  
// This code is contributed by Rajput-Ji 

