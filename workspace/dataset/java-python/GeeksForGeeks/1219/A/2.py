

# Python 3 implementation of the approach 
PI = 3.14
from math import pow, sqrt 
  
# Function to return the area 
# of the bigger circle 
def find_area(r, d): 
      
    # Find the radius of 
    # the bigger circle 
    R = d / PI 
    R += pow(r, 2) 
    R = sqrt(R) 
  
    # Calculate the area of 
    # the bigger circle 
    area = PI * pow(R, 2) 
    return area 
  
# Driver code 
if __name__ == '__main__': 
    r = 4
    d = 5
  
    print(find_area(r, d)) 
  
# This code is contributed by 
# Surendra_Gangwar 

