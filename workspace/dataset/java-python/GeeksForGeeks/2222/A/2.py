

# Python 3 Program to find the biggest triangle  
# which can be inscribed within the ellipse 
  
from math import *
  
# Function to find the area  
# of the triangle 
def trianglearea(a, b) : 
  
    # a and b cannot be negative  
    if a < 0 or b < 0 : 
        return -1
  
    # area of the triangle  
    area = (3 * sqrt(3) * pow(a, 2)) / (4 * b) 
  
    return area 
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    a, b = 4, 2
    print(round(trianglearea(a, b),4)) 
  
  
# This code is contributed by ANKITRAI1 

