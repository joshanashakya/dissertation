

# Python 3 program for the above approach 
import sys 
  
# 3D dp table to store the state value 
dp = [[[-1 for i in range(100)]for j in range(100)] for k in range(100)] 
  
# Function that count the combination 
# of 0's and 1's from the given list 
# of string 
def countString(m, n, arr, i): 
      
    # Base Case if count of 0's or 1's 
    # becomes negative 
    if (m < 0 or n < 0): 
        return -sys.maxsize - 1
  
    # If index reaches out of bound 
    if (i >= len(arr)): 
        return 0
  
    # Return the prestored result 
    if (dp[m][n][i] != -1): 
        return dp[m][n][i] 
  
    # Intialise count of 0's and 1's 
    # to 0 for the current state 
    zero = 0
    one = 0
  
    # Calculate the number of 1's and 
    # 0's in current string 
    for c in arr[i]: 
        if (c == '0'): 
            zero += 1
        else: 
            one += 1
  
    # Include the current string and 
    # recurr for the next iteration 
    x = 1 + countString(m - zero, n - one, arr, i + 1) 
  
    # Exclude the current string and 
    # recurr for the next iteration 
    y = countString(m, n, arr, i + 1) 
      
    dp[m][n][i] = max(x, y) 
  
    # Update the maximum of the above 
    # two states to the current dp state 
    return dp[m][n][i] 
  
# Driver Code 
if __name__ == '__main__': 
    arr = ["10", "0001", "1","111001", "0"] 
  
    # N 0's and M 1's 
    N = 3
    M = 5
  
    # Function call 
    print(countString(M, N, arr, 0)) 
      
# This code is contributed by Surendra_Gangwar 

