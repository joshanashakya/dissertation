

// Java Program to find the biggest  
// Reuleaux triangle inscribed within 
// in a square which in turn is  
// inscribed within a semicircle 
import java.lang.Math; 
  
class GFG 
{ 
  
// Function to find the biggest reuleaux triangle 
static float Area(float r) 
{ 
  
    // radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // height of the reuleaux triangle 
    float x = (2 * r) /(float)(Math.sqrt(5)); 
  
    // area of the reuleaux triangle 
    float A = 0.70477f *(float)(Math.pow(x, 2)); 
  
    return A; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    float r = 5; 
    System.out.println(Area(r)); 
} 
} 
  
// This code is contributed by Mukul Singh. 

