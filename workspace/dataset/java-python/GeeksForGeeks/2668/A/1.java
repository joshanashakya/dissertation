

// Java program to find LCS of three strings  
class GFG  
{ 
  
    static String X = "AGGT12"; 
    static String Y = "12TXAYB"; 
    static String Z = "12XBA"; 
  
    static int[][][] dp = new int[100][100][100]; 
  
    /* Returns length of LCS for X[0..m-1],  
    Y[0..n-1] and Z[0..o-1] */
    static int lcsOf3(int i, int j, int k)  
    { 
        if (i == -1 || j == -1 || k == -1) 
        { 
            return 0; 
        } 
        if (dp[i][j][k] != -1)  
        { 
            return dp[i][j][k]; 
        } 
  
        if (X.charAt(i) == Y.charAt(j) && 
            Y.charAt(j) == Z.charAt(k)) 
        { 
            return dp[i][j][k] = 1 + lcsOf3(i - 1, j - 1, k - 1); 
        } else { 
            return dp[i][j][k] = Math.max(Math.max(lcsOf3(i - 1, j, k), 
                                lcsOf3(i, j - 1, k)), 
                                lcsOf3(i, j, k - 1)); 
        } 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
  
        for (int i = 0; i < 100; i++) 
        { 
            for (int j = 0; j < 100; j++)  
            { 
                for (int k = 0; k < 100; k++)  
                { 
                    dp[i][j][k] = -1; 
                } 
            } 
        } 
        int m = X.length(); 
        int n = Y.length(); 
        int o = Z.length(); 
  
        System.out.print("Length of LCS is "
                + lcsOf3(m - 1, n - 1, o - 1)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

