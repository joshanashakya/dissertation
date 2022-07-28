

# Python3 implementation of the approach  
  
# Function to return the maximum  
# required sub-array sum  
def maxSum(a, n):  
  
    ans = 0
    arr = [0] * (n + 1) 
      
    # Creating one based indexing 
    for i in range(1, n + 1): 
        arr[i] = a[i - 1] 
  
    # 2d array to contain solution for each step  
    dp = [[0 for i in range(3)]  
             for j in range(n + 1)]  
    for i in range(0, n + 1):  
          
        # Case 1: Choosing current or  
        # (current + previous) whichever is smaller  
        dp[i][0] = max(arr[i], dp[i - 1][0] + arr[i])  
  
        # Case 2:(a) Altering sign and add to  
        # previous case 1 or value 0  
        dp[i][1] = max(0, dp[i - 1][0]) - arr[i]  
  
        # Case 2:(b) Adding current element with  
        # previous case 2 and updating the maximum  
        if i >= 2:  
            dp[i][1] = max(dp[i][1], 
                           dp[i - 1][1] + arr[i])  
  
        # Case 3:(a) Altering sign and  
        # add to previous case 2  
        if i >= 2:  
            dp[i][2] = dp[i - 1][1] - arr[i]  
  
        # Case 3:(b) Adding current element 
        # with previous case 3  
        if i >= 3:  
            dp[i][2] = max(dp[i][2],  
                           dp[i - 1][2] + arr[i])  
  
        # Updating the maximum value 
        # of variable ans  
        ans = max(ans, dp[i][0])  
        ans = max(ans, dp[i][1])  
        ans = max(ans, dp[i][2])  
      
    # Return the final solution  
    return ans  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [-5, 3, 2, 7, -8, 3,  
            7, -9, 10, 12, -6]  
    n = len(arr)  
    print(maxSum(arr, n))  
  
# This code is contributed by Rituraj Jain 

