

# Python3 code to print last duplicate  
# element and its index in a sorted array 
  
def dupLastIndex(arr, n):  
  
    # if array is null or size is less  
    # than equal to 0 return 
    if (arr == None or n <= 0):  
        return
  
    # compare elements and return last 
    # duplicate and its index 
    for i in range(n - 1, 0, -1):  
          
        if (arr[i] == arr[i - 1]):  
            print("Last index:", i, "\nLast", 
                     "duplicate item:",arr[i]) 
            return
          
    # If we reach here, then no duplicate 
    # found. 
    print("no duplicate found") 
      
  
arr = [1, 5, 5, 6, 6, 7, 9] 
n = len(arr)  
dupLastIndex(arr, n) 
  
# This code is contributed by  
# Smitha Dinesh Semwal 

