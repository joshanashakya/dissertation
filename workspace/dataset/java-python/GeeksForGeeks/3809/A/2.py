

# Function to find sum of all odd  
# occurring elements in an array 
import collections 
  
def findsum(arr, N): 
      
    # Store frequencies of elements 
    # of an array in dictionary 
    mp = collections.defaultdict(int) 
      
    for i in range(N): 
        mp[arr[i]] += 1
      
    # Variable to store sum of all  
    # odd occurring elements 
    sum = 0
      
    # loop to iterate through dictionary 
    for i in mp: 
          
        # Check if frequency is odd 
        if (mp[i] % 2 != 0): 
            sum += (i * mp[i]) 
    return sum
      
# Driver Code 
arr = [ 10, 20, 20, 10, 40, 40, 10 ] 
  
N = len(arr) 
  
print (findsum(arr, N)) 
              
# This cde is contributed 
# by HardeepSingh.              

