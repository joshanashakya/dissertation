

# Python 3 program to count common prime  
# factors of a and b. 
from math import sqrt,gcd 
  
# A function to count all prime  
# factors of a given number x 
def countPrimeFactors(x): 
    res = 0
    if (x % 2 == 0): 
        res += 1
  
        # Print the number of 2s that divide x 
        while (x % 2 == 0): 
            x = x / 2
  
    # x must be odd at this point. So we  
    # can skip one element (Note i = i +2) 
    k = int(sqrt(x)) + 1
    for i in range(3, k, 2): 
        if (x % i == 0): 
              
            # While i divides x, print i  
            # and divide x 
            res += 1
            while (x % i == 0): 
                x = x / i 
      
    # This condition is to handle the  
    # case when x is a prime number 
    # greater than 2 
    if (x > 2): 
        res += 1
    return res 
  
# Count of common prime factors 
def countCommonPrimeFactors(a, b): 
      
    # Get the GCD of the given numbers 
    gcd__ = gcd(a, b) 
  
    # Count prime factors in GCD 
    return countPrimeFactors(gcd__) 
  
# Driver code 
if __name__ == '__main__': 
    a = 6
    b = 12
    print(countCommonPrimeFactors(a, b)) 
      
# This code is contributed by 
# Surendra_Gangwar 

