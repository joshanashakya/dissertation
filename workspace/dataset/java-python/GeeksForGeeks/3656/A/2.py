

# Python3 implementation of the approach 
import math; 
  
# Function to find the normal 
# of the straight line 
def normal(m, n): 
  
    # Length of the normal 
    N = ((abs(m) * abs(n)) /
        math.sqrt((abs(m) * abs(m)) +
                  (abs(n) * abs(n)))); 
  
    return N; 
  
# Driver code 
m = -5; n = 3; 
print(normal(m, n)); 
  
# This code is contributed 
# by Akanksha Rai 

