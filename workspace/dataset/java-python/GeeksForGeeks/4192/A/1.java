

// Java program for find curve 
// at given point 
  
import java.io.*; 
  
class GFG { 
  
// function for find normal 
static void findNormal(int A, int x, int y) 
{ 
    // differentiate given equation 
    int dif = A - x * 2; 
  
    // check that point on the curve or not 
    if (y == (2 * x - x * x)) { 
  
        // if differentiate is negative 
        if (dif < 0) 
            System.out.print( (0 - dif) + "y = "
                + "x" +((0 - x) + (y * dif))); 
  
        else if (dif > 0) 
  
            // differentiate is positive 
            System.out.print( dif + "y = "
                + "-x+" + (x + dif * y)); 
  
        // differentiate is zero 
        else
            System.out.print( "x = " +x); 
    } 
  
    // other wise normal not found 
    else
        System.out.println( "Not possible"); 
} 
  
       // Driver code 
    public static void main (String[] args) { 
        // declare variable 
    int A = 2, x = 2, y = 0; 
  
    // call function findNormal 
    findNormal(A, x, y);; 
    } 
} 
// This Code is contributed by inder_verma.. 

