

// Java program for the above approach 
class GFG 
{ 
  
static int n = 6, m = 6; 
  
// Function to find the maximum value 
static void maxSum(long arr[][]) 
{ 
    // Dp table 
    long [][]dp= new long[n + 1][3]; 
  
    // Fill the dp in bottom 
    // up manner 
    for (int i = 0; i < n; i++) 
    { 
  
        // Maximum of the three sections 
        long m1 = 0, m2 = 0, m3 = 0; 
  
        for (int j = 0; j < m; j++)  
        { 
  
            // Maximum of the first section 
            if ((j / (m / 3)) == 0)  
            { 
                m1 = Math.max(m1, arr[i][j]); 
            } 
  
            // Maximum of the second section 
            else if ((j / (m / 3)) == 1) 
            { 
                m2 = Math.max(m2, arr[i][j]); 
            } 
  
            // Maximum of the third section 
            else if ((j / (m / 3)) == 2) 
            { 
                m3 = Math.max(m3, arr[i][j]); 
            } 
        } 
  
        // If we choose element from section 1, 
        // we cannot have selection from same section 
        // in adjacent rows 
        dp[i + 1][0] = Math.max(dp[i][1], dp[i][2]) + m1; 
        dp[i + 1][1] = Math.max(dp[i][0], dp[i][2]) + m2; 
        dp[i + 1][2] = Math.max(dp[i][1], dp[i][0]) + m3; 
    } 
  
    // Print the maximum sum 
    System.out.print(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]) + "\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    long arr[][] = { { 1, 3, 5, 2, 4, 6 }, 
                    { 6, 4, 5, 1, 3, 2 }, 
                    { 1, 3, 5, 2, 4, 6 }, 
                    { 6, 4, 5, 1, 3, 2 }, 
                    { 6, 4, 5, 1, 3, 2 }, 
                    { 1, 3, 5, 2, 4, 6 } }; 
  
    maxSum(arr); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

