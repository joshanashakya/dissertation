

# Python3 implementation of the approach 
  
# Function to print all the perfect 
# squares from the given range 
def perfectSquares(l, r): 
  
    # For every element from the range 
    for i in range(l, r + 1): 
  
        # If current element is 
        # a perfect square 
        if (i**(.5) == int(i**(.5))): 
            print(i, end=" ") 
  
# Driver code 
l = 2
r = 24
  
perfectSquares(l, r) 
  
# This code is contributed by mohit kumar 29 

