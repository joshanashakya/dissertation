

// Java Program to find the area of the square 
// inscribed within the circle which in turn 
// is inscribed in a hexagon 
  
import java.io.*; 
  
class GFG { 
  
// Function to find the area of the square 
static float area(float a) 
{ 
  
    // side of hexagon cannot be negative 
    if (a < 0) 
        return -1; 
  
    // area of the square 
    float area = (float)Math.pow((a * Math.sqrt(3)) / (Math.sqrt(2)), 2); 
    return area; 
} 
  
// Driver code 
    public static void main (String[] args) { 
        float a = 5; 
    System.out.println( area(a)); 
    } 
} 
// This code is contributed by ajit 

