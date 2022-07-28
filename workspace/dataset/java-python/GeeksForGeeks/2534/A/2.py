

# Python 3 implementation of the approach 
from math import log2, ceil 
  
# Function to return the minimum  
# number of steps required 
def minOperations(N): 
    x = log2(N) 
  
    ans = ceil(x) 
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    N = 10
    print(minOperations(N)) 
  
# This code is contributed by 
# Surendra_Gangwar 

