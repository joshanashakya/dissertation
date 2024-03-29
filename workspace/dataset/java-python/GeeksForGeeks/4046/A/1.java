

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate the perfix sum of the 
// rows and the columns of the given matrix 
static void perfix_calculate(int [][] A, 
                    int [][] row, 
                    int [][] col) 
{ 
  
    // Number of rows and cols 
    int n = (int)A.length; 
    int m = (int)A[0].length; 
  
    // First column of the row prefix array 
    for (int i = 0; i < n; ++i) 
    { 
        row[i][0] = A[i][0]; 
    } 
  
    // Update the prefix sum for the rows 
    for (int i = 0; i < n; ++i) 
    { 
        for (int j = 1; j < m; ++j)  
        { 
            row[i][j] = row[i][j - 1] 
                        + A[i][j]; 
        } 
    } 
  
    // First row of the column prefix array 
    for (int i = 0; i < m; ++i) 
    { 
        col[0][i] = A[0][i]; 
    } 
  
    // Update the prefix sum for the columns 
    for (int i = 0; i < m; ++i) 
    { 
        for (int j = 1; j < n; ++j) 
        { 
            col[j][i] = A[j][i] 
                        + col[j - 1][i]; 
        } 
    } 
} 
  
// Function to return the perimeter 
// of the square having top-left corner 
// at (i, j) and size k 
static int perimeter(int i, int j, int k, 
                int [][] row, int [][] col, 
                int [][] A) 
{ 
  
    // i and j represent the top left 
    // corner of the square and 
    // k is the size 
    int row_s, col_s; 
  
    // Get the upper row sum 
    if (j == 0) 
        row_s = 0; 
    else
        row_s = row[i][j - 1]; 
  
    // Get the left column sum 
    if (i == 0) 
        col_s = 0; 
    else
        col_s = col[i - 1][j]; 
  
    int upper_row = row[i][j + k] - row_s; 
    int left_col = col[i + k][j] - col_s; 
  
    // At the distance of k in 
    // both direction 
    if (j == 0) 
        row_s = 0; 
    else
        row_s = row[i + k][j - 1]; 
  
    if (i == 0) 
        col_s = 0; 
    else
        col_s = col[i - 1][j + k]; 
  
    int lower_row = row[i + k][j + k] - row_s; 
    int right_col = col[i + k][j + k] - col_s; 
  
    // The perimeter will be 
    // sum of all the values 
    int sum = upper_row + lower_row +  
                left_col + right_col; 
  
    // Since all the corners are 
    // included twice, they need to 
    // be subtract from the sum 
    sum -= (A[i][j] + A[i + k][j] + 
             A[i][j + k] + A[i + k][j + k]); 
  
    return sum; 
} 
  
// Fucntion to return the maximum perimeter 
// of a square in the given matrix 
static int maxPerimeter(int [][] A) 
{ 
  
    // Number of rows and cols 
    int n = (int)A.length; 
    int m = (int)A[0].length; 
  
    int [][] row = new int[n][m]; 
    int [][] col = new int[n][m]; 
  
    // Function call to calculate 
    // the prefix sum of rows and cols 
    perfix_calculate(A, row, col); 
  
    // To store the maximum perimeter 
    int maxPer = 0; 
  
    // Nested loops to choose the top-left 
    // corner of the square 
    for (int i = 0; i < n; ++i)  
    { 
        for (int j = 0; j < m; ++j) 
        { 
  
            // Loop for the size of the square 
            for (int k = 0; k < Math.min(n - i, m - j); ++k)  
            { 
  
                // Get the perimeter of the current square 
                int perimtr = perimeter(i, j, k, 
                                        row, col, A); 
  
                // Update the maximum perimeter so far 
                maxPer = Math.max(maxPer, perimtr); 
            } 
        } 
    } 
  
    return maxPer; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int [][] A = { 
        { 1, 1, 0 }, 
        { 1, 1, 1 }, 
        { 0, 1, 1 } 
    }; 
  
    System.out.print(maxPerimeter(A)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

