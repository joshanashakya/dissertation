

// Java Program to find the biggest Reuleaux 
// triangle inscribed within in a square which 
// in turn is inscribed within a circle 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the Area 
// of the Reuleaux triangle 
static double ReuleauxArea(double r) 
{ 
  
    // radius cannot be negative 
    if (r < 0) 
        return -1; 
  
    // Area of the Reuleaux triangle 
    double A = 0.70477 * 2 * Math.pow(r, 2); 
  
    return A; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    double r = 6; 
    System.out.println(ReuleauxArea(r)); 
      
} 
} 
// This code is contributed by 
// Surendra_Gangwar 

