

# Python3 Program to find the biggest  
# Reuleaux triangle inscribed within  
# in a square which in turn is inscribed 
# within a circle 
import math as mt 
  
# Function to find the Area 
# of the Reuleaux triangle 
def ReuleauxArea(r): 
  
    # radius cannot be negative 
    if (r < 0): 
        return -1
  
    # Area of the Reuleaux triangle 
    A = 0.70477 * 2 * pow(r, 2) 
  
    return A 
  
# Driver code 
r = 6
print(ReuleauxArea(r)) 
  
# This code is contributed by  
# Mohit kumar 29 

