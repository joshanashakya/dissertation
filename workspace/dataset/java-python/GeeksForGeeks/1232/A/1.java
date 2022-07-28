

// Java program to find the Area and 
// volume of Icosahedron 
import java.io.*; 
  
class GFG { 
      
    // Function to find area of Icosahedron 
    static float findArea(float a) 
    { 
        float area; 
      
        // Formula to calculating area 
        area = (float)(5 * Math.sqrt(3) * a * a); 
          
        return area; 
    } 
      
    // Function to find volume of Icosahedron 
    static float findVolume(float a) 
    { 
        float volume; 
      
        // Formula to calculating volume 
        volume = (float)(((float)5 / 12) * (3 + Math.sqrt(5)) * a * a * a); 
          
        return volume; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        float a = 5; 
  
        // Function call to find area of Icosahedron. 
        System.out.println("Area: " + findArea(a)); 
          
        // Function call to find volume of Icosahedron. 
        System.out.println("Volume: " + findVolume(a)); 
    } 
} 

