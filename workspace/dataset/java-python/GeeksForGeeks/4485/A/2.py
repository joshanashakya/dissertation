

# Python3 program to find  
# the area of Pentagon 
  
# Import Math module 
# to use sqrt function 
from math import sqrt 
  
# Function to find  
# area of pentagon 
  
def findArea(a): 
      
    # Formula to find area 
    area = (sqrt(5 * (5 + 2 *
           (sqrt(5)))) * a * a) / 4
    return area 
      
  
# Driver code 
a = 5
  
# call function findArea() 
# to calculate area of pentagon 
# and print the calculated area 
print("Area of Pentagon: ",  
               findArea(a)) 
   
# This code is contributed  
# by ihritik 

