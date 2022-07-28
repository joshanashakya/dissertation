

# Python3 tp implement above approach 
import math as mt 
  
# Function to get final value of X and Y 
def alter(x, y): 
  
    # Following the sequence but by  
    # replacing minus with modulo 
    while (True): 
  
        # Step 1 
        if (x == 0 or y == 0): 
            break
  
        # Step 2 
        if (x >= 2 * y): 
            x = x % (2 * y) 
  
        # Step 3 
        elif (y >= 2 * x): 
            y = y % (2 * x) 
  
        # Otherwise terminate 
        else: 
            break
      
    print("X =", x, ", ", "Y =", y) 
  
  
# Driver Code 
  
# Get the initial X and Y values 
x, y = 12, 5
  
# Find the result 
alter(x, y) 
  
# This code is contributed by 
# Mohit kumar 29 

