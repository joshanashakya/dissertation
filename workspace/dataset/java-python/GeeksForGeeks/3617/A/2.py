

# Python3 implementation of the approach  
from math import ceil, floor 
  
# Function that returns true  
# if a straight line is possible  
def isPossible(x, y, z) : 
  
    a = x * x + y * y + z * z 
    a = round(a, 8) 
      
    if (ceil(a) == 1 & floor(a) == 1) : 
        return True
    return False
  
# Driver code  
if __name__ == "__main__" : 
      
    l = 0.70710678
    m = 0.5
    n = 0.5
  
    if (isPossible(l, m, n)):  
        print("Yes")  
    else : 
        print("No") 
  
# This code is contributed by Ryuga 

