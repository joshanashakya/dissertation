

# Python 3 Program to find the area  
# of a circle inscribed 
# in a polygon 
from math import tan 
  
# Function to find the area of a  
# circle 
def InscribedCircleArea(n, a): 
    # Side and side length cannot  
    # be negative 
    if (a < 0 and n < 0): 
        return -1
  
    # degree converted to radians 
    r = a/(2 * tan((180 / n) * 3.14159 / 180)); 
  
    # area of circle 
    Area = 3.14 * r * r 
  
    return Area 
  
# Driver code 
if __name__ == '__main__': 
    a = 4
    n = 6
  
    print('{0:.6}'.format(InscribedCircleArea(n, a))) 
  
# This code is contributed by 
# Chandan Agrawal 

