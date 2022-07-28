

# Python3 program to find the side of the 
# largest hexagon which can be inscribed  
# within an eqilateral triangle 
  
# function to find the side of the hexagon 
def hexagonside(a): 
      
    # Side cannot be negative 
    if a < 0: 
        return -1
          
    # Side of the hexagon 
    x = a // 3
    return x 
  
# Driver code 
a = 6
print(hexagonside(a)) 
  
# This code is contributed 
# by Mohit kumar 29 

