

# Python3 program to  
# find the Area and 
# volume of Icosahedron 
  
# import math module  
# to use sqrt function 
from math import sqrt 
  
# Function to find  
# area of Icosahedron 
def findArea(a): 
  
    # Formula to calculate area 
    area = 5 * sqrt(3) * a * a 
    return area 
  
# Function to find  
# volume of Icosahedron 
def findVolume(a): 
      
    # Formula to calculate volume 
    volume = ((5 / 12) * 
              (3 + sqrt(5)) * 
               a * a * a) 
    return volume 
  
# Driver Code 
a = 5
  
# Function call to  
# find area of Icosahedron. 
print("Area: " , findArea(a)) 
      
# Function call to find 
# volume of Icosahedron. 
print("Volume: " , findVolume(a)) 
  
# This code is contributed 
# by ihritik 

