

# Sorting based Python implementation  
# to check whether the array  
# contains a set of contiguous integers 
  
def areElementsContiguous(arr, n): 
    # Sort the array 
    arr.sort() 
      
    # After sorting, check if  
    # current element is either 
    # same as previous or is  
    # one more. 
    for i in range(1,n): 
        if (arr[i] - arr[i-1] > 1) : 
            return 0
    return 1
  
# Driver code 
arr = [ 5, 2, 3, 6, 4, 4, 6, 6 ] 
n = len(arr) 
if areElementsContiguous(arr, n): print("Yes") 
else: print("No") 
  
# This code is contributed by 'Ansu Kumari'. 

