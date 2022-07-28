

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
          
// Function to return the previous 
// fibonacci number 
static int previousFibonacci(int n) 
{ 
    double a = n / ((1 + Math.sqrt(5)) / 2.0); 
    return (int)Math.round(a); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 8; 
    System.out.println(previousFibonacci(n)); 
} 
} 
  
// This code is contributed by ajit.  

