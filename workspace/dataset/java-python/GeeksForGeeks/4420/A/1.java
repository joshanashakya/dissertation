

// Java program to find max possible side-length 
// of a square in a given matrix 
  
import java.io.*; 
  
class GFG { 
static int n = 5; 
    // Function to return side-length of square 
static int largestSideLen(int matrix[][]) 
{ 
    int result = 1; 
  
    // Traverse the matrix 
    for (int i = 0; i < (n / 2); i++) { 
  
        int element = matrix[i][i]; 
        int isSquare = 1; 
  
        for (int j = i; j < n - i; j++) { 
            // for row i 
            if (matrix[i][j] != element) 
                isSquare = 0; 
            // for row n-i-1 
            if (matrix[n - i - 1][j] != element) 
                isSquare = 0; 
            // for column i 
            if (matrix[j][i] != element) 
                isSquare = 0; 
            // for column n-i-1 
            if (matrix[j][n - i - 1] != element) 
                isSquare = 0; 
        } 
  
        if (isSquare > 0) 
            return n - (2 * i); 
    } 
  
    // Return result 
    return result; 
} 
  
// Driver program 
      
    public static void main (String[] args) { 
        int matrix[][] = {{ 1, 1, 1, 1, 1}, 
                        {1, 2, 2, 2, 1}, 
                        {1, 2, 1, 2, 1}, 
                        {1, 2, 2, 2, 1}, 
                        {1, 1, 1, 1, 1 }}; 
  
    System.out.println (largestSideLen(matrix)); 
          
          
    } 
} 

