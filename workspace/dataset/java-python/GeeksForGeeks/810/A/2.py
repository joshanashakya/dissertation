

# Python3 program to find the area 
# of Reuleaux triangle 
import math as mt 
  
# function to the area of the  
# Reuleaux triangle 
def ReuleauxArea(a): 
      
    # Side cannot be negative 
    if a < 0: 
        return -1
    # Area of the Reauleax triangle 
    return 0.70477 * pow(a, 2) 
  
# Driver code 
a = 6
print(ReuleauxArea(a)) 
  
# This code is contributed  
# by Mohit Kumar         

