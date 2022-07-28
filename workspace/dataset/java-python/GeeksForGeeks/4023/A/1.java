

// Java implementation to find  
// the sum of the given series 
import java.io.*; 
  
class GfG { 
      
// function to find the sum 
// of the given series 
static int sumOfTheSeries(int n) 
{ 
    // required sum 
    return (n * (n + 1) / 2) * 
            (2 * n + 1) / 3; 
} 
      
  
// Driver program to test above 
public static void main (String[] args)  
{ 
    int n = 5; 
      
    System.out.println("Sum = "+  
                sumOfTheSeries(n)); 
  
} 
  
} 
  
// This code is contributed by Gitanjali. 

