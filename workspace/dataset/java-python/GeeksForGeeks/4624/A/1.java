

// Java program to find the 
// incenter of a triangle 
  
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        // coordinate of the vertices 
        float x1 = 2, x2 = 1, x3 = 3; 
        float y1 = 2, y2 = 1, y3 = 1; 
        float a = 2, b = 1, c = 1; 
  
        // Formula to calculate in-center 
        float x 
            = (a * x1 + b * x2 + c * x3) / (a + b + c); 
        float y 
            = (a * y1 + b * y2 + c * y3) / (a + b + c); 
  
        // System.out.print(setprecision(3)); 
        System.out.println("Incenter= "
                           + "(" + x + ", " + y + ")"); 
    } 
} 

