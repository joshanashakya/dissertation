

# Python3 implementation of the  
# above approach 
  
# Find if slope is good with only  
# two intercept 
def isSlopeGood(slope, arr, n): 
  
    setOfLines = dict() 
    for i in range(n): 
        setOfLines[arr[i] - slope * (i)] = 1
  
    # if set of lines have only  
    # two distinct intercept 
    return len(setOfLines) == 2
  
# Function to check if required solution exist 
def checkForParallel(arr, n): 
      
    # check the result by processing 
    # the slope by starting three points 
    slope1 = isSlopeGood(arr[1] - arr[0], arr, n) 
    slope2 = isSlopeGood(arr[2] - arr[1], arr, n) 
    slope3 = isSlopeGood((arr[2] - arr[0]) // 2, arr, n) 
  
    return (slope1 or slope2 or slope3) 
  
# Driver code 
arr = [1, 6, 3, 8, 5 ] 
n = len(arr) 
if checkForParallel(arr, n): 
    print(1) 
else: 
    print(0) 
      
# This code is contributed by Mohit Kumar     

