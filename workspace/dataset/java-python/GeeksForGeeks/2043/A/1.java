

// Java code to find the length 
// of rope 
import java.lang.*; 
  
class GFG { 
  
    static double PI = 3.14159265; 
  
    // Function to find the length 
    // of rope 
    public static double length_rope(double r) 
    { 
        return ((2 * PI * r) + 6 * r); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double r = 7; 
        System.out.println(length_rope(r)); 
    } 
} 

