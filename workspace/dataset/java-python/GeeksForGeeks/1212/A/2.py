

# Python 3 Program to find the  
# area of the circle inscribed  
# within the rectangle which in 
# turn is inscribed in a semicircle 
from math import pow, sqrt 
  
# Function to find the area  
# of the circle 
def area(r): 
      
    # radius cannot be negative 
    if (r < 0): 
        return -1
  
    # area of the circle 
    area = 3.14 * pow(r / (2 * sqrt(2)), 2); 
      
    return area; 
  
# Driver code 
if __name__ == '__main__': 
    a = 5
    print("{0:.6}".format(area(a))) 
  
# This code is contributed By  
# Surendra_Gangwar 

