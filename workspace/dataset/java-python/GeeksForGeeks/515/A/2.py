

# Python 3 implementation of the approach 
from math import sqrt, pow
  
# Function for Sieve of Eratosthenes 
def sieve(prime, n): 
    prime[0] = False
    prime[1] = False
    for p in range(2, int(sqrt(n)) + 1, 1): 
        if (prime[p] == True): 
            for i in range(p * p, n + 1, p): 
                prime[i] = False
  
# Function to return the sum of 
# the required prime numbers 
def sumPrime(d): 
      
    # Maximum number of the required range 
    maxVal = int(pow(2, d)) - 1; 
  
    # Sieve of Eratosthenes 
    prime = [True for i in range(maxVal + 1)] 
      
    sieve(prime, maxVal) 
  
    # To store the required sum 
    sum = 0
  
    for i in range(2, maxVal + 1, 1): 
          
        # If current element is prime 
        if (prime[i]): 
            sum += i 
  
    return sum
  
# Driver code 
if __name__ == '__main__': 
    d = 8
  
    print(sumPrime(d)) 
  
# This code is contributed by Surendra_Gangwar 

