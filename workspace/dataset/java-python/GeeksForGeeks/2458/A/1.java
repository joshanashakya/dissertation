

// Java Program to find the biggest rectangle 
// which can be inscribed within the ellipse 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{  
// Function to find the area 
// of the rectangle 
static float rectanglearea(float a, float b) 
{ 
   
    // a and b cannot be negative 
    if (a < 0 || b < 0) 
        return -1; 
   
    // area of the rectangle 
    return 2 * a * b; 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    float a = 10, b = 8; 
    System.out.println(rectanglearea(a, b)); 
} 
} 

