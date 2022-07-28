

# Python3 implementation of the approach 
  
# Function to return the minimum number of elements 
# whose sign must be flipped to get the positive 
# sum of array elements as close to 0 as possible 
def solve(A, n): 
  
  
    dp=[[0 for i in range(2000)] for i in range(2000)] 
  
    # boolean variable used for toggling between maps 
    flag = 1
  
    # Calculate the sum of all elements of the array 
    sum = 0
    for i in range(n): 
        sum += A[i] 
  
    # Initializing first map(dp[0]) with INT_MAX because 
    # for i=0, there are no elements in the array to flip 
    for i in range(-sum,sum+1): 
        dp[0][i] = 10**9
  
    # Base Case 
    dp[0][0] = 0
  
    for i in range(1,n+1): 
        for j in range(-sum,sum+1): 
            dp[flag][j] = 10**9
            if (j - A[i - 1] <= sum and j - A[i - 1] >= -sum): 
                dp[flag][j] = dp[flag ^ 1][j - A[i - 1]] 
            if (j + A[i - 1] <= sum
                and j + A[i - 1] >= -sum
                and dp[flag ^ 1][j + A[i - 1]] != 10**9): 
                dp[flag][j] = min(dp[flag][j], 
                                dp[flag ^ 1][j + A[i - 1]] + 1) 
  
        # For toggling 
        flag = flag ^ 1
  
    # Required sum is minimum non-negative 
    # So, we iterate from i=0 to sum and find 
    # the first i where dp[flag ^ 1][i] != INT_MAX 
    for i in range(sum+1): 
        if (dp[flag ^ 1][i] != 10**9): 
            return dp[flag ^ 1][i] 
  
    # In worst case we will flip max n-1 elements 
    return n - 1
  
# Driver code 
arr=[10, 22, 9, 33, 21, 50, 41, 60] 
n = len(arr) 
  
print(solve(arr, n)) 
  
# This code is contributed by mohit kumar 29 

