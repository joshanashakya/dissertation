

# Python3 code to find the unit    
# digit of x raised to power y. 
import math 
  
# Find unit digit 
def unitnumber(x, y): 
  
    # Get last digit of x 
    x = x % 10
          
    # Last cyclic modular value 
    if y!=0: 
         y = y % 4 + 4
  
    # Here we simply return   
    # the unit digit or the   
    # power of a number 
    return (((int)(math.pow(x, y))) % 10) 
  
  
# Driver code  
x = 133; y = 5
      
# Get unit digit number here we pass  
# the unit digit of x and the last  
# cyclicity number that is y%4 
print(unitnumber(x, y)) 
  
  
# This code is contributed by Gitanjali. 

