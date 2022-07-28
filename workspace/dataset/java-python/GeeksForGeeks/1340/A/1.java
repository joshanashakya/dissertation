

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if any 
// prime number satisfies 
// the given conditions 
static boolean isPossible(int x, int y) 
{ 
  
    // No such prime exists 
    if ((x - y) == 1) 
        return false; 
  
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 100, y = 98; 
  
    if (isPossible(x, y)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

