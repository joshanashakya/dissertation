

// Java Program to find the biggest Reuleaux triangle 
// inscribed within in a square which in turn 
// is inscribed within an ellipse 
import java.io.*; 
  
class GFG  
{ 
      
// Function to find the biggest reuleaux triangle 
static float Area(float a, float b) 
{ 
  
    // length of the axes cannot be negative 
    if (a < 0 && b < 0) 
        return -1; 
  
    // height of the reuleaux triangle 
    float h = (float)Math.sqrt(((Math.pow(a, 2) + Math.pow(b, 2)) 
                / (Math.pow(a, 2) * Math.pow(b, 2)))); 
  
    // area of the reuleaux triangle 
    float A = (float)(0.70477 * Math.pow(h, 2)); 
  
    return A; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    float a = 5, b = 4; 
    System.out.println(Area(a, b)); 
} 
} 
  
// This code is contributed by anuj_67.. 

