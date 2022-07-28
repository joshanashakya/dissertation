

// Java program to find the 
// Area and Perimeter of a Semicircle 
  
import java.io.*; 
  
class GFG { 
  
// Function for calculating the area 
static float area(float r) 
{ 
    // Formula for finding the area 
    return (float)((0.5)*(3.14)*(r * r)); 
} 
  
// Function for calculating the perimeter 
static float perimeter(float r) 
{ 
    // Formula for finding the perimeter 
    return (float)((3.14)*(r)); 
} 
  
// driver code 
  
    public static void main (String[] args) { 
    // Get the radius 
    float r = 10; 
  
    // Find the area 
    System.out.println("The Area of Semicircle: "+ 
        area(r)); 
  
    // Find the perimeter 
    System.out.println("The Perimeter of Semicircle:"+ 
        +perimeter(r)); 
    } 
} 
 // This code is contributed 
// by anuj_67.. 

