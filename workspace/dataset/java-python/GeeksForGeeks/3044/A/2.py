

# Python3 Program to  
# find the sum of  
# forth powers of  
# first n natural numbers 
import math  
  
# Return the sum of  
# forth power of  
# first n natural  
# numbers 
def fourthPowerSum(n): 
  
    return ((6 * n * n * n * n * n) +
            (15 * n * n * n * n) +
            (10 * n * n * n) - n) / 30
      
# Driver method 
n=6
print (fourthPowerSum(n)) 
  
# This code is contributed by Gitanjali. 

