

# Python 3 program to find the longest rod  
# that can fit in a cuboid 
  
# from math lib. import everything 
from math import *
  
# Function to find the length  
def longestRodInCuboid(length, breadth, height) : 
  
    # temporary variable to hold  
    # the intermediate result 
    temp = length * length + breadth  * breadth + height * height 
  
    #  length of longest rod is calculated  
    # using square root function 
    result = sqrt(temp) 
  
    return result 
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    length, breadth, height = 12, 9, 8
  
    # calling longestRodInCuboid() function to  
    # get the length of longest rod 
    print(longestRodInCuboid(length, breadth, height)) 
  
  
# This code is contributed by ANKITRAI1 

