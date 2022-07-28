

// Java implementation of the above approach  
class GFG  
{ 
    // Function to return the number of  
    // ways of partioning  
    static int ways(String s, int n)  
    {  
        int dp[][] = new int[n][n];  
      
        // Initialize DP table  
        for (int i = 0; i < n; i++)  
            for (int j = 0; j < n; j++) 
            {  
                dp[i][j] = 0;  
            }  
      
        // Base Case  
        for (int i = 0; i < n; i++)  
            dp[0][i] = 1;  
      
        for (int i = 1; i < n; i++) 
        {  
      
            // To store sub-string S[i][j]  
            String temp = "";  
            for (int j = i; j < n; j++)  
            {  
                temp += s.charAt(j);  
      
                // To store sub-string S[k][i-1]  
                String test = "";  
                for (int k = i - 1; k >= 0; k--) 
                {  
                    test += s.charAt(k);  
                    if (test.compareTo(temp) < 0)  
                    {  
                        dp[i][j] += dp[k][i - 1];  
                    }  
                }  
            }  
        }  
      
        int ans = 0;  
        for (int i = 0; i < n; i++) 
        {  
            // Add all the ways where S[i][n-1]  
            // will be the last partition  
            ans += dp[i][n - 1];  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        String s = "aabc";  
        int n = s.length();  
      
        System.out.println(ways(s, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

