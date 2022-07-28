

# Python3 implementation of the approach  
from math import pow
  
# Function to print all the levels  
# of the given tree in sorted order  
def printSortedLevels(arr, n): 
      
    # Initialize level with 0 
    level = 0
    i = 0
    while(i < n): 
          
        # Number of nodes at current level 
        cnt = int(pow(2, level)) 
  
        # Indexing of array starts from 0 
        # so subtract no. of nodes by 1 
        cnt -= 1
  
        # Index of the last node in the current level 
        j = min(i + cnt, n - 1) 
          
        # Sort the nodes of the current level 
        arr = arr[:i] + sorted(arr[i:j + 1]) + \ 
                               arr[j + 1:] 
  
        # Print the sorted nodes 
        while (i <= j): 
            print(arr[i], end = " ") 
            i += 1
        print() 
        level += 1
  
# Driver code  
arr = [ 5, 6, 4, 9, 2, 1] 
n = len(arr)  
printSortedLevels(arr, n)  
  
# This code is contributed by SHUBHAMSINGH10 

