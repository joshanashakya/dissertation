

// Java program to calculate 
// area of a trapezoid 
import java.io.*; 
  
class GFG 
{ 
      
    // Function for the area 
    static double Area(int b1,  
                       int b2,  
                       int h) 
    { 
        return ((b1 + b2) / 2) * h; 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        int base1 = 8, base2 = 10,  
                       height = 6; 
        double area = Area(base1, base2,  
                                  height); 
        System.out.println("Area is: " + area); 
    } 
} 

