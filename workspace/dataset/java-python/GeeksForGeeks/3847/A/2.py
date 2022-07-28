

# Python3 implementation of the approach 
  
# Utility function to prthe 
# elements of an array 
def printArray(arr, n): 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Function to return the minimum element 
# in the subarray arr[i...j] 
def getMin(arr, i, j): 
  
    # To store the minimum element 
    minVal = arr[i] 
    i += 1
    while (i <= j): 
  
        # Update the minimum element so far 
        minVal = min(minVal, arr[i]) 
        i += 1
  
    # Return the minimum element found 
    return minVal 
  
# Function to return the maximum element 
# in the subarray arr[i...j] 
def getMax(arr, i, j): 
  
    # To store the maximum element 
    maxVal = arr[i] 
    i += 1
    while (i <= j): 
  
        # Update the maximum element so far 
        maxVal = max(maxVal, arr[i]) 
        i += 1
  
    # Return the maximum element found 
    return maxVal 
  
# Function to generate the array 
# With the given operations 
def generateArr(arr, n): 
  
    # Base cases 
    if (n == 0): 
        return
    if (n == 1): 
        print(arr[0], end = "") 
        return
  
    # To store the new array elements 
    tmpArr = [0 for i in range(n)] 
  
    # The first element has no 
    # element on its left 
    tmpArr[0] = getMax(arr, 1, n - 1) 
  
    # From the second element to the 
    # second last element 
    for i in range(1, n - 1): 
  
        # Absolute difference of the maximum 
        # element to the right and the 
        # minimum element to the left 
        tmpArr[i] = abs(getMax(arr, i + 1, n - 1) -
                        getMin(arr, 0, i - 1)) 
  
    # The last element has no 
    # element on its right 
    tmpArr[n - 1] = getMin(arr, 0, n - 2) 
  
    # Print the generated array 
    printArray(tmpArr, n) 
  
# Driver code 
arr = [1, 5, 2, 4, 3] 
n = len(arr) 
  
generateArr(arr, n) 
  
# This code is contributed by Mohit Kumar 

