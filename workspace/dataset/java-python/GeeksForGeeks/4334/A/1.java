

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
  
        // declare and initialism variables with appropriate value 
        int principalMin = mat[0][0], principalMax = mat[0][0]; 
        int secondaryMin = mat[n-1][0], secondaryMax = mat[n-1][0]; 
  
        for (int i = 0; i < n; i++) { 
  
            // Condition for principal 
            // diagonal mat[i][i] 
  
            // take new smallest value 
            if (mat[i][i] < principalMin) { 
                principalMin = mat[i][i]; 
            } 
            // take new largest value 
            if (mat[i][i] > principalMax) { 
                principalMax = mat[i][i]; 
            } 
  
            // Condition for secondary 
            // diagonal is mat[n-1-i][i] 
            // take new smallest value 
            if (mat[n - 1 - i][i] < secondaryMin) { 
                secondaryMin = mat[n - 1 - i][i]; 
            } 
            // take new largest value 
            if (mat[n - 1 - i][i] > secondaryMax) { 
                secondaryMax = mat[n - 1 - i][i]; 
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

