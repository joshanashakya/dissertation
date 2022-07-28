

# Python3 implementation of the approach  
  
# Function to return the maximum  
# rectangles possible  
def maxRectangles(L, B, l, b):  
  
    horizontal, vertical = 0, 0
  
    # Cut rectangles horizontally if possible  
    if l <= L and b <= B: 
  
        # One rectangle is a single cell  
        columns = B // b  
        rows = L // l  
  
        # Total rectangles = total cells  
        horizontal = rows * columns  
  
    # Cut rectangles vertically if possible  
    if l <= B and b <= L: 
      
        columns = L // b  
        rows = B // l  
  
        vertical = rows * columns  
  
    # Return the maximum possible rectangles  
    return max(horizontal, vertical)  
  
# Driver code  
if __name__ == "__main__": 
  
    L, B, l, b = 10, 7, 4, 3
    print(maxRectangles(L, B, l, b))  
  
# This code is contributed by Rituraj Jain 

