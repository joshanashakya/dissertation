

import javafx.util.Pair; 
  
// Java program for implementation of 
// the above approach 
class GFG  
{ 
  
// Function to find foot of perpendicular from 
// a point in 2 D plane to a Line 
static Pair<Double, Double> findFoot(double a, double b, double c, 
                            double x1, double y1) 
{ 
    double temp = -1 * (a * x1 + b * y1 + c) / (a * a + b * b); 
    double x = temp * a + x1; 
    double y = temp * b + y1; 
    return new Pair(x, y); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    // Equation of line is 
    // ax + by + c = 0 
    double a = 0.0; 
    double b = 1.0; 
    double c = -2; 
  
    // Coordinates of point p(x1, y1). 
    double x1 = 3.0; 
    double y1 = 3.0; 
  
    Pair<Double, Double> foot = findFoot(a, b, c, x1, y1); 
    System.out.println(foot.getKey() + " " + foot.getValue()); 
    } 
} 
  
// This code contributed by Rajput-Ji 

