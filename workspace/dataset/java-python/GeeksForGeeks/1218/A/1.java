

// Java Program to find the biggest trapezoid 
// which can be inscribed within the semicircle 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
// Function to find the area 
// of the biggest trapezoid 
static float trapezoidarea(float r) 
{ 
  
    // the radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // area of the trapezoid 
    float a = (3 * (float)Math.sqrt(3)  
            * (float)Math.pow(r, 2)) / 4; 
  
    return a; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    float r = 5; 
    System.out.printf("%.3f",trapezoidarea(r)); 
} 
} 

