

# Python3 code to find absolute distinct 
# count of an array in O(n) time. 
  
# This function returns number of 
# distinct absolute values among 
# the elements of the array 
def distinctCount(arr, n): 
    s = set() 
      
    # set keeps all unique elements 
    for i in range(n): 
        s.add(abs(arr[i])) 
    return len(s) 
  
# Driver Code 
arr = [-2, -1, 0, 1, 1] 
n = len(arr) 
print("Count of absolute distinct values:", 
                     distinctCount(arr, n)) 
  
# This code is contributed 
# by Adarsh_Verma  

