

// Java code to find the area of 
// leaf inside a square 
import java.lang.*; 
  
class GFG { 
  
    static double PI = 3.14159265; 
  
    // Function to find the area of 
    // leaf 
    public static double area_leaf(double a) 
    { 
        return (a * a * (PI / 2 - 1)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double a = 7; 
        System.out.println(area_leaf(a)); 
    } 
} 

