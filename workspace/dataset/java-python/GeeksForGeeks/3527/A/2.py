

# Python3 Program to find the biggest  
# Reuleaux triangle inscribed within  
# in a square which in turn is inscribed  
# within a semicircle 
import math as mt 
  
# Function to find the biggest 
# reuleaux triangle 
def Area(r): 
  
    # radius cannot be negative 
    if (r < 0): 
        return -1
  
    # height of the reuleaux triangle 
    x = (2 * r) / mt.sqrt(5) 
  
    # area of the reuleaux triangle 
    A = 0.70477 * pow(x, 2) 
  
    return A 
  
# Driver code 
r = 5
print(Area(r)) 
  
# This code is contributed by 
# Mohit Kumar 29 

