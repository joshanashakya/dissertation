

// A simple recursive program to find n-th 
// leonardo number. 
import java.io.*; 
  
class GFG { 
  
    static int leonardo(int n) 
    { 
        int dp[] = new int[n + 1]; 
        dp[0] = dp[1] = 1; 
        for (int i = 2; i <= n; i++) 
            dp[i] = dp[i - 1] + dp[i - 2] + 1; 
        return dp[n]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        System.out.println(leonardo(3)); 
    } 
} 
  
/*This code is contributed by vt_m.*/

