

# Python3 implementation of above approach 
  
import math 
#Function to find the next perfect square 
  
def nextPerfectSquare(N): 
  
    nextN = math.floor(math.sqrt(N)) + 1
  
    return nextN * nextN 
  
if __name__=='__main__': 
    N = 35
    print(nextPerfectSquare(N)) 
  
# this code is contributed by Surendra_Gangwar 

