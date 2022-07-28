

// Java Program to check if a given matrix 
// is Bisymmetric matrix 
import java.io.*; 
  
class GFG { 
  
    static int MAX = 100; 
      
    // Return if the given  
    // matrix is Bisymmetric matrix 
    static boolean checkBisymmetric(int m[][],  
                        int n) 
    { 
          
        // Checking Across Forward Diagonal 
        for (int i = 0; i < n; i++)  
            for (int j = 0; j < i; j++)  
      
                // check if corresponding  
                // position element are equal. 
                if (m[i][j] != m[j][i])  
                    return false; 
                  
        // Backward Diagonal 
        for (int i = 0; i < n; i++)  
      
            // for each column,  
            // upto main diagonal 
            for (int j = 0; j < n - i; j++)  
      
                // check if corresponding  
                // position element are equal. 
                if (m[i][j] != m[n - j - 1] 
                                [n - i - 1])  
                    return false; 
      
        return true; 
    } 
      
    // Driven Code 
    public static void main (String[] args) 
    { 
        int n = 3; 
          
        int m[][] = { { 1, 2, 3 }, 
                      { 2, 5, 2 }, 
                      { 3, 2, 1 } }; 
  
        if(checkBisymmetric(m, n)) 
            System.out.println( "Yes"); 
        else
            System.out.println( "No"); 
    } 
} 
  
// This code is contributed by anuj_67. 

