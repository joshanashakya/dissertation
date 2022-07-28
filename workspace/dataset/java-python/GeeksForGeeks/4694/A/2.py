

# Python3 program to find  
# the number of rectangles 
# that can be cut from a  
# circle of Radius R Function 
# to return the total possible 
# rectangles that can be cut 
# from the circle 
def countRectangles(radius): 
      
    rectangles = 0
      
    # Diameter = 2 * Radius 
    diameter = 2 * radius 
      
    # Square of diameter which  
    # is the square of the  
    # maximum length diagnal 
    diameterSquare = diameter * diameter 
      
    # generate all combinations  
    # of a and b in the range  
    # (1, (2 * Radius - 1))(Both inclusive) 
    for a in range(1, 2 * radius):  
        for b in range(1, 2 * radius): 
              
            # Calculate the Diagnal  
            # length of this rectange 
            diagnalLengthSquare = (a * a + 
                                   b * b) 
              
            # If this rectangle's Diagonal  
            # Length is less than the  
            # Diameter, it is a valid 
            # rectangle, thus increment counter 
            if (diagnalLengthSquare <= diameterSquare) : 
                rectangles += 1
      
    return rectangles 
  
# Driver Code 
  
# Radius of the circle 
radius = 2
totalRectangles = countRectangles(radius) 
print(totalRectangles , "rectangles can be" ,  
      "cut from a circle of Radius" , radius) 
  
# This code is contributed by Smita 

