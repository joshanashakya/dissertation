

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
static double PI = (3.14159 / 180); 
  
// Function to return the area of the kite 
static float areaOfKite(int a, int b, double angle) 
{ 
    // convet angle degree to radians 
    angle = angle * PI; 
      
    // use above formula 
    double area = a * b * Math.sin(angle); 
    return (float)area; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
  
    int a = 4, b = 7, angle = 78; 
    System.out.println ("Area of Kite = " + areaOfKite(a, b, angle)); 
} 
} 
  
// This code is contributed by jit_t. 

