

// Java  Program to find the area of a regular 
// polygon with given side length 
  
import java.io.*; 
  
class GFG { 
    
  
// Function to find the area 
// of a regular polygon 
static float polyarea(float n, float a) 
{ 
    // Side and side length cannot be negative 
    if (a < 0 && n < 0) 
        return -1; 
  
    // Area 
    // degree converted to radians 
    float A = (a * a * n) /(float) (4 * Math.tan((180 / n) * 3.14159 / 180)); 
  
    return A; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    float a = 9, n = 6; 
  
    System.out.println( polyarea(n, a)); 
    } 
} 
// This code is contributed by inder_verma.. 

