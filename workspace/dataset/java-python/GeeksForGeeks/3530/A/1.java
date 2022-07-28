

// Java Program to find the biggest triangle 
// which can be inscribed within the hexagon 
  
import java.io.*; 
  
class GFG { 
      
// Function to find the area 
// of the triangle 
static double trianglearea(double a) 
{ 
  
    // side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // area of the triangle 
    double area = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 4; 
  
    return area; 
} 
  
    public static void main (String[] args) { 
        double a = 6; 
        System.out.println (trianglearea(a)); 
  
    } 
//This Code is contributed by Sachin.. 
      
} 

