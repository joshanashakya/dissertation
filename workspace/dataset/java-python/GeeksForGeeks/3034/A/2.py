

# Python3 program to check if given  
# number is a factorial prime  
  
# from math lib import sqrt function 
from math import sqrt 
  
# Utility function to check  
# if a number is prime or not  
def isPrime(n) :  
      
    # Corner cases  
    if (n <= 1) : 
        return False
          
    if (n <= 3) : 
        return True
  
    # This is checked so that we can skip  
    # middle five numbers in below loop  
    if (n % 2 == 0 or n % 3 == 0) : 
        return False
  
    for i in range(5, int(sqrt(n)) + 1, 6) : 
        if (n % i == 0 or n % (i + 2) == 0) : 
            return False
  
    return True
  
# Function that returns true if n  
# is a factorial prime  
def isFactorialPrime(n) :  
  
    # If n is not prime then return false  
    if (not isPrime(n)) : 
        return False
      
    fact = 1
    i = 1
    while (fact <= n + 1) : 
  
        # Calculate factorial  
        fact = fact * i  
  
        # If n is a factorial prime  
        if (n + 1 == fact or n - 1 == fact) :  
            return True
  
        i += 1
  
    # n is not a factorial prime  
    return False
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 23
  
    if (isFactorialPrime(n)) : 
        print("Yes") 
    else : 
        print("No") 
  
# This code is contributed by Ryuga 

