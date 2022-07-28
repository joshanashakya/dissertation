

# Python 3 implementation of  
# the above approach 
  
# Function to find the element 
def findEle(arr, n) : 
      
    # sum is use to store  
    # sum of all elements  
    # of array  
    sum = 0
      
    for i in range(n) : 
        sum += arr[i] 
      
    # iterate over all elements 
    for i in range(n) : 
        if arr[i] == sum - arr[i] : 
            return arr[i] 
      
    return -1
  
# Driver Code 
if __name__ == "__main__" : 
      
    arr = [1, 2, 3, 6 ] 
    n = len(arr) 
    print(findEle(arr, n)) 
  
# This code is contributed by Ryuga 

