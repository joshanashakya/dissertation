

# Python3 program to find Area of 
# semicircle in a square 
from math import sqrt 
  
# Function to find area of semicircle 
def find_Area(a) : 
  
    R = a * (2.0 - sqrt(2)); 
    area = 3.14 * R * R / 2.0; 
      
    return area; 
  
# Driver code 
if __name__ == "__main__" : 
  
    # side of a square 
    a = 4; 
  
    # Call Function to find 
    # the area of semicircle 
    print("Area of semicircle =",find_Area(a)); 
  
# This code is contributed by AnkitRai01 

