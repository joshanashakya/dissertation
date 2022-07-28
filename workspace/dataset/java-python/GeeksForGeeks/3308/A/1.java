

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
    static final int N = 10000; 
    static int n, m; 
    static int[] dp = new int[N]; 
  
    // Function to reutrn the minimum 
    // number of given operations 
    // required to convert n to m 
    static int minOperations(int k)  
    { 
  
        // If k is either 0 or out of range 
        // then return max 
        if (k <= 0 || k >= 10000) 
            return 1000000000; 
  
        // If k = m then conversion is 
        // complete so return 0 
        if (k == m) 
            return 0; 
  
        dp[k] = dp[k]; 
  
        // If it has been calculated earlier 
        if (dp[k] != -1) 
            return dp[k]; 
        dp[k] = 1000000000; 
  
        // Call for 2*k and k-1 and return 
        // the minimum of them. If k is even 
        // then it can be reached by 2*k opertaions 
        // and If k is odd then it can be reached 
        // by k-1 opertaions so try both cases 
        // and return the minimum of them 
        dp[k] = 1 + Math.min(minOperations(2 * k),  
                             minOperations(k - 1)); 
        return dp[k]; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        n = 4; 
        m = 6; 
        Arrays.fill(dp, -1); 
        System.out.println(minOperations(n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

