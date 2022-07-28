

// Java program to calculate  
// length of an arc 
public class Arc { 
      
    // functuion to calculate arc length 
    static double arcLength(double diameter,  
                              double angle) 
    { 
        double pi = 22.0 / 7.0; 
        double arc; 
  
        if (angle >= 360) { 
            System.out.println("Angle cannot"
                              + " be formed"); 
            return 0; 
        } 
        else { 
            arc = (pi * diameter) * (angle / 360.0); 
            return arc; 
        } 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        double diameter = 25.0; 
        double angle = 45.0; 
        double arc_len = arcLength(diameter, angle); 
        System.out.println(arc_len); 
    } 
} 

