

// Java program to find Maximum decimal value Path in 
// Binary matrix 
public class GFG { 
  
    final static int N = 4; 
// Returns maximum decimal value in binary matrix. 
// Here p indicate power of 2 
  
    static int MaximumDecimalValue(int mat[][], int n) { 
        int dp[][] = new int[n][n]; 
        if (mat[0][0] == 1) { 
            dp[0][0] = 1; // 1*(2^0) 
        } 
        // Compute binary stream of first row of matrix 
        // and store result in dp[0][i] 
        for (int i = 1; i < n; i++) { 
            // indicate 1*(2^i) + result of previous 
            if (mat[0][i] == 1) { 
                dp[0][i] = (int) (dp[0][i - 1] + Math.pow(2, i)); 
            } // indicate 0*(2^i) + result of previous 
            else { 
                dp[0][i] = dp[0][i - 1]; 
            } 
        } 
  
        // Compute binary stream of first column of matrix 
        // and store result in dp[i][0] 
        for (int i = 1; i < n; i++) { 
            // indicate 1*(2^i) + result of previous 
            if (mat[i][0] == 1) { 
                dp[i][0] = (int) (dp[i - 1][0] + Math.pow(2, i)); 
            } // indicate 0*(2^i) + result of previous 
            else { 
                dp[i][0] = dp[i - 1][0]; 
            } 
        } 
  
        // Traversal rest Binary matrix and Compute maximum 
        // decimal value 
        for (int i = 1; i < n; i++) { 
            for (int j = 1; j < n; j++) { 
                // Here (i+j) indicate the current power of 
                // 2 in path that is 2^(i+j) 
                if (mat[i][j] == 1) { 
                    dp[i][j] = (int) (Math.max(dp[i][j - 1], dp[i - 1][j]) 
                            + Math.pow(2, i + j)); 
                } else { 
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]); 
                } 
            } 
        } 
  
        // Return maximum decimal value in binary matrix 
        return dp[n - 1][n - 1]; 
    } 
  
// Driver program 
    public static void main(String[] args) { 
  
        int mat[][] = {{1, 1, 0, 1}, 
        {0, 1, 1, 0}, 
        {1, 0, 0, 1}, 
        {1, 0, 1, 1},}; 
        System.out.println(MaximumDecimalValue(mat, 4)); 
    } 
} 
/*This code is contributed by Rajput-Ji*/

