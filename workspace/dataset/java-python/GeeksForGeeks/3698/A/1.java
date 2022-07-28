

// Java program to find the centroid of triangle 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
      
// Driver code 
public static void main(String args[]) 
{ 
    // coordinate of the vertices 
    float x1 = 1, x2 = 3, x3 = 6; 
    float y1 = 2, y2 = -4, y3 = -7; 
  
    // Formula to calculate centroid 
    float x = (x1 + x2 + x3) / 3; 
    float y = (y1 + y2 + y3) / 3; 
  
    //System.out.print(setprecision(3)); 
    System.out.println("Centroid = "
        + "(" + x + ", " + y + ")"); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

