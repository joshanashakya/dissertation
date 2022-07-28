

// Java Program to find the area 
// of a regular polygon with given radius 
  
import java.util.*; 
class GFG 
{ 
    // Function to find the area 
    // of a regular polygon 
    static double polyarea(double n, double r) 
    { 
        // Side and radius cannot be negative 
        if (r < 0 && n < 0) 
            return -1; 
      
        // Area 
        // degree converted to radians 
        double A = ((r * r * n) * Math.sin((360 / n) * 3.14159 / 180)) / 2; 
      
        return A; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        float r = 9, n = 6; 
      
        System.out.println(polyarea(n, r)); 
      
          
    } 
} 
  
// This code is contributed 
// By ihritik (Hritik Raj) 

