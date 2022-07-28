

# Python 3 program to find sum of n and  
# it's largest prime factor 
from math import sqrt 
  
# Function to return the sum of n and  
# it's largest prime factor 
def maxPrimeFactors(n): 
    num = n 
  
    # Initialise maxPrime to -1. 
    maxPrime = -1; 
  
    while (n % 2 == 0): 
        maxPrime = 2
        n = n / 2
      
    # n must be odd at this point, thus skip 
    # the even numbers and iterate only odd numbers 
    p = int(sqrt(n) + 1) 
    for i in range(3, p, 2): 
        while (n % i == 0): 
            maxPrime = i 
            n = n / i 
          
    # This condition is to handle the case 
    # when n is a prime number greater than 2 
    if (n > 2): 
        maxPrime = n 
  
    # finally return the sum. 
    sum = maxPrime + num 
    return sum
  
# Driver Code 
if __name__ == '__main__': 
    n = 19
  
    print(maxPrimeFactors(n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

