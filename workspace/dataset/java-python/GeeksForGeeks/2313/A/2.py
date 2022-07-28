

# Python3 Program to find the biggest  
# Reuleaux triangle inscribed within 
# in a square which in turn is 
# inscribed within a hexagon 
import math 
  
# Function to find the biggest  
# reuleaux triangle 
def Area(a): 
  
    # side cannot be negative 
    if (a < 0): 
        return -1
  
    # height of the reuleaux triangle 
    h = 1.268 * a 
  
    # area of the reuleaux triangle 
    A = 0.70477 * math.pow(h, 2) 
  
    return A 
  
# Driver code 
a = 5
print(Area(a),end = "\n") 
  
# This code is contributed  
# by Akanksha Rai 

