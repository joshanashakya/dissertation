

// Java Program to find the biggest Reuleaux triangle 
// inscribed within in a square which in turn 
// is inscribed within a hexagon 
  
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the biggest reuleaux triangle 
static float Area(float a) 
{ 
  
    // side cannot be negative 
    if (a < 0) 
        return -1; 
  
    // height of the reuleaux triangle 
    float h =(float) 1.268 * a; 
  
    // area of the reuleaux triangle 
    float A = (float)(0.70477 * Math.pow(h, 2)); 
  
    return A; 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        float a = 5; 
    System.out.println( Area(a)); 
    } 
} 
  
// This code is contributed by anuj_67 

