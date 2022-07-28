

// Java Program to find the biggest square 
// which can be inscribed within the ellipse 
import java.io.*; 
  
class GFG { 
  
  
// Function to find the area 
// of the square 
static float squarearea(float a, float b) 
{ 
  
    // a and b cannot be negative 
    if (a < 0 || b < 0) 
        return -1; 
  
    // area of the square 
    float area = 4 *(float) ((Math.pow(a, 2) + Math.pow(b, 2)) 
                    / (Math.pow(a, 2) * Math.pow(b, 2))); 
  
    return area; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        float a = 4, b = 2; 
    System.out.println( squarearea(a, b)); 
  
    } 
} 
// This code is contributed by inder_verma. 

