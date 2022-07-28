

# Python 3 implementation of the approach 
import sys 
  
# Function to return the minimum  
# value k to be added 
def FindMinNum(arr, n): 
      
    # Array to store prefix sum 
    pre = [0 for i in range(n)] 
  
    # Initialize the prefix value for first  
    # index as the first element of the array 
    pre[0] = arr[0] 
  
    # Compute the prefix sum for rest  
    # of the indices 
    for i in range(1, n, 1): 
        pre[i] = pre[i - 1] + arr[i] 
  
    k = sys.maxsize 
  
    for i in range(n - 1): 
          
        # Sum of elements from arr[i + 1] to arr[n - 1] 
        rightSum = pre[n - 1] - pre[i] 
  
        # If sum on the right side of the ith element 
        # is greater than or equal to the sum on the 
        # left side then update the value of k 
        if (rightSum >= pre[i]): 
            k = min(k, rightSum - pre[i]) 
  
    if (k != sys.maxsize): 
        return k 
  
    return -1
  
# Driver code 
if __name__ == '__main__': 
    arr = [6, 7, 1, 3, 8, 2, 4] 
    n = len(arr) 
    print(FindMinNum(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

