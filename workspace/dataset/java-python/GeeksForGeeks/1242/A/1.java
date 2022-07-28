

// Java Program to find the  
// biggest rhombus which can be  
// inscribed within the rectangle 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the area 
// of the biggest rhombus 
static float rhombusarea(float l, 
                         float b) 
{ 
    // the length and breadth 
    // cannot be negative 
    if (l < 0 || b < 0) 
        return -1; 
  
    // area of the rhombus 
    return (l * b) / 2; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    float l = 16, b = 6; 
    System.out.println(rhombusarea(l, b)); 
} 
} 
  
// This code is contributed 
// by inder_verma 

