

# Python3 program to find the area of circle 
# which is inscribed in equilateral triangle 
  
# import math library for pi value 
from math import pi 
  
# Function return the area of circle 
# inscribed in equilateral triangle 
def circle_inscribed(a): 
    return pi*(a * a) / 12
  
# Driver code 
a = 4
print(circle_inscribed(a)) 

