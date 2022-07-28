

# Python3 program to find Minimum number 
# of changes to make array distinct 
  
# Fucntion that returns minimum  
# number of changes 
def minimumOperations(a, n): 
  
    # Hash-table to store frequency 
    mp = dict() 
  
    # Increase the frequency of elements 
    for i in range(n): 
        if a[i] in mp.keys(): 
            mp[a[i]] += 1
        else: 
            mp[a[i]] = 1
  
    count = 0
  
    # Traverse in the map to sum up the  
    # (occurrences-1)of duplicate elements 
    for it in mp: 
        if (mp[it] > 1): 
            count += mp[it] - 1
      
    return count 
  
# Driver Code 
a = [2, 1, 2, 3, 3, 4, 3 ] 
n = len(a) 
  
print(minimumOperations(a, n)) 
      
# This code is contributed 
# by Mohit Kumar 

