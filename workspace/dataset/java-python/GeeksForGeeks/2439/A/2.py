

# Python 3 implementation of above approach 
from math import gcd 
  
# Function to count total numbers divisible  
# by x but not y in range 1 to N 
def countNumbers(X, Y, N): 
      
    # Count total number divisible by X 
    divisibleByX = int(N / X) 
  
    # Count total number divisible by Y 
    divisibleByY = int(N / Y) 
  
    # Count total number divisible  
    # by either X or Y 
    LCM = int((X * Y) / gcd(X, Y)) 
    divisibleByLCM = int(N / LCM) 
    divisibleByXorY = (divisibleByX + 
                       divisibleByY - 
                       divisibleByLCM) 
  
    # Count total numbers divisible by  
    # X but not Y 
    divisibleByXnotY = (divisibleByXorY - 
                        divisibleByY) 
  
    return divisibleByXnotY 
  
# Driver Code 
if __name__ == '__main__': 
    X = 2
    Y = 3
    N = 10
    print(countNumbers(X, Y, N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

