

# Python3 implementation to find area of 
# largest Rectangle without hole 
# within a given Rectangle 
  
# Function to find the maximum area 
# such that it does not contains any hole 
def maximumArea(l, b,x, y): 
  
    # Area for all the possible 
    # positions of the cut 
    left, right, above, below = 0, 0, 0, 0
  
    left = x * b 
    right = (l - x - 1) * b 
    above = l * y 
    below = (b - y - 1) * l 
  
    # Find the maximum area 
    # among the above rectangles 
    print(max(max(left, right),max(above, below))) 
  
# Driver Code 
l = 8
b = 8
x = 0
y = 0
  
# Function call 
maximumArea(l, b, x, y) 
  
# This code is contributed by mohit kumar 29 

