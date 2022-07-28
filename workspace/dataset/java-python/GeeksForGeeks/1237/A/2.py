

# Python 3 program to calculate 
# the sum of area of all possible  
# squares that comes inside  
# the rectangle 
  
# Function to calculate the  
# sum of area of all possible 
# squares that comes inside 
# the rectangle 
def calculateAreaSum(l, b): 
    size = 1
      
    # Square with max size possible 
    maxSize = min(l, b) 
      
    totalArea = 0
      
    for i in range(1, maxSize + 1 ): 
  
        # calculate total square 
        # of a given size 
        totalSquares = ((l - size + 1) * 
                        (b - size + 1)) 
          
        # calculate area of squares  
        # of a particular size  
        area = (totalSquares *
                size * size) 
          
        # total area  
        totalArea += area 
          
        # increment size  
        size += 1
          
    return totalArea 
  
# Driver Code 
if __name__ == "__main__": 
    l = 4
    b = 3
      
    print(calculateAreaSum(l,b)) 
  
# This code is contributed  
# by ChitraNayal 

