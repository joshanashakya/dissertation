

# Python 3 find maximum difference  
# of subset sum 
  
# function for maximum subset diff 
def maxDiff(arr, n): 
  
    result = 0
  
    # sort the array 
    arr.sort() 
  
    # calculate the result 
    for i in range(n - 1): 
        if (abs(arr[i]) != abs(arr[i + 1])): 
            result += abs(arr[i]) 
  
        else: 
            pass
  
    # check for last element 
    if (arr[n - 2] != arr[n - 1]): 
        result += abs(arr[n - 1]) 
  
    # return result 
    return result 
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 4, 2, -3, 3, -2, -2, 8 ] 
    n = len(arr) 
    print("Maximum Difference = " , 
                   maxDiff(arr, n)) 
  
# This code is contributed by ita_c 

