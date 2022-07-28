

// Java program to find the minimum numbers 
// required to get to S 
import java.io.*; 
  
class GFG { 
      
  
// Function to find the minimum 
// numbers required to get to S 
static int minimumNumbers(int n, int s) 
{ 
    if ((s % n)>0) 
        return s / n + 1; 
    else
        return s / n; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
        int n = 5; 
    int s = 11; 
    System.out.println(minimumNumbers(n, s)); 
    } 
} 
// This code is contributed by shs.. 

