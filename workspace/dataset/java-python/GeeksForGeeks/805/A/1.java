

// Java code to find the area of circumscribed 
// circle of right angled triangle 
import java.lang.*; 
  
class GFG { 
  
    static double PI = 3.14159265; 
  
    // Function to find the area of 
    // circumscribed circle 
    public static double area_cicumscribed(double c) 
    { 
        return (c * c * (PI / 4)); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        double c = 8.0; 
        System.out.println(area_cicumscribed(c)); 
    } 
} 

