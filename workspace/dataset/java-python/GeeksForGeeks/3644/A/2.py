

# Python 3 implementation of the approach 
from math import sin 
  
# Function to calculate the side of  
# the polygon circumscribed in a circle 
def calculateSide(n, r): 
    theta = 360 / n 
    theta_in_radians = theta * 3.14 / 180
  
    return 2 * r * sin(theta_in_radians / 2) 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Total sides of the polygon 
    n = 3
  
    # Radius of the circumscribing circle 
    r = 5
  
    print('{0:.5}'.format(calculateSide(n, r))) 
  
# This code is contributed by 
# Sanjit_Prasad 

