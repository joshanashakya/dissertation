

//Java implementation of above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
  
class GFG{  
// Function to find the next perfect cube 
static int nextPerfectCube(int N) 
{ 
    int nextN = (int)Math.floor(Math.cbrt(N)) + 1; 
   
    return nextN * nextN * nextN; 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 35; 
   
    System.out.print(nextPerfectCube(n)); 
} 
} 

