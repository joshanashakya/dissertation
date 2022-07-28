

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true 
// if a straight line is possible 
static boolean isPossible(float x, float y, float z) 
{ 
    float a = x * x + y * y + z * z; 
    if (Math.ceil(a) == 1 && Math.floor(a) == 1) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    float l = 0.70710678f, m = 0.5f, n = 0.5f; 
  
    if (isPossible(l, m, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 
// Shashank_Sharma 

