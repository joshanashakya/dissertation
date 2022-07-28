

// Java code to find the area of inscribed 
// circle of equilateral triangle 
import java.lang.*; 
  
class GFG { 
  
    static double PI = 3.14159265; 
  
    // function to find the area of 
    // inscribed circle 
    public static double area_inscribed(double a) 
    { 
        return (a * a * (PI / 12)); 
    } 
  
    // function to find the perimeter of 
    // inscribed circle 
    public static double perm_inscribed(double a) 
    { 
        return (PI * (a / Math.sqrt(3))); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double a = 6.0; 
        System.out.println("Area of inscribed circle is :"
                           + area_inscribed(a)); 
  
        System.out.println("\nPerimeter of inscribed circle is :"
                           + perm_inscribed(a)); 
    } 
} 

