

// Program to check matrix 
// is scalar matrix or not. 
import java.io.*; 
  
class GFG { 
      
    static int N = 4; 
    // Function to check matrix 
    // is scalar matrix or not. 
    static boolean isScalarMatrix(int mat[][]) 
    { 
        // Check all elements 
        // except main diagonal are 
        // zero or not. 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if ((i != j) 
                  && (mat[i][j] != 0)) 
                    return false; 
       
        // Check all diagonal elements 
        // are same or not. 
        for (int i = 0; i < N - 1; i++) 
            if (mat[i][i] != mat[i + 1][i + 1]) 
                return false; 
        return true; 
    } 
       
    // Driver function 
    public static void main(String args[]) 
    { 
        int mat[ ][ ] = { { 2, 0, 0, 0 }, 
                          { 0, 2, 0, 0 }, 
                          { 0, 0, 2, 0 }, 
                          { 0, 0, 0, 2 } }; 
        // Function call 
        if (isScalarMatrix(mat)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed 
// by Nikita tiwari. 

