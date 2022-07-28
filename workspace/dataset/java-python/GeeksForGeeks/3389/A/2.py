

# Python3 program to find the minimum  
# number of operations required to  
# make all elements of array equal  
from collections import defaultdict 
  
# Function for min operation  
def minOperation(arr, n):  
  
    # Insert all elements in hash.  
    Hash = defaultdict(lambda:0)  
    for i in range(0, n):  
        Hash[arr[i]] += 1
  
    # find the max frequency  
    max_count = 0
    for i in Hash:  
        if max_count < Hash[i]:  
            max_count = Hash[i]  
  
    # return result  
    return n - max_count  
  
# Driver Code 
if __name__ == "__main__":  
  
    arr = [1, 5, 2, 1, 3, 2, 1]  
    n = len(arr)  
    print(minOperation(arr, n)) 
      
# This code is contributed  
# by Rituraj Jain 

