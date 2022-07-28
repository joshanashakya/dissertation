

// Java Program to find the apothem of a  
// regular polygon with given side length 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to find the apothem 
    // of a regular polygon 
    double polyapothem(double n, double a) 
    { 
  
        // Side and side length cannot be negative 
        if (a < 0 && n < 0) 
            return -1; 
  
        // Degree converted to radians 
        return (a / (2 * java.lang.Math.tan((180 / n) 
                * 3.14159 / 180))); 
    } 
  
// Driver code 
public static void main(String args[]) 
{ 
    double a = 9, n = 6; 
    GFG g=new GFG(); 
    System.out.println(g.polyapothem(n, a)); 
} 
  
} 
//This code is contributed by Shivi_Aggarwal 

