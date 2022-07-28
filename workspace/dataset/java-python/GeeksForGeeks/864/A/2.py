

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function that returns true if n is prime 
def isPrime(n): 
      
    # Corner cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 and n % 3 == 0): 
        return False
  
    for i in range(5, int(sqrt(n)) + 1, 6): 
        if (n % i == 0 and n % (i + 2) == 0): 
            return False
  
    return True
  
# Function that return true if the product 
# of the first n natural numbers is divisible 
# by the sum of first n natural numbers 
def isDivisible(n): 
    if (isPrime(n + 1)): 
        return False
    return True
  
# Driver code 
if __name__ == '__main__': 
    n = 6
    if (isDivisible(n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

