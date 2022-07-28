

# Python3 implementation of the approach 
  
# Function to return the maximum 
# absolute difference between 
# any two elements of the array 
def maxAbsDiff(arr, n): 
  
    # To store the minimum and the maximum 
    # elements from the array 
    minEle = arr[0] 
    maxEle = arr[0] 
    for i in range(1, n): 
        minEle = min(minEle, arr[i]) 
        maxEle = max(maxEle, arr[i]) 
  
    return (maxEle - minEle) 
  
# Driver code 
arr = [2, 1, 5, 3] 
n = len(arr) 
print(maxAbsDiff(arr, n)) 
  
# This code is contributed  
# by mohit kumar 

