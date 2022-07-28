

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the 
// number of days required 
static int numberOfDays(int a, int b, int n) 
{ 
    int Days = b * (n + a) / (a + b); 
  
    return Days; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int a = 10, b = 20, n = 5; 
    System.out.println (numberOfDays(a, b, n)); 
  
} 
} 
  
// This code is contributed by jit_t 

