

# Python 3 program, to find height  
# h which divide isosceles triangle 
# into ratio n:m 
from math import sqrt 
  
# Function to return the height 
def heightCalculate(H, n, m): 
      
    # type cast the n, m into float 
    N = n * 1.0
    M = m * 1.0
      
    # calculate the height for cut 
    h = H * sqrt(N / (N + M)) 
    return h 
  
# Driver code 
if __name__ == '__main__': 
    H = 10
    n = 3
    m = 4
    print("{0:.6}" .  
    format(heightCalculate(H, n, m))); 
      
# This code is contributed  
# by Surendra_Gangwar 

