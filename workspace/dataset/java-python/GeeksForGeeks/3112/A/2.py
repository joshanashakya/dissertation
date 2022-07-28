

# Python3 Program to find the area  
# of a regular polygon with given radius  
  
# form math lib import sin function 
from math import sin 
  
# Function to find the area  
# of a regular polygon  
def polyarea(n, r) : 
      
    # Side and radius cannot be negative  
    if (r < 0 and n < 0) : 
        return -1
  
    # Area  
    # degree converted to radians  
    A = (((r * r * n) * sin((360 / n) * 
                 3.14159 / 180)) / 2);  
  
    return round(A, 3) 
  
# Driver code  
if __name__ == "__main__" :  
  
    r, n = 9, 6
    print(polyarea(n, r)) 
  
# This code is contributed by Ryuga 

