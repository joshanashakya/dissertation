

// Java implementation of the approach 
class GFG { 
  
    static int N = 100; 
  
    // Pre-processing function 
    static void pre_process(boolean dp[][], char[] s) 
    { 
  
        // Get the size of the string 
        int n = s.length; 
  
        // Initially mark every 
        // position as false 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                dp[i][j] = false; 
            } 
        } 
  
        // For the length 
        for (int j = 1; j <= n; j++) { 
  
            // Iterate for every index with 
            // length j 
            for (int i = 0; i <= n - j; i++) { 
  
                // If the length is less than 2 
                if (j <= 2) { 
  
                    // If characters are equal 
                    if (s[i] == s[i + j - 1]) { 
                        dp[i][i + j - 1] = true; 
                    } 
                } 
  
                // Check for equal 
                else if (s[i] == s[i + j - 1]) { 
                    dp[i][i + j - 1] = dp[i + 1][i + j - 2]; 
                } 
            } 
        } 
    } 
  
    // Function to answer every query in O(1) 
    static void answerQuery(int l, int r, boolean dp[][]) 
    { 
        if (dp[l][r]) { 
            System.out.println("Yes"); 
        } 
        else { 
            System.out.println("No"); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "abaaab"; 
        boolean[][] dp = new boolean[N][N]; 
        pre_process(dp, s.toCharArray()); 
  
        int queries[][] = { { 0, 1 }, { 1, 5 } }; 
        int q = queries.length; 
  
        for (int i = 0; i < q; i++) { 
            answerQuery(queries[i][0], queries[i][1], dp); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

