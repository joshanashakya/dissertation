

# Python3 Program to find the biggest  
# Reuleaux triangle inscribed within 
# in a square which in turn is inscribed 
# within an equilateral triangle 
import math as mt 
  
# Function to find the biggest 
# reuleaux triangle 
def Area(a): 
  
    # side cannot be negative 
    if (a < 0): 
        return -1
  
    # height of the reuleaux triangle 
    x = 0.464 * a 
  
    # area of the reuleaux triangle 
    A = 0.70477 * pow(x, 2) 
  
    return A 
  
# Driver code 
a = 5
print(Area(a)) 
  
# This code is contributed by  
# Mohit Kumar 29 

