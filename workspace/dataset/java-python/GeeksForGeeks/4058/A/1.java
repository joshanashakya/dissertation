

// Java Program to find sum of series 
// 1^2 + 3^2 + 5^2 + . . . + (2*n - 1)^2. 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
// Function to find sum of series. 
static int sumOfSeries(int n) 
{ 
   // Formula to find sum of series. 
    return (n * (2 * n - 1) * (2 * n + 1)) / 3; 
  
} 
  
// Driver function 
   public static void main (String[] args) { 
   int n=10; 
    System.out.println(sumOfSeries(n));  
      
} 
  
} 
  
// This code is contributed by Gitanjali. 

