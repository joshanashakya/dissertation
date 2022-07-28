

// Java program to find LCS of two arrays with  
// k changes allowed in first array. 
class GFG  
{ 
    static int MAX = 10; 
  
    // Return LCS with at most k changes allowed. 
    static int lcs(int[][][] dp, int[] arr1,     
                   int n, int[] arr2, int m, int k)  
    { 
  
        // If at most changes is less than 0. 
        if (k < 0) 
            return -10000000; 
  
        // If any of two array is over. 
        if (n < 0 || m < 0) 
            return 0; 
  
        // Making a reference variable to dp[n][m][k] 
        int ans = dp[n][m][k]; 
  
        // If value is already calculated, return 
        // that value. 
        if (ans != -1) 
            return ans; 
  
        try 
        { 
  
            // calculating LCS with no changes made. 
            ans = Math.max(lcs(dp, arr1, n - 1, arr2, m, k),  
                           lcs(dp, arr1, n, arr2, m - 1, k)); 
  
            // calculating LCS when array element are same. 
            if (arr1[n - 1] == arr2[m - 1]) 
                ans = Math.max(ans, 1 + lcs(dp, arr1, n - 1,  
                                                arr2, m - 1, k)); 
  
            // calculating LCS with changes made. 
            ans = Math.max(ans, 1 + lcs(dp, arr1, n - 1, 
                                            arr2, m - 1, k - 1)); 
        } catch (Exception e) { } 
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int k = 1; 
        int[] arr1 = { 1, 2, 3, 4, 5 }; 
        int[] arr2 = { 5, 3, 1, 4, 2 }; 
        int n = arr1.length; 
        int m = arr2.length; 
  
        int[][][] dp = new int[MAX][MAX][MAX]; 
        for (int i = 0; i < MAX; i++) 
            for (int j = 0; j < MAX; j++) 
                for (int l = 0; l < MAX; l++) 
                    dp[i][j][l] = -1; 
  
        System.out.println(lcs(dp, arr1, n, arr2, m, k)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

