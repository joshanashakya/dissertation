

# Python3 implementation of the above approach  
import numpy as np 
  
# Function to return sum of subarray from l to r  
def Sum(arr, l, r) :  
  
    # calculate sum by a loop from l to r  
    s = 0;  
    for i in range(l, r + 1) : 
        s += arr[i];  
  
    return s;  
  
# dp to store the values of sub problems  
dp = np.zeros((101, 101, 101));  
  
def solve(arr, l, r, k) : 
  
    # if length of the array is less than k  
    # return the sum  
    if (r - l + 1 <= k) : 
        return Sum(arr, l, r);  
  
    # if the value is previously calculated  
    if (dp[l][r][k]) : 
        return dp[l][r][k];  
  
    # else calculate the value  
    sum_ = Sum(arr, l, r);  
    len_r = (r - l + 1) - k;  
    length = (r - l + 1);  
    ans = 0;  
  
    # select all the sub array of length len_r  
    for i in range(length - len_r + 1) : 
          
        # get the sum of that sub array  
        sum_sub = Sum(arr, i + l, i + l + len_r - 1);  
  
        # check if it is the maximum or not  
        ans = max(ans, (sum_ - sum_sub) + (sum_sub -
                            solve(arr, i + l, i + l + len_r - 1, k)));  
  
    # store it in the table  
    dp[l][r][k] = ans;  
  
    return ans;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 10, 15, 20, 9, 2, 5 ]; k = 2;  
      
    n = len(arr);  
  
    print(solve(arr, 0, n - 1, k));  
  
# This code is contributed by AnkitRai01 

