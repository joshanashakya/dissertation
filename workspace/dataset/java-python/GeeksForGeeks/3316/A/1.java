

// Java Program to find minimum flip 
// required to make Binary Matrix 
// symmetric along main diagonal 
import java.util.*; 
  
class GFG { 
      
    // Return the minimum flip required 
    // to make Binary Matrix symmetric 
    // along main diagonal. 
    static int minimumflip(int mat[][], int n) 
    { 
        int transpose[][] = new int[n][n]; 
       
        // finding the transpose of the matrix 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                transpose[i][j] = mat[j][i]; 
       
        // Finding the number of position  
        // where element are not same. 
        int flip = 0; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                if (transpose[i][j] != mat[i][j]) 
                    flip++; 
       
        return flip / 2; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 3; 
        int mat[][] = {{ 0, 0, 1 }, 
                       { 1, 1, 1 }, 
                       { 1, 0, 0 }}; 
          
        System.out.println(minimumflip(mat, n)); 
    } 
} 
      
// This code is contributed by Arnav Kr. Mandal.     

