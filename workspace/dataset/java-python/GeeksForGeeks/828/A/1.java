

// Java program to find Area of 
// semicircle in a square 
class GFG { 
  
    // Function to find area of semicircle 
    static float find_Area(float a) 
    { 
        float R = a * (float)(2.0 - Math.sqrt(2)); 
        float area = (float)((3.14 * R * R) / 2.0); 
        return area; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        // side of a square 
        float a = 4; 
      
        // Call Function to find 
        // the area of semicircle 
        System.out.println(" Area of semicircle = " + find_Area(a)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

