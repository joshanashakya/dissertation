

// Java program to find the volume 
// of the triangular prism 
import java.io.*; 
  
class GFG { 
  
    // function to find the Volume 
    // of triangular prism 
    static float findVolume(float l, float b, float h) 
    { 
        // formula to find Volume 
        float volume = (l * b * h) / 2; 
  
        return volume; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        float l = 18, b = 12, h = 9; 
  
        // function calling 
        System.out.println("Volume of triangular prism: "
                           + findVolume(l, b, h)); 
    } 
} 

