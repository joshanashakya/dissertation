

   // Java Program to find the area of the triangle 
// inscribed within the rectangle which in turn 
// is inscribed in an ellipse 
  
import java.io.*; 
  
class GFG { 
  
// Function to find the area of the triangle 
static float area(float a, float b) 
{ 
  
    // length of a and b cannot be negative 
    if (a < 0 || b < 0) 
        return -1; 
  
    // area of the triangle 
    float A = a * b; 
    return A; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
    float a = 5, b = 2; 
    System.out.println(area(a, b)); 
    } 
} 
//This code is contributed by anuj_67.. 

