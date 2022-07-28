

# Python3 implementation of the approach  
from math import *; 
  
# Function to return the maximum value  
# of (x + y + z) such that (ax + by + cz = n)  
def maxResult(n, a, b, c) :  
    maxVal = 0;  
  
    # i represents possible values of a * x  
    for i in range(0, n + 1, a) : 
  
        # j represents possible values of b * y  
        for j in range(0, n - i + 1, b) :  
            z = (n - (i + j)) / c;  
  
            # If z is an integer  
            if (floor(z) == ceil(z)) :  
                x = i // a;  
                y = j // b;  
                maxVal = max(maxVal, x + y + int(z)); 
  
    return maxVal;  
  
# Driver code  
if __name__ == "__main__" :  
      
    n = 10
    a = 5
    b = 3
    c = 4
      
    print(maxResult(n, a, b, c)); 
      
# This code is contributed by Ryuga 

