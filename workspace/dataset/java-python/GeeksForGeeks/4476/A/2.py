

# Python3 implementation of the approach  
from math import *
  
# Function to return the previous  
# fibonacci number  
def previousFibonacci(n):  
    a = n/((1 + sqrt(5))/2.0) 
    return round(a)  
  
# Driver code  
n = 8
print(previousFibonacci(n))  

