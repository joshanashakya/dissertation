

# An Efficient Method to count cubes between a and b 
from math import *
  
# Function to count cubes between two numbers 
def countCubes(a, b): 
      
    return (floor(b **(1./3.)) - ceil(a **(1./3.)) + 1) 
  
# Driver code 
a = 7
b = 28
print("Count of cubes is",countCubes(a, b)) 
  
# This code is contributed by shubhamsingh10 

