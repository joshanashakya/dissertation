

// Java program to find middle of three  
// distinct numbers to calculate the 
// number of equilateral triangles 
import java.util.*; 
import static java.lang.Math.pow; 
  
class Triangle 
{    
    // function to calculate number  
    // of triangles in Nth step 
    public static double numberOfTriangles(int n) 
    { 
        double ans = 2 * (pow(3, n)) - 1; 
        return ans; 
    } 
      
    // driver code 
    public static void main(String[] args) 
    { 
        int n = 2; 
        System.out.println(numberOfTriangles(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

