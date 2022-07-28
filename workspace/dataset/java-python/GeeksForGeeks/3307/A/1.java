

// Java code to find number 
// of unique BSTs Dynamic  
// Programming solution 
import java.io.*; 
import java.util.Arrays; 
  
class GFG 
{ 
    static int numberOfBST(int n) 
    { 
  
    // DP to store the number  
    // of unique BST with key i 
    int dp[] = new int[n + 1]; 
    Arrays.fill(dp, 0); 
  
    // Base case 
    dp[0] = 1; 
    dp[1] = 1; 
  
    // fill the dp table in 
    // top-down approach. 
    for (int i = 2; i <= n; i++)  
    { 
        for (int j = 1; j <= i; j++)  
        { 
  
            // n-i in right * i-1 in left 
            dp[i] = dp[i] + (dp[i - j] *  
                             dp[j - 1]); 
        } 
    } 
  
    return dp[n]; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 3; 
    System.out.println("Number of structurally " +  
                           "Unique BST with "+ n + 
                                  " keys are : " +  
                                  numberOfBST(n)); 
} 
} 
  
// This code is contributed 
// by shiv_bhakt. 

