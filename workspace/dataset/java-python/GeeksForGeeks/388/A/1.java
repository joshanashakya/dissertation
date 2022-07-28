

// Java tp implement above approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to get final value of X and Y 
static void alter(long x, long y) 
{ 
    // Following the sequence but by  
    // replacing minus with modulo 
    while (true)  
    { 
  
        // Step 1 
        if (x == 0 || y == 0) 
            break; 
  
        // Step 2 
        if (x >= 2 * y) 
            x = x % (2 * y); 
  
        // Step 3 
        else if (y >= 2 * x) 
            y = y % (2 * x); 
  
        // Otherwise terminate 
        else
            break; 
    } 
  
    System.out.println("X = " + x + ", " +  
                       "Y = " + y); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    // Get the initial X and Y values 
    long x = 12, y = 5; 
      
    // Find the result 
    alter(x, y); 
} 
} 
  
// This code is contributed by  
// shk 

