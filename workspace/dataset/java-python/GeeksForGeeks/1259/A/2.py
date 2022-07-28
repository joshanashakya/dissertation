

# Python 3 implementation of above approach  
  
# from math import everything 
from math import *
  
# Function to find the next perfect cube  
def nextPerfectCube(N) : 
  
    nextN = floor(N ** (1/3)) + 1
  
    return nextN ** 3
  
  
# Driver code      
if __name__ == "__main__" : 
  
    n = 35
    print(nextPerfectCube(n)) 
  
# This code is contributed by ANKITRAI1 

