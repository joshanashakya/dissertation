

# Python 3 Program to find the area  
# of a regular polygon with given 
# side length 
from math import tan 
  
# Function to find the area of a  
# regular polygon 
def polyarea(n, a): 
      
    # Side and side length cannot  
    # be negative 
    if (a < 0 and n < 0): 
        return -1
  
    # Area degree converted to radians 
    A = (a * a * n) / (4 * tan((180 / n) *
                      3.14159 / 180)) 
  
    return A 
  
# Driver code 
if __name__ == '__main__': 
    a = 9
    n = 6
  
    print('{0:.6}'.format(polyarea(n, a))) 
  
# This code is contributed by 
# Shashank_sharma 

