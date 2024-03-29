

// Java program to find the  
// number of rectangles that  
// can be cut from a circle 
// of Radius R 
import java.io.*; 
  
class GFG 
{ 
      
// Function to return  
// the total possible 
// rectangles that can  
// be cut from the circle 
static int countRectangles(int radius) 
{ 
    int rectangles = 0; 
  
    // Diameter = 2 * Radius 
    int diameter = 2 * radius; 
  
    // Square of diameter  
    // which is the square 
    // of the maximum length  
    // diagnal 
    int diameterSquare = diameter * 
                         diameter; 
  
    // generate all combinations  
    // of a and b in the range  
    // (1, (2 * Radius - 1)) 
    // (Both inclusive) 
    for (int a = 1;  
             a < 2 * radius; a++) 
    { 
        for (int b = 1; 
                 b < 2 * radius; b++) 
        { 
  
            // Calculate the  
            // Diagnal length of 
            // this rectange 
            int diagnalLengthSquare = (a * a +  
                                       b * b); 
  
            // If this rectangle's Diagonal 
            // Length is less than the Diameter,  
            // it is a valid rectangle, thus  
            // increment counter 
            if (diagnalLengthSquare <= diameterSquare) 
            { 
                rectangles++; 
            } 
        } 
    } 
  
    return rectangles; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
      
// Radius of the circle 
int radius = 2; 
  
int totalRectangles; 
totalRectangles = countRectangles(radius); 
System.out.println(totalRectangles +  
             " rectangles can be " +  
            "cut from a circle of" +  
               " Radius " + radius); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

