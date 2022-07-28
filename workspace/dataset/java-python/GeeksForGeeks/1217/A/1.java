

// Java Program to find the area of  
// an inscribed circle in a square. 
import java.io.*; 
  
class GFG { 
      
    static double PI = 3.14; 
      
    // Function to find area of an  
    // inscribed circle in a square. 
    static double areaOfInscribedCircle(float a) 
    { 
        return ( PI / 4 ) * a * a; 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        float a = 8; 
      
        System.out.println("Area of an inscribed"
        + " circle: " + areaOfInscribedCircle(a)); 
    } 
} 

