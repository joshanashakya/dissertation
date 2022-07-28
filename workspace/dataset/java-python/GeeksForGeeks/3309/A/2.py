

# Python3 implementation of the approach  
import numpy as np 
  
maxN = 20
maxM = 64
  
# To store the states of DP  
dp = np.zeros((maxN, maxM));  
v = np.zeros((maxN, maxM));  
  
# Function to return the required length  
def findLen(arr, i, curr, n, m) : 
  
    # Base case  
    if (i == n) : 
        if (curr == m) : 
            return 0;  
        else : 
            return -1;  
  
    # If the state has been solved before  
    # return the value of the state  
    if (v[i][curr]) : 
        return dp[i][curr];  
  
    # Setting the state as solved  
    v[i][curr] = 1;  
  
    # Recurrence relation  
    l = findLen(arr, i + 1, curr, n, m);  
    r = findLen(arr, i + 1, curr | arr[i], n, m);  
    dp[i][curr] = l;  
    if (r != -1) : 
        dp[i][curr] = max(dp[i][curr], r + 1);  
    return dp[i][curr];  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 7, 2, 3 ];  
    n = len(arr);  
    m = 3;  
  
    ans = findLen(arr, 0, 0, n, m);  
    if (ans == -1) : 
        print(0);  
    else : 
        print(ans);  
  
# This code is contributed by AnkitRai01 

