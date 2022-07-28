

# Python3 implementation of the approach 
from math import log 
  
# Function to return the highest power 
# of 2 less than or equal to n 
def prevPowerof2(n): 
    p = int(log(n)) 
    return pow(2, p) 
  
# Function to return the smallest power 
# of 2 greater than or equal to n 
def nextPowerOf2(n): 
    p = 1
    if (n and (n & (n - 1)) == 0): 
        return n 
  
    while (p < n): 
        p <<= 1
  
    return p 
  
# Function that returns the minimum 
# absolute difference between n 
# and any power of 2 
def minDiff(n): 
    low = prevPowerof2(n) 
    high = nextPowerOf2(n) 
  
    return min(n - low, high - n) 
  
# Driver code 
n = 6
  
print(minDiff(n)) 
  
# This code is contributed by Mohit Kumar 

