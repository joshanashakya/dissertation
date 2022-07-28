

# Python 3 program to counts Palindromic  
# Subsequence in a given String using recursion 
  
str = "abcb"
  
# Function return the total  
# palindromic subsequence 
def countPS(i, j): 
      
    if(i >= n or j < 0): 
        return 0
      
    if(dp[i][j] != -1): 
        return dp[i][j] 
      
    # base cases 
    if(abs(i - j) == 1): 
          
        if(str[i] == str[j]) : # eg-> aaa 
            dp[i][j] = 3
            return dp[i][j] 
        else :         # eg-> ab 
            dp[i][j] = 2
            return dp[i][j] 
      
    if(i == j): 
        dp[1][j] = 1
        return dp[1][j] 
      
    elif (str[i] == str[j]): 
        dp[i][j] = (countPS(i + 1, j) + 
                    countPS(i, j - 1) + 1) 
        return dp[i][j] 
    else: 
        dp[i][j] = (countPS(i + 1, j) + 
                    countPS(i, j - 1) -
                    countPS(i + 1, j - 1)) 
        return dp[i][j] 
  
# Driver code 
if __name__ == "__main__": 
      
    dp = [[-1 for x in range(1000)] 
              for y in range(1000)] 
      
    n = len(str) 
    print("Total palindromic subsequence are :",  
                              countPS(0, n - 1)) 
  
# This code is contributed by ita_c 

