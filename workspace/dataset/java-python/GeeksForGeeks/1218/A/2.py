

# Python 3 Program to find the biggest trapezoid  
# which can be inscribed within the semicircle  
  
# from math import everything 
from math import *
  
# Function to find the area  
# of the biggest trapezoid  
def trapezoidarea(r) : 
  
    # the radius cannot be negative  
    if r < 0 : 
        return -1
  
    # area of the trapezoid 
    a = (3 * sqrt(3) * pow(r,2)) / 4
  
    return a 
  
  
# Driver code      
if __name__ == "__main__" : 
  
    r = 5
  
    print(round(trapezoidarea(r),3)) 
  
  
# This code is contributed by ANKITRAI1 

