

# Python 3 Program to find the biggest  
# cube inscribed within a sphere 
from math import sqrt 
  
# Function to find the side of the cube 
def largestCube(r): 
      
    # radius cannot be negative 
    if (r < 0): 
        return -1
  
    # side of the cube 
    a = (2 * r) / sqrt(3) 
    return a 
  
# Driver code 
if __name__ == '__main__': 
    r = 5
    print("{0:.6}".format(largestCube(r))) 
  
# This code is contributed 
# by SURENDRA_GANGWAR 

