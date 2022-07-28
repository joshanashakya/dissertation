

// Java program to determine 
// the focal length of a lens 
  
import java.io.*; 
  
class GFG { 
  
    // Function to determine the focal 
    // length of a lens 
    static float focal_length(float image_distance, 
                              float object_distance) 
    { 
        return 1 / ((1 / image_distance) +  
                           (1 / object_distance)); 
    } 
  
    public static void main(String[] args) 
    { 
  
        // variable to store the distance 
        // between the lens and the image 
        float image_distance = 2; 
  
        // variable to store the distance 
        // between the lens and the object 
        float object_distance = 50; 
          
        System.out.println("Focal length of a lens is "
        + focal_length(image_distance, object_distance) 
                                         + " units."); 
    } 
} 
  
// This code is contributed by Ajit. 

