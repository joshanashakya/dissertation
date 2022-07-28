

# Python3 implementation of the approach 
from math import floor 
  
# Function to return the count of steps 
def countSteps(n): 
  
    # Variable to store the count of steps 
    steps = 0
  
    # Iterate while N > 0 
    while (n): 
  
        # Get the largest perfect cube 
        # and subtract it from N 
        largest = floor(n**(1/3)) 
        n -= (largest * largest * largest) 
  
        # Increment steps 
        steps += 1
  
    # Return the required count 
    return steps 
  
# Driver code 
n = 150
print(countSteps(n)) 
  
# This code is contributed by mohit kumar 29 

