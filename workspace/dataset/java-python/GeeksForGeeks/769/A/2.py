

# Python3 program to find the Sum of all maximum 
# occurring elements in an array 
  
# Function to find the Sum of all maximum 
# occurring elements in an array 
def findSum(arr, N): 
      
    # Store frequencies of elements 
    # of the array 
    mp = dict() 
    for i in range(N):  
        mp[arr[i]] = mp.get(arr[i], 0) + 1
      
  
    # Find the max frequency 
    maxFreq = 0
    for itr in mp: 
        if (mp[itr] > maxFreq): 
            maxFreq = mp[itr] 
          
  
    # Traverse the map again and find the Sum 
    Sum = 0
    for itr in mp: 
        if (mp[itr] == maxFreq): 
            Sum += itr* mp[itr] 
      
    return Sum
  
  
# Driver Code 
  
arr= [1, 1, 2, 2, 2, 2, 3, 3, 3, 3 ] 
  
N = len(arr) 
  
print(findSum(arr, N)) 
  
# This code is contributed by mohit kumar 

