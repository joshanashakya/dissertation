

# Python implementation of the approach 
  
# Function to return the hypotenuse of the 
# right angled triangle 
def findHypotenuse(side1, side2): 
  
    h = (((side1 * side1) + (side2 * side2))**(1/2)); 
    return h; 
  
# Driver code 
side1 = 3; 
side2 = 4; 
  
print(findHypotenuse(side1, side2)); 
  
# This code contributed by Rajput-Ji 

