

# Python3 program to invert actual 
# bits of a number. 
import math 
  
# Function to invert bits of a number 
def invertBits(n): 
      
    # Calculate number of bits of N-1 
    x = int(math.log(n, 2)) 
  
    m = 1 << x 
  
    m = m | m - 1
  
    n = n ^ m 
  
    return n 
  
# Driver code 
n = 20
  
print(invertBits(n)) 
  
# This code is contributed 29AjayKumar 

