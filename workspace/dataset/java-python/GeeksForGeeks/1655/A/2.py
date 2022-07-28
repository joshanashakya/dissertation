

# Python 3 for finding minimum  
# operation required 
  
# function for finding array sum 
def arraySum (arr, n) : 
  
    sm = 0
    i = 0
  
    while(i<n) : 
        sm = sm + arr[i] 
        i = i + 1
    return sm 
  
# function for finding smallest  
# element 
def smallest (arr, n) : 
  
    small = 1000000000
  
    for i in range(0, n) : 
  
        if (arr[i] < small) : 
            small = arr[i] 
    return small 
      
  
# function for finding min 
# operation 
def minOp (arr, n) : 
      
    # find array sum 
    sm = arraySum (arr, n) 
  
    # find the smallest element from  
    # array 
    small = smallest (arr, n) 
  
    # calculate min operation required 
    minOperation = sm - (n * small) 
  
    # return result 
    return minOperation 
      
# Driver function 
arr = [5, 6, 2, 4, 3] 
n = len(arr) 
print( "Minimum Operation = ", minOp (arr, n)) 
  
# This code is contributed by Nikita Tiwari. 

