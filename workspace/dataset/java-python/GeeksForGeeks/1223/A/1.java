

// Java program to find the Surface Area 
// and Volume of Hexagonal Prism. 
  
import java.io.*; 
  
class GFG { 
         
    // Function to calculate Surface area 
    static void findSurfaceArea(float a, float h) 
    { 
        float Area; 
  
        // Formula to calculate surface area 
        Area = 6 * a * h + 3 * (float)(Math.sqrt(3)) * a * a; 
      
        // Display surface area 
        System.out.println("Surface Area: " + Area); 
    } 
      
    // Function to calculate Volume 
    static void findVolume(float a, float h) 
    { 
        float Volume; 
      
        // formula to calculate Volume 
        Volume = 3 * (float)(Math.sqrt(3)) * a * a * h / 2; 
      
        // Display Volume 
        System.out.println("Volume: " + Volume); 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        float a = 5, h = 10; 
      
        // surface area function call 
        findSurfaceArea(a, h); 
      
        // volume function call 
        findVolume(a, h); 
    } 
} 

