

// Java program to find 
// foot of perpendicular 
// of a point in a 3 D plane. 
import java.util.*; 
import java.text.*; 
  
class solution 
{ 
  
// Function to find foot of perpendicular 
static void foot(float a, float b, 
        float c, float d, 
        float x1, float y1, 
        float z1) 
{ 
    float k = (-a * x1 - b * y1 - c * z1 - d) / (float)(a * a + b * b + c * c); 
    float x2 = a * k + x1; 
    float y2 = b * k + y1; 
    float z2 = c * k + z1; 
    DecimalFormat form = new DecimalFormat("0.0"); 
    System.out.print(" x2 = " +form.format(x2)); 
    System.out.print(" y2 = " +form.format(y2)); 
    System.out.print( " z2 = " +form.format(z2)); 
} 
  
// Driver Code 
public static void main(String arr[]) 
{ 
    float a = 1; 
    float b = -2; 
    float c = 0; 
    float d = 0; 
    float x1 = -1; 
    float y1 = 3; 
    float z1 = 4; 
  
    // function call 
    foot(a, b, c, d, x1, y1, z1); 
  
} 
} 

