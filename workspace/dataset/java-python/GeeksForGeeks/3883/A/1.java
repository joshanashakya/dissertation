

// Java program to count number 
// of decreasing path in a matrix 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
public static Scanner scn =  
      new Scanner(System.in); 
  
// Function that returns the number of 
// decreasing paths from a cell(i, j) 
public static int CountDecreasingPathsCell(int mat[][], int dp[][],  
                                           int n, int x, int y) 
    { 
        // checkinf if already calculated 
        if (dp[x][y] != -1) 
            return dp[x][y]; 
      
        // all possible paths 
        int delta[][] = { { 0, 1 }, { 1, 0 },  
                          { -1, 0}, { 0, -1}}; 
        int newx, newy; 
      
        // counts the total 
        // number of paths 
        int ans = 1; 
      
        // In all four allowed direction. 
        for (int i = 0; i < 4; i++)  
        { 
      
            // new co-ordinates 
            newx = x + delta[i][0]; 
            newy = y + delta[i][1]; 
      
            // Checking if not going out  
            // of matrix and next cell  
            // value is less than current  
            // cell value. 
            if (newx >= 0 && newx < n && newy >= 0 &&  
                newy < n && mat[newx][newy] < mat[x][y])  
            { 
                ans += CountDecreasingPathsCell(mat, dp, n,  
                                                newx, newy); 
            } 
        } 
          
        // fucntion that  
        // returns the answer 
        return dp[x][y] = ans; 
    } 
      
// Function that counts the total 
// decreasing path in the matrix 
public static int countDecreasingPathsMatrix(int n,  
                                             int mat[][]) 
    { 
        int dp[][] = new int[n][n]; 
      
        // Initalising dp[][] to -1. 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                dp[i][j] = -1; 
      
        int sum = 0; 
      
        // Calculating number of  
        // decreasing path from each cell. 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                sum += CountDecreasingPathsCell(mat, dp,  
                                                n, i, j); 
      
        return sum; 
    } 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 2; 
          
    int mat[][]= {{1, 2},  
                  {1, 3}}; 
      
    // function call that returns the 
    // count of decreasing paths in a matrix 
    System.out.println(countDecreasingPathsMatrix(n, mat)); 
  
}  
} 
  
// This code is contributed by khyati grover 

