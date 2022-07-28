

# Python3 code to find nth fibonacci 
  
# get second MSB 
def getMSB(n): 
      
    # consectutively set all the bits 
    n |= n >> 1
    n |= n >> 2
    n |= n >> 4
    n |= n >> 8
    n |= n >> 16
  
    # returns the second MSB 
    return ((n + 1) >> 2) 
  
# Multiply function 
def multiply(F, M): 
    x = F[0][0] * M[0][0] + F[0][1] * M[1][0] 
    y = F[0][0] * M[0][1] + F[0][1] * M[1][1] 
    z = F[1][0] * M[0][0] + F[1][1] * M[1][0] 
    w = F[1][0] * M[0][1] + F[1][1] * M[1][1] 
  
    F[0][0] = x 
    F[0][1] = y 
    F[1][0] = z 
    F[1][1] = w 
  
# Function to calculate F[][] 
# raise to the power n 
def power(F, n): 
      
    # Base case 
    if (n == 0 or n == 1): 
        return
  
    # take 2D array to store number's 
    M = [[1, 1], [1, 0]] 
  
    # run loop till MSB > 0 
    m = getMSB(n) 
  
    while m: 
        multiply(F, F) 
  
        if (n & m): 
            multiply(F, M) 
  
        m = m >> 1
  
# To return fibonacci numebr 
def fib(n): 
    F = [[1, 1 ], [1, 0 ]] 
    if (n == 0): 
        return 0
    power(F, n - 1) 
    return F[0][0] 
  
# Driver Code 
  
# Given n 
n = 6
  
print(fib(n)) 
  
# This code is contributed by Mohit Kumar 

