

// Java Program to find the biggest triangle 
// which can be inscribed within the rectangle 
import java.util.*; 
  
class GFG 
{ 
    // Function to find the area 
    // of the triangle 
    static float trianglearea(float l, float b) 
    { 
      
        // a and b cannot be negative 
        if (l < 0 || b < 0) 
            return -1; 
      
        // area of the triangle 
        float area = (l * b) / 2; 
        return area; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        float l = 5, b = 4; 
          
        System.out.println(trianglearea(l, b)); 
    } 
} 

