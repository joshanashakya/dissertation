

# Python3 implementation to find the  
# maximum sum subsequence such that  
# two adjacent element have atleast  
# difference of K in their indices 
  
# Function to find the maximum sum  
# subsequence such that two adjacent  
# element have atleast difference  
# of K in their indices  
def max_sum(arr, n, k) :  
  
    # DP Array to store the maximum  
    # sum obtained till now  
    dp = [0] * n;  
  
    # Either select the first element  
    # or Nothing  
    dp[0] = max(0, arr[0]);  
    i = 1;  
  
    # Either Select the (i - 1) element  
    # or let the previous best answer be  
    # the current best answer  
    while (i < k) : 
        dp[i] = max(dp[i - 1], arr[i]);  
        i += 1;  
  
    i = k;  
  
    # Either select the best sum  
    # till previous_index or select the  
    # current element + best_sum till index-k  
    while (i < n) : 
        dp[i] = max(dp[i - 1], arr[i] + dp[i - k]);  
        i += 1;  
      
    return dp[n - 1];  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, -2, 4, 3, 1 ];  
    n = len(arr)  
    k = 4;  
    print(max_sum(arr, n, k));  
  
# This code is contributed by AnkitRai01 

