

// Java Program to find nth Centered 
// tetrahedral number 
import java.io.*; 
  
class GFG { 
  
    // Function to find centered 
    // Centered tetrahedral number 
    static int centeredTetrahedralNumber(int n) 
    { 
          
        // Formula to calculate nth 
        // Centered tetrahedral number 
        // and return it into main function. 
        return (2 * n + 1) * (n * n + n + 3) / 3; 
    } 
      
    // Driver Code 
  
  
    public static void main (String[] args) 
    { 
        int n = 6; 
  
        System.out.println( 
                   centeredTetrahedralNumber(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

