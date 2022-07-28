

# Python3 Program to find the  
# radius of the circumcircle  
# of the given polygon  
  
# from math import all methods 
from math import *
  
# Function to find the radius  
# of the circumcircle  
def findRadiusOfcircumcircle(n, a) : 
  
    # these cannot be negative 
    if n < 0 or a < 0 : 
        return -1
  
    # Radius of the circumcircle 
    radius = a / sqrt(2 - (2 * cos(360 / n))) 
  
    # Return the radius 
    return radius 
  
# Driver code 
if __name__ == "__main__" : 
  
    n , a = 5, 6
  
    # Find the radius of the circumcircle  
    print(round(findRadiusOfcircumcircle(n, a), 5)) 
  
# This code is contributed  
# by ANKITRAI1 

