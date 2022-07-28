

# Python3 implementation of the approach 
import math  
  
# Function to find value  
# at k-th position 
def findValueAtK(n, m, k): 
      
    # __builtin_ffsll return the position 
    # of rightmost setbit 
    positionOfRightmostSetbit = math.log2(k & -k) + 1
  
    # Return the required element 
    return ((m - 1) + positionOfRightmostSetbit) 
  
# Driver code 
k = 100
n = 9
m = 74
print(findValueAtK(n, m, k)) 
  
# This code is contributed  
# by mohit kumar 

