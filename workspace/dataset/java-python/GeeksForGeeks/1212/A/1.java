

// Java Program to find the area of the circle 
// inscribed within the rectangle which in turn 
// is inscribed in a semicircle 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to find the area of the circle 
static float area(float r) 
{ 
  
    // radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // area of the circle 
    float area = (float)(3.14 * Math.pow(r / (2 * Math.sqrt(2)), 2)); 
    return area; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            float a = 5; 
    System.out.println( area(a)); 
    } 
} 
  
 // This code is contributed by ajit 

