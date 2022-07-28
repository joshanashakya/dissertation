

// Java Program to find the biggest right circular cylinder 
// that can be fit within a frustum 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to find the biggest right circular cylinder 
 static float cyl(float r, float R, float h) 
{ 
    // radii and height cannot be negative 
    if (h < 0 && r < 0 && R < 0) 
        return -1; 
  
    // radius of right circular cylinder 
    float r1 = r; 
    // height of right circular cylinder 
    float h1 = h; 
    // volume of right circular cylinder 
    float V = (float)(3.14 * Math.pow(r1, 2) * h1); 
  
    return V; 
} 
  
// Driver code 
    public static void main (String[] args) { 
            float r = 7, R = 11, h = 6; 
  
    System.out.print( cyl(r, R, h)); 
    } 
} 
// This code is contributed by anuj_67.. 

