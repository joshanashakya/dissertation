

// Java Program to find the biggest circle 
// which can be inscribed within the semicircle 
class GFG  
{ 
      
    // Function to find the area 
    // of the circle 
    static float circlearea(float R) 
    { 
      
        // Radius cannot be negative 
        if (R < 0) 
            return -1; 
      
        // Area of the largest circle 
        float a = (float)((3.14 * R * R) / 4); 
      
        return a; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        float R = 2; 
        System.out.println(circlearea(R)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

