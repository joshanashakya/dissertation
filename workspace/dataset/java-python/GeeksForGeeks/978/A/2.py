

# Python3 implementation of the approach  
  
import numpy as np 
import sys 
  
C_MAX = 30
max_arr_len = 10
  
# To store states of DP  
dp = np.zeros((max_arr_len,C_MAX + 1));  
  
# To check if a state has  
# been solved  
v = np.zeros((max_arr_len,C_MAX + 1));  
  
INT_MIN = -(sys.maxsize) + 1
  
# Function to compute the states  
def findMax(i, r, w, n) :  
  
    # Base case  
    if (r < 0) : 
        return INT_MIN;  
          
    if (i == n) : 
        return 0;  
  
    # Check if a state has  
    # been solved  
    if (v[i][r]) : 
        return dp[i][r];  
  
    # Setting a state as solved  
    v[i][r] = 1;  
    dp[i][r] = max(w[i] + findMax(i + 1, r - w[i], w, n),  
                findMax(i + 1, r, w, n));  
  
    # Returning the solved state  
    return dp[i][r];  
  
  
# Function to pre-compute the states  
# dp[0][0], dp[0][1], .., dp[0][C_MAX]  
def preCompute(w, n) :  
  
    for i in range(C_MAX, -1, -1) : 
        findMax(0, i, w, n);  
  
  
# Function to answer a query in O(1)  
def ansQuery(w) :  
  
    return dp[0][w];  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    w = [ 3, 8, 9 ];  
    n = len(w)  
  
    # Performing required  
    # pre-computation  
    preCompute(w, n);  
  
    queries = [ 11, 10, 4 ];  
    q = len(queries) 
  
    # Perform queries  
    for i in range(q) : 
        print(ansQuery(queries[i])); 
  
  
# This code is coontributed by AnkitRai01 

