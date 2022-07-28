

# Python 3 program to find  
# the minimum cost required  
# to reach the n-th floor 
# space-optimized solution 
  
# function to find the minimum  
# cost to reach N-th floor 
def minimumCost(cost, n): 
  
    dp1 = 0
    dp2 = 0
  
    # traverse till N-th stair 
    for i in range(n): 
        dp0 = cost[i] + min(dp1, dp2) 
  
        # update the last 
        # two stairs value 
        dp2 = dp1 
        dp1 = dp0 
    return min(dp1, dp2) 
  
# Driver Code 
if __name__ == "__main__": 
    a = [ 2, 5, 3, 1, 7, 3, 4 ] 
    n = len(a) 
    print(minimumCost(a, n)) 
      
# This code is contributed 
# by ChitraNayal 

