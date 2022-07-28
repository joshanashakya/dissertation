

# Python3 program to count number of  
# strictlyincreasing subarrays in O(n) time. 
  
def countIncreasing(arr, n): 
    cnt = 0 # Initialize result 
  
    # Initialize length of current  
    # increasing subarray 
    len = 1
  
    # Traverse through the array 
    for i in range(0, n - 1) : 
          
        # If arr[i+1] is greater than arr[i], 
        # then increment length 
        if arr[i + 1] > arr[i] : 
            len += 1
              
        # Else Update count and reset length 
        else: 
            cnt += (((len - 1) * len) / 2) 
            len = 1
      
    # If last length is more than 1 
    if len > 1: 
        cnt += (((len - 1) * len) / 2) 
  
    return cnt 
  
  
# Driver program 
arr = [1, 2, 2, 4] 
n = len(arr) 
  
print ("Count of strictly increasing subarrays is", 
                        int(countIncreasing(arr, n))) 
  
  
# This code is contributed by Shreyanshi Arun. 

