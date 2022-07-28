

# Python3 implementation of the approach 
mod = 10**9 + 7
  
# Function to return n! % p 
def factorial(n, p): 
  
    res = 1 # Initialize result 
    for i in range(2, n + 1): 
        res = (res * i) % p 
    return res 
  
# Iterative Function to calculate 
# (x^y)%p in O(log y) 
def power(x, y, p): 
  
    res = 1 # Initialize result 
  
    x = x % p # Update x if it is  
              # more than or equal to p 
  
    while (y > 0): 
          
        # If y is odd, 
        # multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
  
        # y must be even now 
        y = y >> 1 # y = y/2 
        x = (x * x) % p 
      
    return res 
  
# Returns n^(-1) mod p 
def modInverse(n, p): 
  
    return power(n, p - 2, p) 
  
# Returns nCr % p using Fermat's little 
# theorem. 
def nCrModP(n, r, p): 
  
    # Base case 
    if (r == 0): 
        return 1
  
    # Fifactorial array so that we 
    # can find afactorial of r, n 
    # and n-r 
    fac = [0 for i in range(n + 1)] 
    fac[0] = 1
    for i in range(1, n + 1): 
        fac[i] = fac[i - 1] * i % p 
  
    return (fac[n] * modInverse(fac[r], p) % p * 
                     modInverse(fac[n - r], p) % p) % p 
  
# Function to return the number of ways  
# to arrange K different objects taking  
# N objects at a time 
def countArrangements(n, k, p): 
  
    return (factorial(n, p) * 
            nCrModP(k, n, p)) % p 
  
# Drivers Code 
N = 5
K = 8
  
# Function call 
print(countArrangements(N, K, mod)) 
  
# This code is contributed by mohit kumar 

