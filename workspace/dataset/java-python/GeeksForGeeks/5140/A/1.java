

// Java program to find 
// the Shortest distance 
// between a point and 
// a circle 
class GFG 
{ 
  
// Function to find the shortest distance 
static void dist(double x1, double y1, double x2, 
                                double y2, double r) 
{ 
    System.out.println("The shortest distance "
            + "between a point and a circle is "
            + (Math.sqrt((Math.pow((x2 - x1), 2)) 
                    + (Math.pow((y2 - y1), 2))) 
            - r)); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double x1 = 4, y1 = 6, 
            x2 = 35, y2 = 42, r = 5; 
    dist(x1, y1, x2, y2, r); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

