

# Python 3 implementation of  
# above approach 
from math import sqrt 
  
# Function to find the radius 
# of the inscribed circle 
def circleradius(l, b): 
      
    # the sides cannot be negative 
    if (l < 0 or b < 0): 
        return -1
  
    # radius of the circle 
    r = (l * b) / (2 * sqrt((pow(l, 2) + 
                             pow(b, 2)))); 
    return r 
  
# Driver code 
if __name__ == '__main__': 
    l = 5
    b = 3
    print("{0:.5}" . format(circleradius(l, b))) 
  
# This code is contribute  
# by Surendra_Gagwar 

