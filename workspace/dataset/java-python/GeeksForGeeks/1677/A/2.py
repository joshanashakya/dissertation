

# Python3 Program to find the diagonal  
# of a regular polygon with given side length  
import math as mt 
  
# Function to find the diagonal  
# of a regular polygon 
def polydiagonal(n, a):  
  
    # Side and side length cannot  
    # be negative  
    if (a < 0 and n < 0):  
        return -1
  
    # diagonal degree converted to radians  
    return (2 * a * mt.sin((((n - 2) * 180) / 
           (2 * n)) * 3.14159 / 180))  
  
# Driver code  
a, n = 9, 10
print(polydiagonal(n, a)) 
  
# This code is contributed 
# by Mohit kumar 29 

