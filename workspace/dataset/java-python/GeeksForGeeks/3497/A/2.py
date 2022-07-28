

# A memoization based implementation for 
# counting ways to reach a score using  
# 1 and 2 with consecutive 2 allowed 
  
MAX = 101
dp = [[-1 for i in range(2)]  
          for i in range(MAX)] 
  
def CountWays(n, flag): 
      
    # if this state is already visited  
    # return its value 
    if (dp[n][flag] != -1): 
        return dp[n][flag] 
  
    # base case 
    if (n == 0): 
        return 1
  
    # 2 is not scored last time so  
    # we can score either 2 or 1 
    sum = 0
    if (flag == 0 and n > 1): 
        sum = (sum + CountWays(n - 1, 0) +
                     CountWays(n - 2, 1)) 
  
    # 2 is scored last time so we  
    # can only score 1 
    else: 
        sum = sum + CountWays(n - 1, 0) 
  
    dp[n][flag] = sum
    return dp[n][flag] 
  
# Driver Code 
if __name__ == '__main__': 
    n = 5
    print(CountWays(n, 0)) 
  
# This code is contributed by 
# Surendra_Gangwar 

