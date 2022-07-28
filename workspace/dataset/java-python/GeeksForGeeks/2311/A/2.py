

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function to return the digit product of n 
def digitProduct(n): 
    prod = 1
    while (n): 
        prod = prod * (n % 10) 
        n = int(n / 10) 
  
    return prod 
  
# Function to print all multiplicative 
# primes <= n 
def printMultiplicativePrimes(n): 
      
    # Create a boolean array "prime[0..n+1]".  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true. 
    prime = [True for i in range(n + 1)] 
  
    prime[0] = prime[1] = False
    for p in range(2, int(sqrt(n)) + 1, 1): 
          
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p]): 
              
            # Update all multiples of p 
            for i in range(p * 2, n + 1, p): 
                prime[i] = False
          
    for i in range(2, n + 1, 1): 
          
        # If i is prime and its digit sum  
        # is also prime i.e. i is a 
        # multiplicative prime 
        if (prime[i] and prime[digitProduct(i)]): 
            print(i, end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 10
    printMultiplicativePrimes(n) 
  
# This code is contributed by 
# Surendra_Gangwar 

