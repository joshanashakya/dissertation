

// Java Program to Paint N boxes using M 
// colors such that K boxes have color 
// different from color of box on its left 
  
class GFG 
{ 
      
    static int M = 1001; 
    static int MOD = 998244353; 
  
    static int[][] dp = new int[M][M]; 
  
    // This function returns the required number 
    // of ways where idx is the current index and 
    // diff is number of boxes having different 
    // color from box on its left 
    static int solve(int idx, int diff, 
                        int N, int M, int K) 
    { 
        // Base Case 
        if (idx > N)  
        { 
            if (diff == K) 
                return 1; 
            return 0; 
        } 
  
        // If already computed 
        if (dp[idx][ diff] != -1) 
            return dp[idx][ diff]; 
  
        // Either paint with same color as 
        // previous one 
        int ans = solve(idx + 1, diff, N, M, K); 
  
        // Or paint with remaining (M - 1) 
        // colors 
        ans += (M - 1) * solve(idx + 1,  
                diff + 1, N, M, K); 
  
        return dp[idx][ diff] = ans % MOD; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int N = 3, M = 3, K = 0; 
        for(int i = 0; i <= M; i++) 
            for(int j = 0; j <= M; j++) 
                dp[i][j] = -1; 
      
        // Multiply M since first box can be 
        // painted with any of the M colors and 
        // start solving from 2nd box 
        System.out.println((M * solve(2, 0, N, M, K))); 
    } 
} 
  
// This code is contributed by mits 

