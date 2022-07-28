

# Python3 implementation of  
# the above approach  
import math 
  
# Returns value of Binomial  
# Coefficient C(n, k)  
def binomialCoeff(n, k): 
  
    res = 1
  
    # Since C(n, k) = C(n, n-k)  
    if (k > n - k):  
        k = n - k  
  
    # Calculate value of  
    for i in range(0, k):  
        res = res * (n - i)  
        res = res // (i + 1) 
  
    return res 
  
# Iterative Function to  
# calculate (x^y) in O(log y)  
def power(x, y): 
      
    # Initialize result  
    res = 1
  
    while (y > 0): 
  
        # If y is odd, multiply  
        # x with result  
        if (y & 1): 
            res = res * x 
  
        # y must be even now  
        # y = y/2  
        y = y // 2
  
        # Change x to x^2  
        x = x * x 
      
    return res  
  
# Function to find probability  
def FindProbability(n): 
  
    # Calculate total possible  
    # ways and favourable ways.  
    up = binomialCoeff(2 * n, n) 
    down = power(2, 2 * n) 
  
    # Divide by gcd such that  
    # they become relatively coprime  
    g = math.gcd(up,down) 
  
    up = up // g 
    down = down // g 
  
    print(up, "/", down) 
  
# Driver code  
N = 8
FindProbability(N) 
  
# This code is contributed by Sanjit_Prasad 

