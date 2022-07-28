

# Python 3 implementation of  
# above approach 
import math 
  
# Function to find the 
# number of tiles 
def solve(M, N, s): 
  
    # no of tiles 
    ans = ((math.ceil(M / s)) * 
           (math.ceil(N / s))); 
  
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
      
    # input length and breadth of 
    # rectangle and side of square 
    N = 12
    M = 13
    s = 4
  
    print(solve(M, N, s)) 
  
# This code is contributed  
# by ChitraNayal  

