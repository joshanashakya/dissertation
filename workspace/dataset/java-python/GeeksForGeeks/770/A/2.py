

# Python3 program to find theSum of all  
# minimum occurring elements in an array 
import math as mt 
  
# Function to find theSum of all minimum 
# occurring elements in an array 
def findSum(arr, N): 
  
    # Store frequencies of elements 
    # of the array 
    mp = dict() 
    for i in arr: 
        if i in mp.keys(): 
            mp[i] += 1
        else: 
            mp[i] = 1
  
    # Find the min frequency 
    minFreq = 10**9
    for itr in mp: 
        if mp[itr]< minFreq: 
            minFreq = mp[itr] 
          
    # Traverse the map again and  
    # find theSum 
    Sum = 0
    for itr in mp: 
        if mp[itr]== minFreq: 
            Sum += itr * mp[itr] 
          
    return Sum
  
# Driver Code 
arr = [ 10, 20, 30, 40, 40]  
  
N = len(arr) 
  
print(findSum(arr, N)) 
  
# This code is contributed by 
# mohit kumar 29 

