

# Python3 Program to find the 
# sum of forth powers of first 
# n natural numbers 
import math  
  
# Return the sum of forth power of  
# first n natural numbers 
def fourthPowerSum( n): 
  
    sum = 0
    for i in range(1, n+1) : 
        sum = sum + (i * i * i * i) 
    return sum
# Driver method 
n=6
print (fourthPowerSum(n)) 
  
# This code is contributed by Gitanjali. 

