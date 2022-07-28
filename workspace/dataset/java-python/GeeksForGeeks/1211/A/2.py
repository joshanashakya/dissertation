

# Python 3 Program to find the area  
# of the square inscribed within the  
# circle which in turn is inscribed  
# in a hexagon 
from math import pow, sqrt 
  
# Function to find the area  
# of the square 
def area(a): 
      
    # side of hexagon cannot  
    # be negative 
    if (a < 0): 
        return -1
  
    # area of the square 
    area = pow((a * sqrt(3)) / 
                   (sqrt(2)), 2) 
    return area 
  
# Driver code 
if __name__ == '__main__': 
    a = 5
    print("{0:.3}".format(area(a))) 
  
# This code is contributed  
# by SURENDRA_GANGWAR 

