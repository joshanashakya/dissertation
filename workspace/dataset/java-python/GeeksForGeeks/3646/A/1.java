

// Java Program to find the area of a circle 
// inscribed in a polygon 
import java.io.*; 
  
class GFG { 
  
    // Function to find the area 
    // of a regular polygon 
    static float InscribedCircleArea(float n, float a) 
    { 
        // Side and side length cannot be negative 
        if (a < 0 && n < 0) 
            return -1; 
  
        // degree converted to radians 
        float r = a / (float)(2 * Math.tan((180 / n) * 3.14159 / 180)); 
  
        // area of circle 
        float Area = (float)(3.14) * (r) * (r); 
  
        return Area; 
    } 
  
    // Driver code 
  
    public static void main(String[] args) 
    { 
  
        // no.  of sides 
        float n = 6; 
  
        // side length 
        float a = 4; 
  
        System.out.println(InscribedCircleArea(n, a)); 
    } 
} 

