

//Java program to find the  
//area of the circle  
//which can be inscribed within the hexagon 
  
import java.util.*; 
  
class solution 
{ 
static double circlearea(double a) 
{ 
  
// the side cannot be negative 
    if (a < 0) 
    return -1; 
  
// area of the circle 
    double A = (3.14 * 3 * Math.pow(a,2) ) / 4; 
  
    return A; 
} 
public static void main(String arr[]) 
{ 
    double a = 4; 
    System.out.println(circlearea(a)); 
} 
} 

