

# Python3 implementation of the above approach  
  
import numpy as np 
  
SIZE = 3;  
N = 3;  
  
# Function to return the minimized sum  
def minSum(A, B, C, i, n, curr, dp) :  
  
    # If all the indices have been used  
    if (n <= 0) : 
        return 0;  
  
    # If this value is pre-calculated  
    # then return its value from dp array  
    # instead of re-computing it  
    if (dp[n][curr] != -1) : 
        return dp[n][curr];  
  
    # Here curr is the array chosen  
    # for the (i - 1)th element  
    # 0 for A[], 1 for B[] and 2 for C[]  
  
    # If A[i - 1] was chosen previously then  
    # only B[i] or C[i] can chosen now  
    # choose the one which leads  
    # to the minimum sum  
    if (curr == 0) :  
        dp[n][curr] = min( B[i] + minSum(A, B, C, i + 1, n - 1, 1, dp),  
        C[i] + minSum(A, B, C, i + 1, n - 1, 2, dp));  
        return dp[n][curr]  
      
  
    # If B[i - 1] was chosen previously then  
    # only A[i] or C[i] can chosen now  
    # choose the one which leads  
    # to the minimum sum  
    if (curr == 1) : 
        dp[n][curr] = min(A[i] + minSum(A, B, C, i + 1, n - 1, 0, dp),  
        C[i] + minSum(A, B, C, i + 1, n - 1, 2, dp));  
        return dp[n][curr] 
  
    # If C[i - 1] was chosen previously then  
    # only A[i] or B[i] can chosen now  
    # choose the one which leads  
    # to the minimum sum  
    dp[n][curr] = min(A[i] + minSum(A, B, C, i + 1, n - 1, 0, dp),  
    B[i] + minSum(A, B, C, i + 1, n - 1, 1, dp));  
      
    return dp[n][curr] 
  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = [ 1, 50, 1 ];  
    B = [ 50, 50, 50 ];  
    C = [ 50, 50, 50 ];  
  
    # Initialize the dp[][] array  
    dp = np.zeros((SIZE,N));  
      
    for i in range(SIZE) : 
        for j in range(N) :  
            dp[i][j] = -1;  
  
    # min(start with A[0], start with B[0], start with C[0])  
    print(min(A[0] + minSum(A, B, C, 1, SIZE - 1, 0, dp),  
                min(B[0] + minSum(A, B, C, 1, SIZE - 1, 1, dp),  
                C[0] + minSum(A, B, C, 1, SIZE - 1, 2, dp))));  
  
# This code is contributed by AnkitRai01 

