

// Java program to find 
// smallest and largest elements of both diagonals 
  
public class GFG { 
    // Function to find smallest and largest element from 
    // principal and secondary diagonal 
    static void diagonalsMinMax(int[][] mat) 
    { 
        // take length of matrix 
        int n = mat.length; 
        if (n == 0) 
           return; 
  
        // declare and initialize variables with appropriate value 
        int principalMin = mat[0][0], principalMax = mat[0][0]; 
        int secondaryMin = mat[n-1][0], secondaryMax = mat[n-1][0]; 
  
        for (int i = 1; i < n; i++) { 
            for (int j = 1; j < n; j++) { 
  
                // Condition for principal 
                // diagonal 
                if (i == j) { 
  
                    // take new smallest value 
                    if (mat[i][j] < principalMin) { 
                        principalMin = mat[i][j]; 
                    } 
  
                    // take new largest value 
                    if (mat[i][j] > principalMax) { 
                        principalMax = mat[i][j]; 
                    } 
                } 
  
                // Condition for secondary 
                // diagonal 
                if ((i + j) == (n - 1)) { 
  
                    // take new smallest value 
                    if (mat[i][j] < secondaryMin) { 
                        secondaryMin = mat[i][j]; 
                    } 
  
                    // take new largest value 
                    if (mat[i][j] > secondaryMax) { 
                        secondaryMax = mat[i][j]; 
                    } 
                } 
            } 
        } 
  
        System.out.println("Principal Diagonal Smallest Element:  "
                           + principalMin); 
        System.out.println("Principal Diagonal Greatest Element : "
                           + principalMax); 
  
        System.out.println("Secondary Diagonal Smallest Element: "
                           + secondaryMin); 
        System.out.println("Secondary Diagonal Greatest Element: "
                           + secondaryMax); 
    } 
  
    // Driver code 
    static public void main(String[] args) 
    { 
  
        // Declare and initialize 5X5 matrix 
        int[][] matrix = { 
            { 1, 2, 3, 4, -10 }, 
            { 5, 6, 7, 8, 6 }, 
            { 1, 2, 11, 3, 4 }, 
            { 5, 6, 70, 5, 8 }, 
            { 4, 9, 7, 1, -5 } 
        }; 
  
        diagonalsMinMax(matrix); 
    } 
} 

