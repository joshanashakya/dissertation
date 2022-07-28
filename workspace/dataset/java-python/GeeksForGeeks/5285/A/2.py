

# Python Program to find the  
# radius of the circumcircle 
# of the given rectangle 
import math  
  
# Function to find the radius 
# of the circumcircle 
def findRadiusOfcircumcircle(l, b): 
  
    # the sides cannot be negative 
    if (l < 0 or b < 0): 
        return -1; 
  
    # Radius of the circumcircle 
    radius = (math.sqrt(pow(l, 2) + 
                        pow(b, 2)) / 2); 
  
    # Return the radius 
    return radius; 
  
# Driver code 
  
# Get the sides of the traingle 
l = 4; 
b = 3; 
      
# Find the radius of the circumcircle 
print(findRadiusOfcircumcircle(l, b)); 
  
# This code is contributed  
# by Shivi_Aggarwal 

