

# Python3 implementation of the approach 
from math import sqrt  
  
# Function to return the count of steps 
def countSteps(n) : 
  
    # Variable to store the count of steps 
    steps = 0; 
  
    # Iterate while N > 0 
    while (n) : 
  
        # Get the largest perfect square 
        # and subtract it from N 
        largest = int(sqrt(n)); 
        n -= (largest * largest); 
  
        # Increment steps 
        steps += 1; 
  
    # Return the required count 
    return steps; 
      
# Driver code 
if __name__ == "__main__" : 
  
    n = 85; 
    print(countSteps(n)); 
      
# This code is contributed by Ryuga 

