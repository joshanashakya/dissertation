

# Python implementation of the approach 
import math 
PI = 3.14159 / 180; 
  
# Function to return the area of the kite 
def areaOfKite(a, b, angle): 
      
    # convet angle degree to radians 
    angle = angle * PI; 
      
    # use above formula 
  
    area = a * b * math.sin(angle); 
    return area; 
  
# Driver code 
a = 4; b = 7; angle = 78; 
print("Area of Kite = ", 
        areaOfKite(a, b, angle)); 
  
# This code contributed by PrinciRaj1992 

