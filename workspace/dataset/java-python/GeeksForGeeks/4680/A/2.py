

# Python3 implementation of the  
# above approach  
  
# from math lib import floor 
# and log2 function 
from math import floor, log2 
  
# Function to return the minimum  
# difference between N and a power of 2  
def minAbsDiff(n) : 
      
    # Power of 2 closest to n on its left  
    left = pow(2, floor(log2(n))) 
  
    # Power of 2 closest to n on its right  
    right = left * 2
  
    # Return the minimum abs difference  
    return min((n - left), (right - n))  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 15
    print(minAbsDiff(n)) 
  
# This code is contributed by Ryuga 

