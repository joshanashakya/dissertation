

// Java Program to find the biggest rectangle  
// which can be inscribed within the ellipse  
import java.util.*;  
import java.lang.*;  
import java.io.*;  
  
class GFG 
{  
      
// Function to find the area  
// of the rectangle  
static float ellipse(float l, float b)  
{  
      
    // a and b cannot be negative  
    if (l < 0 || b < 0)  
        return -1;  
    float x = (float)(3.14 * l * b) / 4; 
  
    return x;  
      
}  
      
// Driver code  
public static void main(String args[])  
{  
    float a = 5, b = 3;  
    System.out.println(ellipse(a, b));  
}  
}  
  
// This code is contributed 
// by Mohit Kumar 

