

# Python3 implementation of the approach  
  
# Function to return the minimum 
# required difference  
def findMinDifference(arr, n) : 
  
    # Sort the given array  
    arr.sort()  
  
    # When minimum element is removed  
    diff1 = arr[n - 1] - arr[1] 
  
    # When maximum element is removed  
    diff2 = arr[n - 2] - arr[0]  
  
    # Return the minimum of diff1 and diff2  
    return min(diff1, diff2)  
  
# Driver Code  
if __name__ == "__main__" : 
  
    arr = [ 1, 2, 4, 3, 4 ]  
    n = len(arr)  
  
    print(findMinDifference(arr, n))  
  
# This code is contributed by Ryuga 

