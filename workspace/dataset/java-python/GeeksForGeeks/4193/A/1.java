

// Java program for find Tangent 
// on a curve at given point 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
   
// function for find Tangent 
static void findTangent(int A, int x, int y) 
{ 
    // differentiate given equation 
    int dif = A - x * 2; 
   
    // check that point on the curve or not 
    if (y == (2 * x - x * x)) { 
   
        // if differentiate is negative 
        if (dif < 0) 
            System.out.println( "y = "
                 + dif + "x" + (x * dif + y)); 
   
        else if (dif > 0) 
   
            // differentiate is positive 
            System.out.println( "y = "
                 + dif + "x+" + -x * dif + y); 
   
        // differentiate is zero 
        else
            System.out.println("Not possible"); 
    } 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    // declare variable 
    int A = 2, x = 2, y = 0; 
   
    // call function findTangent 
    findTangent(A, x, y); 
   
}   
} 

