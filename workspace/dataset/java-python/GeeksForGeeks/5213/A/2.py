

# Python 3 implementation of the approach 
arrSize = 51
  
# To store the states of dp 
dp = [0 for i in range(arrSize)] 
v = [False for i in range(arrSize)] 
  
# Function to return the maximized sum 
def sumMax(i,arr,n): 
    # Base case 
    if (i >= n - 1): 
        return 0
  
    # Checks if a state is 
    # already solved 
    if (v[i]): 
        return dp[i] 
    v[i] = True
    # Recurrence relation 
    dp[i] = max(arr[i] + arr[i + 1] + sumMax(i + 3, arr, n), 
                                        sumMax(i + 1, arr, n)) 
    # Return the result 
    return dp[i] 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 1, 1, 1] 
    n = len(arr) 
    print(sumMax(0, arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

