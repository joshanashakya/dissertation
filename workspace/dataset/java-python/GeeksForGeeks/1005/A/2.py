

# Function to count numbers to be added 
def countNum(arr, n): 
  
    s = dict() 
    count, maxm, minm = 0, -10**9, 10**9
  
    # Make a hash of elements and store  
    # minimum and maximum element 
    for i in range(n): 
        s[arr[i]] = 1
        if (arr[i] < minm): 
            minm = arr[i] 
        if (arr[i] > maxm): 
            maxm = arr[i] 
      
    # Traverse all elements from minimum 
    # to maximum and count if it is not 
    # in the hash 
    for i in range(minm, maxm + 1): 
        if i not in s.keys(): 
            count += 1
    return count 
  
# Driver code 
arr = [3, 5, 8, 6 ] 
n = len(arr) 
print(countNum(arr, n)) 
      
# This code is contributed by mohit kumar 

