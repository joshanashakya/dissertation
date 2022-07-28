

# Python3 Program to find the biggest triangle 
# which can be inscribed within the hexagon 
import math 
  
# Function to find the area 
# of the triangle 
def trianglearea(a): 
  
    # side cannot be negative 
    if (a < 0): 
        return -1; 
  
    # area of the triangle 
    area = (3 * math.sqrt(3) * math.pow(a, 2)) / 4; 
  
    return area; 
  
# Driver code 
a = 6; 
print(trianglearea(a)) 
  
# This code is contributed  
# by Akanksha Rai 

