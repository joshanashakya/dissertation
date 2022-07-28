

# Python method for Longest Repeated 
# Subsequence 
  
# Refer https://www.geeksforgeeks.org/longest-repeating-subsequence/ 
# for complete code. 
# This fuction mainly returns LCS(str, str) 
# with a condition that same characters at 
# same index are not considered. 
def findLongestRepeatingSubSeq(str): 
    n = len(str) 
  
    # Create and initialize DP table 
    dp = [[0 for k in range(n+1)] for l in range(n+1)] 
  
    # Fill dp table (similar to LCS loops) 
    for i in range(1, n+1): 
        for j in range(1, n+1): 
            # If characters match and indices are not same 
            if (str[i-1] == str[j-1] and i != j): 
                dp[i][j] = 1 + dp[i-1][j-1] 
  
            # If characters do not match 
            else: 
                dp[i][j] = max(dp[i][j-1], dp[i-1][j]) 
  
    return dp[n][n] 
  
# This code is contributed by Soumen Ghosh 

