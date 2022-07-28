

# Python3 implementation of the approach 
  
# Function that returns true if num is 
# greater than both arr[i] and arr[j] 
def isPeak(arr, n, num, i, j): 
  
    # If num is smaller than the element 
    # on the left (if exists) 
    if (i >= 0 and arr[i] > num): 
        return False
  
    # If num is smaller than the element 
    # on the right (if exists) 
    if (j < n and arr[j] > num): 
        return False
    return True
  
# Function that returns true if num is 
# smaller than both arr[i] and arr[j] 
def isTrough(arr, n, num, i, j): 
  
    # If num is greater than the element 
    # on the left (if exists) 
    if (i >= 0 and arr[i] < num): 
        return False
  
    # If num is greater than the element 
    # on the right (if exists) 
    if (j < n and arr[j] < num): 
        return False
    return True
  
def printPeaksTroughs(arr, n): 
  
    print("Peaks : ", end = "") 
  
    # For every element 
    for i in range(n): 
  
        # If the current element is a peak 
        if (isPeak(arr, n, arr[i], i - 1, i + 1)): 
            print(arr[i], end = " ") 
    print() 
  
    print("Troughs : ", end = "") 
  
    # For every element 
    for i in range(n): 
  
        # If the current element is a trough 
        if (isTrough(arr, n, arr[i], i - 1, i + 1)): 
            print(arr[i], end = " ") 
  
# Driver code 
arr = [5, 10, 5, 7, 4, 3, 5] 
n = len(arr) 
  
printPeaksTroughs(arr, n) 
  
# This code is contributed by Mohit Kumar 

