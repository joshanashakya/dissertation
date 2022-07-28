

// Java  Program to implement  
// involutory matrix. 
import java.io.*; 
  
class GFG { 
      
    static int N = 3; 
      
    // Function for matrix multiplication. 
    static void multiply(int mat[][], int res[][]) 
    { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
                res[i][j] = 0; 
                for (int k = 0; k < N; k++) 
                    res[i][j] += mat[i][k] * mat[k][j]; 
            } 
        } 
    } 
      
    // Function to check involutory matrix. 
    static boolean InvolutoryMatrix(int mat[][]) 
    { 
        int res[][] = new int[N][N]; 
      
        // multiply function call. 
        multiply(mat, res); 
      
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
                if (i == j && res[i][j] != 1) 
                    return false; 
                if (i != j && res[i][j] != 0) 
                    return false; 
            } 
        } 
        return true; 
    } 
      
    // Driver function. 
    public static void main (String[] args)  
    { 
          
        int mat[][] = { { 1, 0, 0 }, 
                        { 0, -1, 0 }, 
                        { 0, 0, -1 } }; 
      
        // Function call. If function return 
        // true then if part will execute  
        // otherwise else part will execute. 
        if (InvolutoryMatrix(mat)) 
            System.out.println ( "Involutory Matrix"); 
        else
            System.out.println ( "Not Involutory Matrix"); 
      
              
    } 
} 
  
// This code is contributed by vt_m 

