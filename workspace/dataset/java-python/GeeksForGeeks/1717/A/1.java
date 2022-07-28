

// Java program to check 
// pentagonal numbers. 
import java.io.*; 
  
class GFG { 
      
// Function to determine if 
// N is pentagonal or not. 
static Boolean isPentagonal(int N)  
{ 
        // Get positive root of 
    // equation P(n) = N. 
    double n = (1 + Math.sqrt(24*N + 1))/6; 
      
    // Check if n is an integral 
    // value of not. To get the 
    // floor of n, type cast to int. 
    return (n - (int) n) == 0; 
} 
    public static void main (String[] args) { 
    int N = 19; 
       
    if (isPentagonal(N))  
        System.out.println( N + " is pentagonal " );     
    else
        System.out.println( N + " is not pentagonal"); 
  
    } 
} 
  
// This code is contributed by Gitanjali. 

