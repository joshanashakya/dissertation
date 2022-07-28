

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
      
// Function to find the radius 
// of the inscribed circle 
static float circleradius(float l, float b) 
{ 
  
    // the sides cannot be negative 
    if (l < 0 || b < 0) 
        return -1; 
  
    // radius of the circle 
    float r = (float)((l * b) / (2 * Math.sqrt((Math.pow(l, 2) + Math.pow(b, 2))))); 
    return r; 
} 
  
    // Driver code 
    public static void main (String[] args) { 
        float l = 5, b = 3; 
    System.out.print (circleradius(l, b)) ; 
    } 
} 
// This code is contributed by inder_verma.. 

