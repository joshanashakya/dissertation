

# Python3 implementation of the approach 
  
# define long long 
N = 2005
  
ans = dict() 
  
# Recursively moving to add 
# all the numbers upto a limit 
# with sum of digits as m 
def dfs(n, left, ct): 
  
    # Max nber of digits allowed in 
    # a nber for this implementation 
    if (ct >= 15): 
        return
    if (left == 0): 
        ans[n] = 1
    for i in range(min(left, 9) + 1): 
        dfs(n * 10 + i, left - i, ct + 1) 
  
# Function to return the kth number 
# with sum of digits as m 
def getKthNum(m, k): 
    dfs(0, m, 0) 
  
    c = 0
    for it in sorted(ans.keys()): 
        c += 1
  
        # The kth smallest number is found 
        if (c == k): 
            return it 
    return -1
  
# Driver code 
m = 5
k = 3
  
print(getKthNum(m, k)) 
  
# This code is contributed by Mohit Kumar 

