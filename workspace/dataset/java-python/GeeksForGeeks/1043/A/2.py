

# Python program to calculate the maximum sum 
# of increasing subsequence of length k 
  
def MaxIncreasingSub(arr, n, k): 
      
    # In the implementation dp[n][k] represents  
    # maximum sum subsequence of length k and the  
    # subsequence is ending at index n. 
    dp = [-1]*n 
    ans = -1
  
    # Initializing whole multidimensional 
    # dp array with value - 1 
    for i in range(n): 
        dp[i] = [-1]*(k+1) 
  
    # For each ith position increasing subsequence 
    # of length 1 is equal to that array ith value 
    # so initializing dp[i][1] with that array value 
    for i in range(n): 
        dp[i][1] = arr[i] 
      
    # Starting from 1st index as we have calculated 
    # for 0th index. Computing optimized dp values 
    # in bottom-up manner 
    for i in range(1,n): 
        for j in range(i): 
              
            # check for increasing subsequence 
            if arr[j] < arr[i]: 
                for l in range(1,k): 
  
                    # Proceed if value is pre calculated 
                    if dp[j][l] != -1: 
                          
                        # Check for all the subsequences 
                        # ending at any j < i and try including 
                        # element at index i in them for 
                        # some length l. Update the maximum 
                        # value for every length. 
                        dp[i][l+1] = max(dp[i][l+1], 
                                        dp[j][l] + arr[i]) 
      
    # The final result would be the maximum  
    # value of dp[i][k] for all different i. 
    for i in range(n): 
        if ans < dp[i][k]: 
            ans = dp[i][k] 
      
    # When no subsequence of length k is 
    # possible sum would be considered zero 
    return (0 if ans == -1 else ans) 
  
# Driver Code 
if __name__ == "__main__": 
  
    n, k = 8, 3
    arr = [8, 5, 9, 10, 5, 6, 21, 8] 
    ans = MaxIncreasingSub(arr, n, k) 
    print(ans) 
  
# This code is contributed by 
# sanjeev2552 

