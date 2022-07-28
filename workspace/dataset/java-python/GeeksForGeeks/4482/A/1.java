

// Java code to find the perimeter and area 
import java.lang.*; 
  
class GFG { 
  
    // Function to find the perimeter 
    public static double per(double a, double b) 
    { 
        return (a + b); 
    } 
    // Function to find the area 
    public static double area(double s) 
    { 
        return (s / 2); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double a = 7, b = 8, s = 10; 
        System.out.println(per(a, b)); 
        System.out.println(area(s)); 
    } 
} 

