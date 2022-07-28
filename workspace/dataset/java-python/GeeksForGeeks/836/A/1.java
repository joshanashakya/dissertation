

// Java Program to calculate angle on the circumference 
// subtended by the chord when the central angle 
// subtended by the chord is given 
  
class GFG { 
  
    static float angleOncirCumference(float z) 
    { 
        return (z / 2); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Angle on center 
        float angle = 65; 
  
        float z = angleOncirCumference(angle); 
  
        System.out.println("The angle is "
                           + z + " degrees"); 
    } 
} 

