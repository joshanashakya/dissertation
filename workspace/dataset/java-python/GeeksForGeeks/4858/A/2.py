

# Python3 program to find 
# n-th Fortunate number 
  
def isPrime(n): 
  
    # Corner cases 
    if (n <= 1): return False
    if (n <= 3): return True
  
    # This is checked so that we can skip  
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
      
    i = 5
    while(i * i <= n): 
        if (n % i == 0 or
            n % (i + 2) == 0): 
            return False
        i += 6
          
    return True
  
  
# Function to Find primorial of order n  
# (product of first n prime numbers). 
def primorial(n): 
  
    p = 2; n -= 1; i = 3
    while(n != 0): 
        if (isPrime(i)):  
            p = p * i 
            n -= 1
          
        i += 1
      
    return p 
  
  
# Function to find next prime  
# number greater than n 
def findNextPrime(n): 
  
    # Note that difference (or m)  
    # should be greater than 1. 
    nextPrime = n + 2
  
    # loop continuously until isPrime 
    # returns true for a number above n 
    while (True): 
  
        # Ignoring the prime number that  
        # is 1 greater than n 
        if (isPrime(nextPrime)): 
            break
  
        nextPrime += 1
      
    return nextPrime 
  
# Returns n-th Fortunate number 
def fortunateNumber(n): 
    p = primorial(n) 
    return findNextPrime(p) - p 
  
# Driver Code 
n = 5
print(fortunateNumber(n)) 
  
# This code is contributed by Anant Agarwal. 

