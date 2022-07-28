

// Java program to find the equation 
// of circle. 
import java.util.*; 
  
class solution 
{ 
  
 // Function to find the equation of circle 
static void circle_equation(double x1, double y1, double r) 
{ 
    double a = -2 * x1; 
  
    double b = -2 * y1; 
  
    double c = (r * r) - (x1 * x1) - (y1 * y1); 
  
    // Printing result 
    System.out.print("x^2 + (" +a+ " x) + "); 
     System.out.print("y^2 + ("+b + " y) = "); 
     System.out.println(c +"." ); 
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    double x1 = 2, y1 = -3, r = 8; 
    circle_equation(x1, y1, r); 
   
} 
  
} 

