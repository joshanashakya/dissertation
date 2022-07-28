

// A simple recursive solution to count 
// number of ways to reach mat[m-1][n-1] from 
// mat[0][0] in a matrix mat[][] 
  
class GFG 
{ 
    // Returns The number of way from top-left  
    // to mat[m-1][n-1] 
    static int countPaths(int m, int n) 
    { 
        int [][]dp=new int[m+1][n+1]; 
          
        for (int i=1; i<=m; i++) 
        { 
            for (int j=1; j<=n; j++) 
            { 
            if (i==1 || j == 1) 
                dp[i][j] = 1; 
                else
                dp[i][j] = dp[i-1][j] + dp[i][j-1];              
            } 
        } 
      
        return dp[m][n]; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int n = 5; 
        int m = 5;  
        System.out.println(countPaths(n, m)); 
          
    } 
} 
  
// This code is contributed  
// by ihritik (Hritik Raj) 

