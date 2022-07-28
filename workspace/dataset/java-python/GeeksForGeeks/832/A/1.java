

// Java program to find the interior and  
// exterior angle of a given polygon 
import java.io.*; 
  
class GFG { 
      
    // function to find the interior and 
    // exterior angle 
    static void findAngle(int n) 
    { 
        int interiorAngle, exteriorAngle; 
      
        // formula to find the interior angle 
        interiorAngle = (n - 2) * 180 / n; 
          
        // formula to find the exterior angle 
        exteriorAngle = 360 / n; 
      
        // Displaying the output 
        System.out.println("Interior angle: " + interiorAngle); 
      
        System.out.println("Exterior angle: " + exteriorAngle); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 10; 
      
        // Function calling 
        findAngle(n); 
    } 
} 

