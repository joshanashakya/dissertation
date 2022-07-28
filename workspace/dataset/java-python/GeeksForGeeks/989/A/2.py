

# Python3 implementation of the approach 
  
# Function to recursively fill the dp array 
def f(i, state, A, dp, N): 
    if i >= N: 
        return 0
  
    # If f(i, state) is already calculated 
    # then return the value 
    elif dp[i][state] != -1: 
        return dp[i][state] 
  
    # Calculate f(i, state) according to the 
    # recurrence relation and store in dp[][] 
    else: 
        if i == N - 1: 
            dp[i][state] = 1
        elif state == 1 and A[i] > A[i + 1]: 
            dp[i][state] = 1
        elif state == 2 and A[i] < A[i + 1]: 
            dp[i][state] = 1
        elif state == 1 and A[i] <= A[i + 1]: 
            dp[i][state] = 1 + f(i + 1, 2, A, dp, N) 
        elif state == 2 and A[i] >= A[i + 1]: 
            dp[i][state] = 1 + f(i + 1, 1, A, dp, N) 
  
        return dp[i][state] 
  
# Function that calls the resucrsive function to 
# fill the dp array and then returns the result 
def maxLenSeq(A, N): 
  
    # dp[][] array for storing result 
    # of f(i, 1) and f(1, 2) 
    # Populating the array dp[] with -1 
    dp = [[-1, -1, -1] for i in range(1000)] 
  
    # Make sure that longest UD and DU 
    # sequence starting at each 
    # index is calculated 
    for i in range(N): 
        tmp = f(i, 1, A, dp, N) 
        tmp = f(i, 2, A, dp, N) 
  
    # Assume the answer to be -1 
    # This value will only increase 
    ans = -1
    for i in range(N): 
  
        # y is the length of the longest 
        # UD sequence starting at i 
        y = dp[i][1] 
        if (i + y) >= N: 
            ans = max(ans, dp[i][1] + 1) 
  
        # If length is even then add an integer 
        # and then a DU sequence starting at i + y 
        elif y % 2 == 0: 
            ans = max(ans, dp[i][1] + 1 + dp[i + y][2]) 
  
        # If length is odd then add an integer 
        # and then a UD sequence starting at i + y 
        elif y % 2 == 1: 
            ans = max(ans, dp[i][1] + 1 + dp[i + y][1]) 
  
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
    A = [1, 10, 3, 20, 25, 24] 
    n = len(A) 
    print(maxLenSeq(A, n)) 
  
# This code is contributed by 
# sanjeev2552 

