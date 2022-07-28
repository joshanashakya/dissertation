

// Java  implementation of the approach 
import java.lang.Math; 
import java.io.*; 
  
class GFG { 
      
// Function to calculate the side of the polygon 
// circumscribed in a circle 
static double calculateSide(double  n, double r) 
{ 
    double theta, theta_in_radians; 
  
    theta = 360 / n; 
    theta_in_radians = theta * 3.14 / 180; 
  
    return 2 * r * Math.sin(theta_in_radians / 2); 
} 
  
// Driver Code 
    public static void main (String[] args) { 
  
    // Total sides of the polygon 
    double n = 3; 
  
    // Radius of the circumscribing circle 
    double r = 5; 
    System.out.println (calculateSide(n, r)); 
    } 
//This code is contributed by akt_mit     
} 

