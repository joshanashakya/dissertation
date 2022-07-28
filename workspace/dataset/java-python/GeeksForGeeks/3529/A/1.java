

// Java Program to find the biggest square 
// which can be inscribed within the semicircle 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to find the area 
// of the squaare 
static float squarearea(float r) 
{ 
  
    // the radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // area of the square 
    float a = 4 * (float)(Math.pow(r, 2) / 5); 
  
    return a; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
         float r = 5; 
    System.out.println( squarearea(r)); 
    } 
} 
// This code is contributed by chandan_jnu. 

