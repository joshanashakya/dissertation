

# Python3 Program to find the biggest cube 
# inscribed within a right circular cone 
import math 
  
# Function to find the side of the cube 
def cubeSide(h, r): 
  
    # height and radius cannot  
    # be negative 
    if (h < 0 and r < 0): 
        return -1
  
    # side of the cube 
    a = ((h * r * math.sqrt(2)) / 
         (h + math.sqrt(2) * r)) 
  
    return a 
  
# Driver code 
h = 5; r = 6; 
  
print(cubeSide(h, r), "\n") 
  
# This code is contributed  
# by Akanksha Rai 

