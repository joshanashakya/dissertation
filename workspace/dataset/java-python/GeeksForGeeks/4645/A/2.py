

# Python3 program to find  
# sum of 0.6, 0.06, 0.006,  
# 0.0006, ...to n terms 
import math 
  
# function which return  
# the sum of series 
def sumOfSeries(n): 
    return ((0.666) * 
            (1 - 1 / pow(10, n))); 
  
# Driver code 
n = 2; 
print(sumOfSeries(n)); 
  
# This code is contributed by mits 

