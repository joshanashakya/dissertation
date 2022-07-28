

# A Dynamic Programming based solution  
# to count number of ways to represent  
# n as sum of four numbers  
  
dp = [[[-1 for i in range(5)]  
           for i in range(501)] 
           for i in range(501)]  
  
# "parts" is number of parts left, n is  
# the value left "nextPart" is starting  
# point from where we start trying  
# for next part.  
def countWaysUtil(n, parts, nextPart): 
      
    # Base cases  
    if (parts == 0 and n == 0): 
        return 1
    if (n <= 0 or parts <= 0): 
        return 0
  
    # If this subproblem is already solved  
    if (dp[n][nextPart][parts] != -1): 
        return dp[n][nextPart][parts] 
  
    ans = 0 # Initialize result  
  
    # Count number of ways for remaining  
    # number n-i remaining parts "parts-1",  
    # and for all part varying from  
    # 'nextPart' to 'n'  
    for i in range(nextPart, n + 1):  
        ans += countWaysUtil(n - i, parts - 1, i)  
  
    # Store computed answer in table  
    # and return result 
    dp[n][nextPart][parts] = ans  
    return (ans) 
  
# This function mainly initializes dp  
# table and calls countWaysUtil()  
def countWays(n): 
    return countWaysUtil(n, 4, 1) 
  
# Driver Code 
n = 8
print(countWays(n)) 
  
# This code is contributed  
# by sahishelangia 

