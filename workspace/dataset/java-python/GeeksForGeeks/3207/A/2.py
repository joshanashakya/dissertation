

# Python3 implementation to find the  
# minimum length of the array 
import numpy as np 
  
# Function to find the  
# length of minimized array  
def minimalLength(a, n) : 
  
    # Creating the required dp tables  
    # Initialising the dp table by -1  
    dp = np.ones((n + 1,n + 1)) * -1; 
    dp1 = [0]*n;  
      
    for size in range(1, n + 1) :  
        for i in range( n - size + 1) : 
            j = i + size - 1;  
  
            # base case  
            if (i == j) : 
                dp[i][j] = a[i];  
            else : 
                for k in range(i,j) : 
  
                    # Check if the two subarray  
                    # can be combined  
                    if (dp[i][k] != -1 and dp[i][k] == dp[k + 1][j]) : 
  
                        dp[i][j] = dp[i][k] + 1;  
  
    # Intialising dp1 table with max value  
    for i in range(n) :  
        dp1[i] = int(1e7);  
  
    for i in range(n) : 
        for j in range(i + 1) : 
  
            # Check if the subarray can be  
            # reduced to a single element  
            if (dp[j][i] != -1) : 
                if (j == 0) : 
                    dp1[i] = 1;  
  
                # Minimal partition  
                # of [1: j-1] + 1  
                else : 
                    dp1[i] = min(  
                        dp1[i],  
                        dp1[j - 1] + 1);  
  
    return dp1[n - 1];  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 7; 
    a = [ 3, 3, 4, 4, 4, 3, 3 ]; 
    print(minimalLength(a, n));  
  
    # This code is contributed by Yash_R 

