

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the count of 
// n-digit numbers that satisfy 
// the given conditions 
static int count_numbers(int k, int n) 
{ 
  
    // DP array to store the 
    // pre-caluclated states 
    int [][]dp = new int[n + 1][2]; 
  
    // Base cases 
    dp[1][0] = 0; 
    dp[1][1] = k - 1; 
    for (int i = 2; i <= n; i++)  
    { 
  
        // i-digit numbers ending with 0 
        // can be formed by concatenating 
        // 0 in the end of all the (i - 1)-digit 
        // number ending at a non-zero digit 
        dp[i][0] = dp[i - 1][1]; 
  
        // i-digit numbers ending with non-zero 
        // can be formed by concatenating any non-zero 
        // digit in the end of all the (i - 1)-digit 
        // number ending with any digit 
        dp[i][1] = (dp[i - 1][0] +  
                    dp[i - 1][1]) * (k - 1); 
    } 
  
    // n-digit number ending with 
    // and ending with non-zero 
    return dp[n][0] + dp[n][1]; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int k = 10; 
    int n = 3; 
    System.out.println(count_numbers(k, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

