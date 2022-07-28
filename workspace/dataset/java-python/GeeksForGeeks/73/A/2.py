

# Python 3 Program to check if a number  
# can be expressed as a^b 
  
from math import *
  
def isPower(a) : 
    if a== 1 : 
        return True
  
    for i in range(2, int(sqrt(a)) + 1) : 
        val = log(a) / log(i) 
  
        if (round((val - int(val)),8) < 0.00000001): 
            return True
      
    return False
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 16
  
    if isPower(n) : 
        print("Yes") 
    else : 
        print("No") 
  
# This code is contributed by ANKITRAI1 

