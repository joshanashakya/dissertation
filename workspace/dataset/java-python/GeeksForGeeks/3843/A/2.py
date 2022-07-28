

# Python implementation of 
# above approach 
import math # for sqrt() 
  
# Function to count the number 
# of perfect squares and cubes 
def countSC(N): 
    res = (int(math.sqrt(N)) + 
           int(N ** (1 / 3)) - 
           int(math.sqrt(N ** (1 / 3)))) 
  
    return res 
  
# Driver code 
N = 20
print("Number of squares and cubes is",  
                            countSC(N)) 
  
# This code is contributed  
# by vaibhav29498 

