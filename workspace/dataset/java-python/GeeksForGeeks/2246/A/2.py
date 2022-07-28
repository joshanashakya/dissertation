

# Python3 implementation of the approach 
import numpy as np 
  
max_size = 20 
max_k = 20 
  
  
# Array to store the states of DP  
dp = np.zeros((max_size,max_k));  
  
# Array to check if a  
# state has been solved before  
v = np.zeros((max_size,max_k));  
  
# To store the sum of  
# the array elements  
sum = 0;  
  
# Function to find the sum of  
# all the array elements  
def findSum(arr, n) :  
    global sum
    for i in range(n) : 
        sum += arr[i];  
  
  
# Function to return the number of ways  
def cntWays(arr, i, ck, k, n,  curr_sum) :  
  
    # If sum is not divisible by k  
    # answer will be zero  
    if (sum % k != 0) : 
        return 0;  
    if (i != n and ck == k + 1) : 
        return 0;  
  
    # Base case  
    if (i == n) : 
        if (ck == k + 1) : 
            return 1;  
        else : 
            return 0;  
  
    # To check if a state  
    # has been solved before  
    if (v[i][ck]) : 
        return dp[i][ck];  
  
    # Sum of all the numbers from the beginning  
    # of the array  
    curr_sum += arr[i];  
  
    # Setting the current state as solved  
    v[i][ck] = 1;  
  
    # Recurrence relation  
    dp[i][ck] = cntWays(arr, i + 1, ck, k, n, curr_sum);  
    if (curr_sum == (sum / k) * ck)  : 
        dp[i][ck] += cntWays(arr, i + 1, ck + 1, k, n, curr_sum);  
  
    # Returning solved state  
    return dp[i][ck];  
   
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, -1, 1, -1, 1, -1 ];  
    n = len(arr);  
    k = 2;  
  
    # Function call to find the  
    # sum of the array elements  
    findSum(arr, n);  
  
    # Print the number of ways  
    print(cntWays(arr, 0, 1, k, n, 0));  
  
    # This code is contributed by AnkitRai01 

