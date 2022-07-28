

# Python3 implementation to find  
# the index of first '1' in a  
# sorted array of 0's and 1's 
  
# function to find the index of first '1' 
def indexOfFirstOne(arr, n): 
  
    # traverse the array from left to right 
    for i in range(0, n): 
          
        # if true, then return i 
        if (arr[i] == 1): 
            return i 
  
    # 1's are not present in the array 
    return -1
  
# Driver program to test above 
arr = [ 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 ] 
n = len(arr) 
ans = indexOfFirstOne(arr, n) 
print(ans) 
  
# This code is contributed by saloni1297 

