

// Java implementation of the approach 
class GFG 
{ 
  
static int n = 3; 
static int MAX =30; 
  
// To store the states of dp 
static int dp[][][] = new int[n][n][MAX]; 
  
// To check whether a particular state 
// of dp has been solved 
static boolean v[][][] = new boolean[n][n][MAX]; 
  
// Function to find the ways 
// using memoisation 
static int findCount(int mat[][], int i, int j, int m) 
{ 
    // Base cases 
    if (i == 0 && j == 0)  
    { 
        if (m == mat[0][0]) 
            return 1; 
        else
            return 0; 
    } 
  
    // If required score becomes negative 
    if (m < 0) 
        return 0; 
  
    if (i < 0 || j < 0) 
        return 0; 
  
    // If current state has been reached before 
    if (v[i][j][m]) 
        return dp[i][j][m]; 
  
    // Set current state to visited 
    v[i][j][m] = true; 
  
    dp[i][j][m] = findCount(mat, i - 1, j, m - mat[i][j]) 
                + findCount(mat, i, j - 1, m - mat[i][j]); 
    return dp[i][j][m]; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int mat[][] = { { 1, 1, 1 }, 
                    { 1, 1, 1 }, 
                    { 1, 1, 1 } }; 
    int m = 5; 
    System.out.println(findCount(mat, n - 1, n - 1, m)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

