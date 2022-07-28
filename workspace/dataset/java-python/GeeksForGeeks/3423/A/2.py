

# Python 3 program to check if given  
# number is strong prime 
from math import sqrt 
  
# Utility function to check if a  
# number is prime or not 
def isPrime(n): 
      
    # Corner cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
      
    k = int(sqrt(n)) + 1
    for i in range(5, k, 6): 
        if (n % i == 0 or n % (i + 2) == 0): 
            return False
  
    return True
  
# Function that returns true if  
# n is a strong prime 
def isStrongPrime(n): 
      
    # If n is not a prime number or 
    # n is the first prime then return false 
    if (isPrime(n) == False or n == 2): 
        return False
  
    # Initialize previous_prime to n - 1 
    # and next_prime to n + 1 
    previous_prime = n - 1
    next_prime = n + 1
  
    # Find next prime number 
    while (isPrime(next_prime) == False): 
        next_prime += 1
  
    # Find previous prime number 
    while (isPrime(previous_prime) == False): 
        previous_prime -= 1
  
    # Arithmetic mean 
    mean = (previous_prime + next_prime) / 2
  
    # If n is a strong prime 
    if (n > mean): 
        return True
    else: 
        return False
  
# Driver code 
if __name__ == '__main__': 
    n = 11
  
    if (isStrongPrime(n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Sanjit_prasad 

