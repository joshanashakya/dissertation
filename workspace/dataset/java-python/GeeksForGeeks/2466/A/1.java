

// Java code to find the area of circumscribed  
// circle of equilateral triangle 
import java.lang.*; 
  
class GFG { 
      
    static double PI = 3.14159265; 
      
    // function to find the area of  
    // circumscribed circle 
    public static double area_cicumscribed(double a) 
    { 
        return (a * a * (PI / 3)); 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        double a = 6.0; 
        System.out.println("Area of circumscribed circle is :" 
                            + area_cicumscribed(a)); 
    } 
} 

