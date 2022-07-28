

# Python3 implementation of the approach 
  
# Function that returns the maximum product of 
# digits among numbers less than or equal to N 
def maxProd(N): 
  
    if (N == 0): 
        return 1
    if (N < 10): 
        return N 
    return max(maxProd(N // 10) * (N % 10), 
               maxProd(N // 10 - 1) * 9) 
  
# Driver code 
N = 390
print(maxProd(N)) 
  
# This code is contributed by mohit kumar 

