

// Java Program to find the biggest right circular cone 
// that can be inscribed within a right circular cone 
// which in turn is inscribed within a cube 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the biggest right circular cone 
static float cone(float a) 
{ 
  
    // side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // radius of right circular cone 
    float r = (float) (a * Math.sqrt(2)) / 3; 
  
    // height of right circular cone 
    float h = (2 * a) / 3; 
  
    // volume of right circular cone 
    float V = (float)(3.14 *Math. pow(r, 2) * h); 
  
    return V; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    float a = 5; 
    System.out.println( cone(a)); 
} 
} 
  
// This code is contributed by anuj_67.. 

