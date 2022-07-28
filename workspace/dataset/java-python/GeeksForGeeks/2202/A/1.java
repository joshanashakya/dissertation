

// Java implementation of the approach 
  
class GFG 
{ 
          
    static int MOD = 1000000007; 
      
    // Function to return the total number of  
    // required sub-sets 
    static int totalSubSets(int n, int l, int r) 
    { 
      
        // Variable to store total elements  
        // which on dividing by 3 give  
        // remainder 0, 1 and 2 respectively 
        int zero = (int)Math.floor((double)r / 3) 
                - (int)Math.ceil((double)l / 3) + 1; 
        int one = (int)Math.floor((double)(r - 1) / 3) 
                - (int)Math.ceil((double)(l - 1) / 3) + 1; 
        int two = (int)Math.floor((double)(r - 2) / 3) 
                - (int)Math.ceil((double)(l - 2) / 3) + 1; 
      
        // Create a dp table 
        int [][] dp = new int[n][3]; 
      
        dp[0][0] = zero; 
        dp[0][1] = one; 
        dp[0][2] = two; 
      
        // Process for n states and store 
        // the sum (mod 3) for 0, 1 and 2 
        for (int i = 1; i < n; ++i) 
        { 
      
            // Use of MOD for large numbers 
            dp[i][0] = ((dp[i - 1][0] * zero) 
                        + (dp[i - 1][1] * two) 
                        + (dp[i - 1][2] * one)) 
                    % MOD; 
            dp[i][1] = ((dp[i - 1][0] * one) 
                        + (dp[i - 1][1] * zero) 
                        + (dp[i - 1][2] * two)) 
                    % MOD; 
            dp[i][2] = ((dp[i - 1][0] * two) 
                        + (dp[i - 1][1] * one) 
                        + (dp[i - 1][2] * zero)) 
                    % MOD; 
        } 
      
        // Final answer store at dp[n - 1][0] 
        return dp[n - 1][0]; 
    } 
      
    // Driver Program 
    public static void main(String []args) 
    { 
        int n = 5; 
        int l = 10; 
        int r = 100; 
        System.out.println(totalSubSets(n, l, r)); 
    } 
} 
  
// This code is contributed by ihritik 

