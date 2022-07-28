

# Python3 implementation of the approach 
maxN = 20
maxM = 10
  
# To store the states of DP 
dp = [[0 for i in range(maxN)]  
         for i in range(maxM)] 
v = [[0 for i in range(maxN)]  
        for i in range(maxM)] 
  
# Function to find the required count 
def findCnt(arr, i, curr, n, m): 
      
    # Base case 
    if (i == n): 
        if (curr == 0): 
            return 1
        else: 
            return 0
  
    # If the state has been solved before 
    # return the value of the state 
    if (v[i][curr]): 
        return dp[i][curr] 
  
    # Setting the state as solved 
    v[i][curr] = 1
  
    # Recurrence relation 
    dp[i][curr] = findCnt(arr, i + 1,  
                          curr, n, m) + \ 
                  findCnt(arr, i + 1, 
                         (curr + arr[i]) % m, n, m) 
    return dp[i][curr] 
  
# Driver code 
arr = [3, 3, 3, 3] 
n = len(arr) 
m = 6
  
print(findCnt(arr, 0, 0, n, m) - 1) 
  
# This code is contributed by Mohit Kumar 

