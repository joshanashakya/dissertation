

// Java Program to find  
// area of Octagon. 
import java.io.*; 
  
class GFG 
{    
    // utility function 
    static double areaOctagon(double side) 
    { 
    return (float)(2 * (1 + Math.sqrt(2))  
                          * side * side); 
    } 
      
    // driver code 
    public static void main(String arg[]) 
    { 
        double side = 4; 
        System.out.print("Area of Regular Octagon = "  
                          + areaOctagon(side)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

