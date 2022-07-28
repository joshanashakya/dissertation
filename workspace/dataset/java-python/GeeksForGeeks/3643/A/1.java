

// Java Program to find the radius 
// of the circumcircle of the given polygon 
  
import java.io.*; 
  
class GFG { 
    
// Function to find the radius 
// of the circumcircle 
static float findRadiusOfcircumcircle(float n, float a) 
{ 
  
    // these cannot be negative 
    if (n < 0 || a < 0) 
        return -1; 
  
    // Radius of the circumcircle 
    float radius = (float)(a / Math.sqrt(2 - (2 * Math.cos(360 / n)))); 
  
    // Return the radius 
    return radius; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        float n = 5, a = 6; 
  
    // Find the radius of the circumcircle 
    System.out.println( findRadiusOfcircumcircle(n, a)) ; 
  
    } 
} 
// This code is contributed  
// by anuj_67.. 

