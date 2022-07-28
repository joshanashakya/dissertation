

# Python3 program to count frequencies of array items 
def countFreq(arr, n): 
      
    mp = {} 
      
    # Traverse through array elements and 
    # count frequencies 
    for i in range(n): 
        if arr[i] not in mp: 
            mp[arr[i]] = 0
        mp[arr[i]] += 1
          
    # To prelements according to first 
    # occurrence, traverse array one more time 
    # prfrequencies of elements and mark 
    # frequencies as -1 so that same element 
    # is not printed multiple times. 
    for i in range(n): 
        if (mp[arr[i]] != -1): 
            print(arr[i],mp[arr[i]]) 
        mp[arr[i]] = -1
  
# Driver code 
  
arr = [10, 20, 20, 10, 10, 20, 5, 20] 
n = len(arr) 
countFreq(arr, n) 
  
# This code is contributed by shubhamsingh10 

