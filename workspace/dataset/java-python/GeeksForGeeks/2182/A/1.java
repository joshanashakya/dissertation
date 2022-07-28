

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the number 
// of chicks on the nth day 
static int getChicks(int n) 
{ 
  
    int chicks = (int)Math.pow(3, n - 1); 
  
    return chicks; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int n = 3; 
    System.out.println (getChicks(n)); 
} 
} 
  
// This code is contributed by Tushil. 

