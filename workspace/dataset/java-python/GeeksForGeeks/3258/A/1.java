

// Java program to find the number of 
// triangles in a plane if no more 
// then two points are collinear. 
import java.io.*; 
  
class GFG { 
  
    // Function to find number of triangles 
    // in a plane. 
    static int countNumberOfTriangles(int n) 
    { 
  
        // Formula to find number of triangle 
        // nC3 = n * (n - 1) * (n - 2) / 6 
        return n * (n - 1) * (n - 2) / 6; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 4; 
  
        System.out.println( 
            countNumberOfTriangles(n)); 
    } 
} 

