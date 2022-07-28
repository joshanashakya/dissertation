

# Python 3 Program to find the apothem 
# of a regular polygon with given side 
# length 
from math import tan 
  
# Function to find the apothem 
# of a regular polygon 
def polyapothem(n, a): 
      
    # Side and side length cannot be negative 
    if (a < 0 and n < 0): 
        return -1
  
    # Degree converted to radians 
    return a / (2 * tan((180 / n) * 
                   3.14159 / 180)) 
  
# Driver code 
if __name__ == '__main__': 
    a = 9
    n = 6
    print('{0:.6}'.format(polyapothem(n, a))) 
      
# This code is contributed by 
# Sahil_Shelangia 

