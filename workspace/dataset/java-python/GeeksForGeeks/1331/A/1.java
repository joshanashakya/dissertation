

// Java program to represent a number as a 
// sum of maximum possible number of 
// Prime Numbers 
  
import java.io.*; 
  
class GFG { 
     
// Function to represent a number as a 
// sum of the maximum possible number 
// of Prime Numbers 
static void printAsMaximalPrimeSum(int n) 
{ 
    // If n is odd, print one 3 
    if (n % 2 == 1) { 
        System.out.print( "3 "); 
        n -= 3; 
    } 
  
    // Now n is even, print 2 n/2 times 
    while (n>0) { 
        System.out.print( "2 "); 
        n -= 2; 
    } 
} 
  
       // Driver Code 
    public static void main (String[] args) { 
    int n = 5; 
    printAsMaximalPrimeSum(n); 
    } 
} 
  
// This Code is contributed by inder_verma.. 

