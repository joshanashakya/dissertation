

// Java Program to find the radius 
// of the circumcircle of the given 
// rectangle 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Function to find the radius 
// of the circumcircle 
static float findRadiusOfcircumcircle(float l, 
                                      float b) 
{ 
  
    // the sides cannot be negative 
    if (l < 0 || b < 0) 
        return -1; 
  
    // Radius of the circumcircle 
    float radius = (float) Math.sqrt(Math.pow(l, 2) + 
                           Math.pow(b, 2)) / 2; 
  
    // Return the radius 
    return radius; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    // Get the sides of the traingle 
    float l = 4, b = 3; 
    // Find the radius of the circumcircle 
    System.out.println(findRadiusOfcircumcircle(l, b)); 
} 
} 
  
// This code is contributed by Subhadeep 

