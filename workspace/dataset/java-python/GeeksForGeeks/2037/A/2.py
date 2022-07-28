

# Python3 implementation of the approach 
from math import *
  
# Function to return the smallest n-digit  
# number which is a perfect fourth power 
def cal(n): 
    res = pow(ceil( (pow(pow(10, (n - 1)), 1 / 4) ) ), 4) 
    return int(res) 
  
# Driver code 
n = 1
print(cal(n)) 

