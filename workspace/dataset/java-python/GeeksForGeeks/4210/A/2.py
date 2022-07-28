

# Python implementation of above approach 
import math 
  
# Function to return the smallest power 
# of 4 greater than or equal to n 
def nextPowerOfFour(n): 
    x = math.floor((n**(1/2))**(1/2)); 
  
    # If n is itself is a power of 4 
    # then return n 
    if ((x**4) == n): 
        return n; 
    else: 
        x = x + 1; 
        return (x**4); 
  
# Driver code 
  
n = 122; 
print(nextPowerOfFour(n)); 
  
# This code is contributed by Rajput-Ji 

