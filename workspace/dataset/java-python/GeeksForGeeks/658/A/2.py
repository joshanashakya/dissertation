

   
# Python3 program to find maximum  
# difference between adjacent 
# elements in a circular array. 
  
def minAdjDifference(arr, n): 
  
    if (n < 2): return
  
    # Checking normal adjacent elements 
    res = abs(arr[1] - arr[0]) 
      
    for i in range(2, n): 
        res = min(res, abs(arr[i] - arr[i - 1])) 
  
    # Checking circular link 
    res = min(res, abs(arr[n - 1] - arr[0]))  
  
    print("Min Difference = ", res) 
  
# Driver Code 
a = [10, 12, 13, 15, 10] 
n = len(a) 
minAdjDifference(a, n)  
  
# This code is contributed by Anant Agarwal  
# and improved by Anuj Sharma. 

