

# Python3 program original array from an 
# array that stores counts of greater  
# elements on right 
def originalArray(greater, n): 
      
    # array that is used to include  
    # every element only once 
    temp = [] 
      
    for i in range(n + 1): 
        temp.append(i) 
          
    # traverse the array element 
    arr = [0 for i in range(n)] 
      
    for i in range(n): 
  
        # find the Kth (n-greater[i]-i) 
        # smallest element in Include_array 
        k = n - greater[i] - i 
          
        arr[i] = temp[k] 
          
        # remove current kth element 
        # from include array 
        del temp[k] 
          
    for i in range(n): 
        print(arr[i], end = " ") 
          
# Driver code 
arr = [6, 3, 2, 1, 0, 1, 0] 
n = len(arr) 
originalArray(arr, n) 
  
# This code is contributed  
# by Mohit Kumar 

