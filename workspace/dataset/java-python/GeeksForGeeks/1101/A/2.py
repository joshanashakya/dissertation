

# Python implementation of above approach 
from math import gcd, sqrt 
  
# Create a boolean array "prime[0..n]"  
# and initialize all entries it as true.  
# A value in prime[i] will finally be 
# false if i is Not a prime, else true. 
prime = [True] * 100001
  
def SieveOfEratosthenes() : 
      
    # 0 and 1 are not prime numbers 
    prime[0] = False
    prime[1] = False
      
    for p in range(2, int(sqrt(100001)) + 1) : 
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if prime[p] == True : 
  
            # Update all multiples of  
            # p as non-prime 
            for i in range(p**2, 100001, p) : 
                prime[i] = False
      
# Find the common prime divisors 
def common_prime(a, b) : 
  
    # Get the GCD of the given numbers 
    __gcd = gcd(a, b) 
  
    # Find the prime divisors of the gcd 
    for i in range(2, __gcd + 1) : 
   
        # If i is prime and a divisor of gcd 
        if prime[i] and __gcd % i == 0 : 
            print(i, end = " ") 
  
# Driver code 
if __name__ == "__main__" : 
  
    # Create the Seive 
    SieveOfEratosthenes() 
    a, b = 6, 12
      
    common_prime(a, b) 
      
# This code is contributed by ANKITRAI1 

