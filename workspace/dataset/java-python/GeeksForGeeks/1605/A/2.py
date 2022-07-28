

# Python Program to find the minimum element to 
# be added such that the array can be partitioned 
# into two contiguous subarrays with equal sums 
  
# Class to store the minimum element 
# and its position 
class Data: 
    def __init__(self): 
        self.element = -1
        self.position = -1
  
  
def findMinElement(arr, n): 
    result = Data() 
  
    # initialize prefix and suffix sum arrays with 0 
    prefixSum = [0]*n 
    suffixSum = [0]*n 
  
    prefixSum[0] = arr[0] 
    for i in range(1, n): 
  
        # add current element to Sum 
        prefixSum[i] = prefixSum[i-1] + arr[i]\ 
  
    suffixSum[n-1] = arr[n-1] 
    for i in range(n-2, -1, -1): 
  
        # add current element to Sum 
        suffixSum[i] = suffixSum[i+1] + arr[i] 
  
    # initialize the minimum element to be a large value 
    mini = suffixSum[0] 
    pos = 0
    for i in range(n-1): 
  
        # check for the minimum absolute difference 
        # between current prefix sum and the next 
        # suffix sum element 
        if abs(suffixSum[i+1]-prefixSum[i]) < mini: 
            mini = abs(suffixSum[i+1] - prefixSum[i]) 
  
            # if prefixsum has a greater value then position 
            # is the next element, else it's the same element. 
            if suffixSum[i+1] < prefixSum[i]: 
                pos = i+1
            else: 
                pos = i 
  
    # return the data in class. 
    result.element = mini 
    result.position = pos 
  
    return result 
  
  
# Driver Code 
if __name__ == "__main__": 
    arr = [10, 1, 2, 3, 4] 
    n = len(arr) 
    values = Data() 
  
    values = findMinElement(arr, n) 
  
    print("Minimum element :", values.element, "\nPosition :", values.position) 
  
# This code is contributed by 
# sanjeev2552 

