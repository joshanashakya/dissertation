

# Python3 program to implement above approach  
maxLen = 10
  
# Variable to store states of dp  
dp = [0]*maxLen;  
  
# Variable to check if a given state has been solved  
visit = [0]*maxLen;  
  
# Function to find the maximum sum subsequence  
# such that no two elements are adjacent  
def maxSum(arr, i, n, k) :  
  
    # Base case  
    if (i >= n) : 
        return 0;  
  
    # To check if a state has been solved  
    if (visit[i]) :  
        return dp[i];  
          
    visit[i] = 1;  
  
    # Variable to store  
    # prefix sum for sub-array  
    # {i, j}  
    tot = 0;  
    dp[i] = maxSum(arr, i + 1, n, k);  
  
    # Required recurrence relation  
    j = i 
    while (j < i + k and j < n) : 
        tot += arr[j];  
        dp[i] = max(dp[i], tot +
                    maxSum(arr, j + 2, n, k));  
                      
        j += 1
      
    # Returning the value  
    return dp[i];  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Input array  
    arr = [ -1, 2, -3, 4, 5 ];  
  
    k = 2;  
  
    n = len(arr);  
  
    print(maxSum(arr, 0, n, k));  
      
# This code is contributed by AnkitRai01 

