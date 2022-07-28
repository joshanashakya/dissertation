

// Java program to find point that divides 
// given line in given ratio in 3D. 
import java.util.*; 
  
class solution 
{ 
  
// Function to find the section of the line 
static void section(double x1, double x2, double y1, 
            double y2, double z1, double z2, 
            double m, double n) 
{ 
    // Applying section formula 
    double x = ((m * x2) + (n * x1)) / (m + n); 
  
    double y = ((m * y2) + (n * y1)) / (m + n); 
  
    double z = ((m * z2) + (n * z1)) / (m + n); 
  
    System.out.print( "(" +x +", "); 
    System.out.print( y+ ", "); 
    System.out.println(z + ")" ); 
  
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    double x1 = 2, x2 = 4, y1 = -1, 
        y2 = 3, z1 = 4, z2 = 2, 
        m = 2, n = 3; 
    section(x1, x2, y1, y2, z1, z2, m, n); 
  
} 
  
} 
//This code is contributed by Surendra_Gangwar 

