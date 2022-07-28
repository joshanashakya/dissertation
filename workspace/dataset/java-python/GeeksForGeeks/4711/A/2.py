

# Python 3 Program to find the biggest  
# right circular cylinder that can  
# be fit within a right circular cone 
import math 
  
# Function to find the biggest  
# right circular cylinder 
def cyl(r, h): 
  
    # radius and height cannot  
    # be negative 
    if (r < 0 and h < 0): 
        return -1
  
    # radius of right circular cylinder 
    R = (2 * r) / 3
  
    # height of right circular cylinder 
    H = (2 * h) / 3
      
    # volume of right circular cylinder 
    V = 3.14 * math.pow(R, 2) * H 
  
    return V 
  
# Driver code 
r = 4; h = 8; 
print(cyl(r, h), "\n") 
  
# This code is contributed  
# by Akanksha Rai 

