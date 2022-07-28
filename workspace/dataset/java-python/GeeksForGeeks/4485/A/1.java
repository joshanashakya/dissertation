

// Java program to find the area of Pentagon 
import java.io.*; 
  
class GFG { 
      
    // Function to find area of pentagon 
    static float findArea(float a) 
    { 
        float area; 
        
        // Formula to find area 
        area = (float)(Math.sqrt(5 * (5 + 2 
                * (Math.sqrt(5)))) * a * a) / 4; 
        
        return area; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        float a = 5; 
          
        System.out.println("Area of Pentagon: " 
                               + findArea(a)); 
    } 
} 

