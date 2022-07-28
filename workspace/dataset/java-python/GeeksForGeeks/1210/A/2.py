

# Python3 Program to find the area  
# of the square inscribed within   
# the circle which in turn is  
# inscribed in an equilateral triangle  
  
# import everything from math lib. 
from math import *
  
# Function to find the area  
# of the square  
def area(a): 
  
    # a cannot be negative  
    if a < 0 : 
        return -1
  
    # area of the square  
    area = sqrt(a) / 6
  
    return area 
  
# Driver code      
if __name__ == "__main__" : 
  
    a = 10
    print(round(area(a), 6)) 
  
# This code is contributed by ANKITRAI1 

