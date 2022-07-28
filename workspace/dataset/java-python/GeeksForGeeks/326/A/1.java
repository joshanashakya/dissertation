

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Returns count of ordered subsets of arr[] 
    // with XOR value = K 
    static int subsetXOR(int arr[], int n, int K) 
    { 
      
        // Find maximum element in arr[] 
        int max_ele = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > max_ele) 
                max_ele = arr[i]; 
      
        // Maximum possible XOR value 
        int m = (1 << (int)(Math.log(max_ele) /  
                        Math.log(2) + 1)) - 1; 
      
        // The value of dp[i][j][k] is the number  
        // of subsets of length k having XOR of their  
        // elements as j from the set arr[0...i-1] 
        int [][][] dp = new int[n + 1][m + 1][n + 1]; 
      
        // Initializing all the values of  
        // dp[i][j][k] as 0 
        for (int i = 0; i <= n; i++) 
            for (int j = 0; j <= m; j++) 
                for (int k = 0; k <= n; k++) 
                    dp[i][j][k] = 0; 
      
        // The xor of empty subset is 0 
        for (int i = 0; i <= n; i++) 
            dp[i][0][0] = 1; 
      
        // Fill the dp table 
        for (int i = 1; i <= n; i++)  
        { 
            for (int j = 0; j <= m; j++)  
            { 
                for (int k = 0; k <= n; k++)  
                { 
                    dp[i][j][k] = dp[i - 1][j][k]; 
                    if (k != 0) 
                    { 
                        dp[i][j][k] += k * dp[i - 1][j ^  
                                    arr[i - 1]][k - 1]; 
                    } 
                } 
            } 
        } 
      
        // The answer is the number of subsets  
        // of all lengths from set arr[0..n-1] 
        // having XOR of elements as k 
        int ans = 0; 
        for (int i = 1; i <= n; i++)  
        { 
            ans += dp[n][K][i]; 
        } 
        return ans; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int arr[] = { 1, 2, 3 }; 
        int k = 1; 
        int n = arr.length; 
        System.out.println(subsetXOR(arr, n, k)); 
    } 
} 
  
// This code is contributed by ihritik 

