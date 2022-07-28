

# Python3 implementation of the approach 
from math import *
  
# Function to return the next  
# fibonacci number 
def nextFibonacci(n): 
    a = n*(1 + sqrt(5))/2.0
    return round(a) 
  
# Driver code 
n = 5
print(nextFibonacci(n)) 

