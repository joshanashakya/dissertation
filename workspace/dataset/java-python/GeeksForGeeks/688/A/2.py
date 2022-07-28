

# Python 3 program to find minimum difference  
# between groups of highest and lowest  
def CalculateMax(arr, n): 
  
    # Sorting the whole array. 
    arr.sort() 
    min_sum = arr[0] + arr[1] 
    max_sum = arr[n - 1] + arr[n - 2] 
    return abs(max_sum - min_sum) 
  
# Driver code 
arr = [6, 7, 1, 11] 
n = len(arr) 
print(CalculateMax(arr, n)) 
  
# This code is contributed 
# by Shrikant13 

