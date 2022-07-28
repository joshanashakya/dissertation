

# Python3 implementation of the above approach  
import numpy as np 
  
# A function to calculate the maximum value  
def findMax(a, n) :  
  
    dp = np.zeros((n, 2)); 
      
    # basecases  
    dp[0][0] = a[0] + a[1];  
    dp[0][1] = a[0] * a[1];  
      
    # Loop to iterate and add the max value in the dp array  
    for i in range(1, n - 1) : 
        dp[i][0] = max(dp[i - 1][0], dp[i - 1][1]) + a[i + 1];  
        dp[i][1] = dp[i - 1][0] - a[i] + a[i] * a[i + 1];  
  
    print(max(dp[n - 2][0], dp[n - 2][1]), end ="");  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [ 5, -1, -5, -3, 2, 9, -4 ];  
    findMax(arr, 7);  
      
# This code is contributed by AnkitRai01 

