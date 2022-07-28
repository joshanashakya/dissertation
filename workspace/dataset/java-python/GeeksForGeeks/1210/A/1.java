

// Java Program to find the area of the square 
// inscribed within the circle which in turn 
// is inscribed in an equilateral triangle 
  
import java.io.*; 
  
class GFG { 
     
  
// Function to find the area of the square 
static float area(float a) 
{ 
  
    // a cannot be negative 
    if (a < 0) 
        return -1; 
  
    // area of the square 
    float area = (float)Math.sqrt(a) / 6; 
  
    return area; 
} 
  
// Driver code 
    public static void main (String[] args) { 
        float a = 10; 
    System.out.println( area(a)); 
// This code is contributed  
// by  inder_verma.. 
    } 
} 

