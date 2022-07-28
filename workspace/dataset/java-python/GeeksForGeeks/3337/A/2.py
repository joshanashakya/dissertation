

# Python 3 program to find minimum cost  
# to make two numeric strings identical 
  
# Function to find weight of LCS 
def lcs(dp, a, b, m, n): 
  
    for i in range(100): 
        for j in range(100): 
            dp[i][j] = -1
  
    if (m < 0 or n < 0) : 
        return 0
  
    # if this state is already calculated  
    # then return 
    if (dp[m][n] != -1): 
        return dp[m][n] 
  
    ans = 0
    if (a[m] == b[n]): 
          
        # adding required weight for 
        # particular match 
        ans = (ord(a[m]) - 48) + lcs(dp, a, b, 
                                     m - 1, n - 1) 
      
    else: 
          
        # recurse for left and right child 
        # and store the max 
        ans = max(lcs(dp, a, b, m - 1, n), 
                  lcs(dp, a, b, m, n - 1)) 
  
    dp[m][n] = ans 
    return ans 
  
# Function to calculate cost of string 
def costOfString(s): 
      
    cost = 0
  
    for i in range(len(s)): 
        cost += (ord(s[i]) - 48) 
  
    return cost 
  
# Driver code 
if __name__ == "__main__": 
  
    a = "9142"
    b = "1429"
  
    dp = [[0 for x in range(101)]  
             for y in range(101)] 
  
    # Minimum cost needed to make two 
    # strings identical 
    print(costOfString(a) + costOfString(b) - 2 * 
           lcs(dp, a, b, len(a) - 1, len(b) - 1)) 
  
# This code is contributed by ita_c 

