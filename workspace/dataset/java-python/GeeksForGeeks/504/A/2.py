

# Python program to find  
# the value at n-th place  
# in the given sequence 
import math 
  
# Definition of findNumber function 
def findNumber( n ): 
      
    # Finding x from equation  
    # n = x(x + 1)/2 + 1 
    x = int(math.floor((-1 + math.sqrt(1
            + 8 * n - 8)) / 2)) 
  
    # Base of current block 
    base = (x * (x + 1)) / 2 + 1
      
    # Value of n-th element 
    return n - base + 1
  
# Driver code 
n = 55
print(findNumber(n)) 
  
# This code is contributed  
# by "Abhishek Sharma 44" 

