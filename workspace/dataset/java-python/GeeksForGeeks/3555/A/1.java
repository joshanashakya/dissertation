

// Java implementation of the approach 
class GFG { 
  
    static int n = 3; 
  
    // 2d array to store 
    // states of dp 
    static int[][] dp = new int[n][n]; 
  
    // Array to determine whether 
    // a state has been solved before 
    static int[][] v = new int[n][n]; 
  
    // Function to return the minimum steps required 
    static int minSteps(int i, int j, int arr[][]) 
    { 
  
        // Base cases 
        if (i == n - 1 && j == n - 1) { 
            return 0; 
        } 
  
        if (i > n - 1 || j > n - 1) { 
            return 9999999; 
        } 
  
        // If a state has been solved before 
        // it won't be evaluated again 
        if (v[i][j] == 1) { 
            return dp[i][j]; 
        } 
  
        v[i][j] = 1; 
        dp[i][j] = 9999999; 
  
        // Recurrence relation 
        for (int k = Math.max(0, arr[i][j] + j - n + 1); 
             k <= Math.min(n - i - 1, arr[i][j]); k++) { 
            dp[i][j] = Math.min(dp[i][j], 
                                minSteps(i + k, j + arr[i][j] - k, arr)); 
        } 
  
        dp[i][j]++; 
  
        return dp[i][j]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[][] = { { 4, 1, 2 }, 
                        { 1, 1, 1 }, 
                        { 2, 1, 1 } }; 
  
        int ans = minSteps(0, 0, arr); 
        if (ans >= 9999999) { 
            System.out.println(-1); 
        } 
        else { 
            System.out.println(ans); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

