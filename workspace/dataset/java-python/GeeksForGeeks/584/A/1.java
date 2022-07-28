

// Java implementation of the approach 
class GFG { 
  
    static int n = 3; 
    static int maxV = 20; 
  
    // 3d array to store 
    // states of dp 
    static int[][][] dp = new int[n][n][maxV]; 
  
    // Array to determine whether 
    // a state has been solved before 
    static int[][][] v = new int[n][n][maxV]; 
  
    // Function to return the count of required paths 
    static int countWays(int i, int j, 
                         int x, int arr[][]) 
    { 
  
        // Base cases 
        if (i == n || j == n) { 
            return 0; 
        } 
  
        x = (x & arr[i][j]); 
        if (x == 0) { 
            return 0; 
        } 
  
        if (i == n - 1 && j == n - 1) { 
            return 1; 
        } 
  
        // If a state has been solved before 
        // it won't be evaluated again 
        if (v[i][j][x] == 1) { 
            return dp[i][j][x]; 
        } 
  
        v[i][j][x] = 1; 
  
        // Recurrence relation 
        dp[i][j][x] = countWays(i + 1, j, x, arr) 
                      + countWays(i, j + 1, x, arr); 
  
        return dp[i][j][x]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[][] = { { 1, 2, 1 }, 
                        { 1, 1, 0 }, 
                        { 2, 1, 1 } }; 
  
        System.out.println(countWays(0, 0, arr[0][0], arr)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

