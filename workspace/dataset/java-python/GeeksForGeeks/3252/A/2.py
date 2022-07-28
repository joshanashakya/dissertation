

# Simple python method to find sum of the 
# elements of array. 
def arraySum( arr, n): 
    _sum = 0
    for i in range(n): 
        _sum = _sum + arr[i] 
    return _sum 
  
# Driver code 
arr = [10, 11, 12, 13, 12, 11, 10] 
n = len(arr) 
print(arraySum(arr, n)) 
  
# This code is contributedc by "Abhishek Sharma 44" 

