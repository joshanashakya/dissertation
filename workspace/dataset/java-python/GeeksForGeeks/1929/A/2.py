

# Python3 implementation of the approach 
from math import ceil, floor, sqrt 
  
# Function to find all the distinct 
# remainders when n is divided by 
# all the elements from 
# the range [1, n + 1] 
def findRemainders(n): 
  
    # Set will be used to store 
    # the remainders in order 
    # to eliminate duplicates 
    vc = dict() 
  
    # Find the remainders 
    for i in range(1, ceil(sqrt(n)) + 1): 
        vc[n // i] = 1
    for i in range(n // ceil(sqrt(n)) - 1, -1, -1): 
        vc[i] = 1
  
    # Print the contents of the set 
    for it in sorted(vc): 
        print(it, end = " ") 
  
# Driver code 
n = 5
  
findRemainders(n) 
  
# This code is contributed by Mohit Kumar 

