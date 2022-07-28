

// Java program to find product of 
// middle row and middle column in matrix 
import java.io.*; 
  
class GFG { 
  
  
static int MAX = 100; 
  
static void middleProduct(int mat[][], int n) 
{ 
  
    // loop for product of row and column 
    int row_prod = 1, col_prod = 1; 
    for (int i = 0; i < n; i++) { 
        row_prod *= mat[n / 2][i]; 
        col_prod *= mat[i][n / 2]; 
    } 
  
    // Print result 
    System.out.print("Product of middle row = "
        + row_prod); 
  
    System.out.print( "Product of middle column = "
        + col_prod); 
} 
  
    // Driver code 
    public static void main (String[] args) { 
            int mat[][] = { { 2, 1, 7 }, 
                    { 3, 7, 2 }, 
                    { 5, 4, 9 } }; 
  
    middleProduct(mat, 3); 
    } 
} 
// This code is contributed by shs 

