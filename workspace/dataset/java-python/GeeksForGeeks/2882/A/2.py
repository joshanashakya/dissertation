

# Python3 program to count number  
# of distinct subsets in an 
# array of distinct numbers 
import math 
  
# Returns 2 ^ n 
def subsetCount(arr, n): 
  
    return 1 << n 
      
# driver code  
A = [ 1, 2, 3 ] 
n = len(A) 
print(subsetCount(A, n)) 
  
# This code is contributed by Gitanjali. 

