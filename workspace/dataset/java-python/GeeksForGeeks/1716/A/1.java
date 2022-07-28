

// Java program to check 
// pentagonal numbers. 
import java.io.*; 
  
class GFG { 
      
// Function to determine 
// if N is pentagonal or not. 
static Boolean isPentagonal(int N)  
{ 
    int i = 1, M; 
       
    do { 
   
        // Substitute values of 
        // i in the formula. 
        M = (3*i*i - i)/2; 
        i += 1; 
    } 
    while ( M < N ); 
       
    return (M == N); 
} 
    public static void main (String[] args) { 
    int N = 12; 
       
    if (isPentagonal(N))  
        System.out.println( N + " is pentagonal " );     
    else
        System.out.println( N + " is not pentagonal"); 
  
    } 
} 
  
// This code is contributed by Gitanjali. 

