

# Python3 Program to find the biggest square 
# which can be inscribed within the equilateral triangle 
  
# Function to find the side 
# of the square 
def square( a ): 
  
  
    # the side cannot be negative 
    if (a < 0): 
        return -1
  
    # side of the square 
    x = 0.464 * a 
  
    return x 
  
  
# Driver code 
a = 5
print(square(a)) 
  
# This code is contributed by ihritik 

