

# Python3 Program to find the biggest sphere 
# that can be inscribed within a right 
# circular cylinder which in turn is inscribed 
# within a frustum 
import math as mt 
  
# Function to find the biggest sphere 
def sph(r, R, h): 
  
    # the radii and height cannot 
    # be negative 
    if (r < 0 and R < 0 and h < 0): 
        return -1
  
    # radius of the sphere 
    x = r 
  
    # volume of the sphere 
    V = (4 * 3.14 * pow(r, 3)) / 3
  
    return V 
  
# Driver code 
r, R, h = 5, 8, 11
print(sph(r, R, h)) 
  
# This code is contributed by  
# Mohit kumar 29 

