

# Python3 program to find minimum  
# value that can be assigned to all  
# elements so that product becomes  
# greater than current product. 
import math 
  
def findMinValue(arr, n): 
  
    # sort the array to apply 
    # Binary search 
    arr.sort() 
  
    # using log property add every  
    # logarithmic value of element to val 
    val = 0 # where ld is long double 
    for i in range(n): 
        val += (math.log(arr[i])) 
  
    # set left and right extremities to find 
    # min value 
    left = arr[0] 
    right = arr[n - 1] + 1
  
    while (left <= right): 
        mid = (left + right) // 2
  
        # multiplying n to mid, to find  
        # the correct min value 
        temp = n * (math.log(mid)) 
        if (val < temp): 
            ans = mid 
            right = mid - 1
        else: 
            left = mid + 1
    return ans 
  
# Driver code 
if __name__ == "__main__": 
    arr = [4, 2, 1, 10, 6] 
    n = len(arr) 
    print(findMinValue(arr, n) ) 
  
# This code is contributed  
# by ChitraNayal 

