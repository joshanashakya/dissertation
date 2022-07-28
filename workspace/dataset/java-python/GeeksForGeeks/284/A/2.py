

# An efficient Approach to count distinct elements in 
# every window of size k 
# Function to find maximum unique element in 
# a subarray of size k 
def max_U_element(a, N, M): 
      
    # map to store the unique elements and their size 
    hsh = dict() 
      
    # Number of unique elements in an window 
    dist_count = 0
    res = 0
      
    # Maximum unique element in a window 
    # store all elements till size k i.e. 
    # storing first window 
    for i in range(M): 
          
        # found an unique element 
        if(arr[i] not in hsh.keys()): 
            hsh[a[i]] = 1
            dist_count += 1
              
        # an Duplicate element inserting 
        else: 
              
            # Update the size of that element 
            hsh[a[i]] += 1
  
    res = dist_count 
    # Traverse till the end of array 
    for i in range(M, N): 
          
        # Remove fist element from map 
        if(a[i - M] in hsh.keys() and hsh[a[i - M]] == 1): 
          
            # when element present only one time 
            # in window so delete this 
            del hsh[a[i-M]] 
            dist_count -= 1
        else: 
            # when multiple time element has occurred 
            # in window so decrease size by one 
            hsh[a[i - M]] -= 1
              
        # Add new element to map 
        # If element is unique to map 
        # increment count 
        if(a[i] not in hsh.keys()): 
            hsh[a[i]] = 1
            dist_count += 1
              
        # Duplicate element found 
        # update the size of that element 
        else: 
            hsh[a[i]] += 1
              
        # Update the res 
        res = max(res, dist_count) 
  
    return res 
  
# Driver code 
arr = [1, 2, 1, 3, 4, 2, 3] 
M = 4
N = len(arr) 
print(max_U_element(arr, N, M)) 
  
# This code is contributed by mohit kumar 

