

// Java program to find Edge Cover 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
// Function that calculates Edge Cover 
static int edgeCover(int n) 
{ 
    int result = 0; 
   
    result = (int)Math.ceil((double)n / 2.0); 
   
    return result; 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 5; 
   
    System.out.print(edgeCover(n)); 
} 
  
} 

