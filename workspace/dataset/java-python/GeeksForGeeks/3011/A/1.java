

// Program to check matrix is 
// diagonal matrix or not. 
  
import java.io.*; 
  
class GFG { 
      
    static int N = 4; 
      
    // Function to check matrix 
    // is diagonal matrix 
    // or not. 
    static boolean isDiagonalMatrix(int mat[][]) 
    { 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
       
                // condition to check 
                // other elements  
                // except main diagonal  
                // are zero or not. 
                if ((i != j) && 
                   (mat[i][j] != 0)) 
                    return false; 
  
        return true; 
    } 
       
    // Driver function 
    public static void main(String args[]) 
    { 
        int mat[][] = { { 4, 0, 0, 0 }, 
                          { 0, 7, 0, 0 }, 
                          { 0, 0, 5, 0 }, 
                          { 0, 0, 0, 1 } }; 
       
        if (isDiagonalMatrix(mat)) 
            System.out.println("Yes"); 
        else
            System.out.println("No" ); 
    } 
} 
  
// This code is contributed by 
// Nikita Tiwari. 

