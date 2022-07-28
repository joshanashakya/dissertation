

// Java implementation of above approach  
import java.util.*; 
import java.lang.Math; 
import java.io.*; 
  
class GFG 
{ 
      
// Function to return the smallest power  
// of 4 greater than or equal to n  
static int nextPowerOfFour(int n)  
{  
    int x = (int)Math.floor(Math.sqrt(Math.sqrt(n)));  
  
    // If n is itself is a power of 4  
    // then return n  
    if (Math.pow(x, 4) == n)  
        return n;  
    else {  
        x = x + 1;  
        return (int)Math.pow(x, 4);  
    }  
}  
  
// Driver code  
public static void main (String[] args)  
              throws java.lang.Exception 
{ 
    int n = 122;  
    System.out.println(nextPowerOfFour(n));  
} 
} 
  
// This code is contributed by nidhiva 

