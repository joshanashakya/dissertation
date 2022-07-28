

# Python3 implementation of the approach 
  
# Function to return the count of 
# the required integers 
from math import gcd as __gcd 
def getCount(a, n): 
  
    # To store the gcd of the array elements 
    gcd = 0
    for i in range(n): 
        gcd = __gcd(gcd, a[i]) 
  
    # To store the count of factors 
    # of the found gcd 
    cnt = 0
  
    for i in range(1, gcd + 1): 
        if i * i > gcd: 
            break
        if (gcd % i == 0): 
  
            # If g is a perfect square 
            if (i * i == gcd): 
                cnt += 1
  
            # Factors appear in pairs 
            else: 
                cnt += 2
  
    return cnt 
  
# Driver code 
a = [4, 16, 1024, 48] 
n = len(a) 
  
print(getCount(a, n)) 
  
# This code is contributed by Mohit Kumar 

