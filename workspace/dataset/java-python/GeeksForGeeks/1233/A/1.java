

// Java Program to calculate  
// surface area of Octahedron. 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
// utility Function 
static double surface_area_octahedron(double side) 
{ 
    return (2*(Math.sqrt(3))*(side*side)); 
} 
    public static void main (String[] args) { 
    double side = 7; 
    System.out.println("Surface area of octahedron ="
                    + surface_area_octahedron(side));  
      
    } 
} 
  
// This code is contributed by Gitanjali. 

