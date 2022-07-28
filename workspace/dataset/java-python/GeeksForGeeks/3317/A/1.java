

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
        // Comparing elements across diagonal 
        int flip = 0; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < i; j++) 
                if (mat[i][j] != mat[j][i]) 
                    flip++; 
        return flip; 
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

