

// Java Program to find the biggest  
// right circular cylinder that can  
// be fit within a right circular cone 
  
import java.io.*; 
  
class GFG { 
// Function to find the biggest right circular cylinder 
static double cyl(double r, double h) 
{ 
  
    // radius and height cannot be negative 
    if (r < 0 && h < 0) 
        return -1; 
  
    // radius of right circular cylinder 
    double R = (2 * r) / 3; 
  
    // height of right circular cylinder 
    double H = (2 * h) / 3; 
  
    // volume of right circular cylinder 
    double V = 3.14 * Math.pow(R, 2) * H; 
  
    return V; 
} 
  
// Driver code 
      
    public static void main (String[] args) { 
      
    double r = 4, h = 8; 
    System.out.println (cyl(r, h)); 
    } 
//This code is contributed by ajit  
} 

