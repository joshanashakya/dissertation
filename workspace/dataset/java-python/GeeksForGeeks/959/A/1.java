

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int N = 3; 
  
// Function to return the number of cells 
// in which mirror can be placed 
static int numberOfCells(int mat[][]) 
{ 
    boolean [][]row = new boolean[N][N]; 
    boolean [][]col = new boolean[N][N]; 
  
    // Update the row array where row[i][j] 
    // will store whether the current row i 
    // contains all 1s in the columns 
    // starting from j 
    for (int i = 0; i < N; i++)  
    { 
        for (int j = N - 1; j >= 0; j--)  
        { 
            if (mat[i][j] == 1)  
            { 
                row[i][j] = (j + 1 < N) ? row[i][j + 1] 
                                        : true; 
            } 
            else
            { 
                row[i][j] = false; 
            } 
        } 
    } 
  
    // Update the column array where col[i][j] 
    // will store whether the current column j 
    // contains all 1s in the rows starting from i 
    for (int j = 0; j < N; j++)  
    { 
        for (int i = N - 1; i >= 0; i--)  
        { 
            if (mat[i][j] == 1) 
            { 
                col[i][j] = (i + 1 < N) ? col[i + 1][j] 
                                        : true; 
            } 
            else
            { 
                col[i][j] = false; 
            } 
        } 
    } 
  
    // To store the required result 
    int cnt = 0; 
  
    // For every cell except the last 
    // row and the last column 
    for (int i = 0; i < N - 1; i++) 
    { 
        for (int j = 0; j < N - 1; j++) 
        { 
  
            // If the current cell is not blocked 
            // and the light can travel from the 
            // next row and the next column 
            // then the current cell is valid 
            if (row[i][j] && col[i][j]) 
            { 
                cnt++; 
            } 
        } 
    } 
  
    // For the last column 
    for (int i = 0; i < N; i++) 
    { 
        if (col[i][N - 1]) 
            cnt++; 
    } 
  
    // For the last row, note that the last column 
    // is not taken into consideration as the bottom 
    // right element has already been considered 
    // in the last column previously 
    for (int j = 0; j < N - 1; j++)  
    { 
        if (row[N - 1][j]) 
            cnt++; 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int mat[][] = { { 0, 1, 1 }, 
                    { 0, 1, 1 }, 
                    { 0, 1, 1 } }; 
  
    System.out.print(numberOfCells(mat)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

