

      
# Python 3 implementation  
# of above approach 
  
# Utility Function to find the  
# index with maximum difference 
def maxIndexDiff(arr,n): 
    LMin = [None] * n 
    RMax = [None] * n 
  
    # Construct LMin[] such that LMin[i] 
    # stores the minimum value 
    # from (arr[0], arr[1], ... arr[i]) 
    LMin[0] = arr[0] 
    for i in range(1, n): 
        LMin[i] = min(arr[i], LMin[i - 1]) 
  
    # Construct RMax[] such that RMax[j] 
    # stores the maximum value 
    # from (arr[j], arr[j+1], ..arr[n-1]) 
    RMax[n - 1] = arr[n - 1] 
    for j in range(n - 2,-1,-1): 
        RMax[j] = max(arr[j], RMax[j + 1]) 
  
    # Traverse both arrays from left  
    # to right to find optimum j - i 
    # This process is similar to merge() 
    # of MergeSort 
    i = 0
    j = 0
    maxDiff = -1
    while (j < n and i < n):  
        if (LMin[i] < RMax[j]):  
            maxDiff = max(maxDiff, j - i) 
            j = j + 1
          
        else: 
            i = i + 1
  
    return maxDiff + 1
  
# utility Function which subtracts X  
# from all the elements in the array 
def modifyarr(arr, n, x): 
    for i in range(n): 
        arr[i] = arr[i] - x 
  
# Calculating the prefix sum  
# array of the modified array 
def calcprefix(arr, n): 
    s = 0
    for i in range(n): 
        s += arr[i] 
        arr[i] = s 
  
# Function to find the length of the 
# longest subarray with average >= x 
def longestsubarray(arr, n, x): 
    modifyarr(arr, n, x) 
    calcprefix(arr, n) 
  
    return maxIndexDiff(arr, n) 
  
# Driver code 
if __name__ == "__main__": 
    arr = [ 1, 1, 2, -1, -1, 1 ] 
    x = 1
    n = len(arr) 
    print(longestsubarray(arr, n, x))  
  
# This code is contributed by ChitraNayal 

