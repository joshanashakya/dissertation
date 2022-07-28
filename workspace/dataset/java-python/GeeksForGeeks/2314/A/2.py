

# Python3 Program to find the biggest right  
# circular cone that can be inscribed within  
# a right circular cone which in turn is  
# inscribed within a cube 
import math 
  
# Function to find the biggest  
# right circular cone 
def cone(a): 
  
    # side cannot be negative 
    if (a < 0): 
        return -1; 
  
    # radius of right circular cone 
    r = (a * math.sqrt(2)) / 3; 
  
    # height of right circular cone 
    h = (2 * a) / 3; 
  
    # volume of right circular cone 
    V = 3.14 * math.pow(r, 2) * h; 
  
    return V; 
  
# Driver code 
a = 5; 
print(cone(a)); 
  
# This code is contributed by  
# Shivi_Aggarwal  

