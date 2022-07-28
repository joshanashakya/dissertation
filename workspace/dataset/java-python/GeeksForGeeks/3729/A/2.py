

# Python3 implementation of the approach  
from math import sqrt, gcd 
  
# Function to create Sieve to check primes  
def SieveOfEratosthenes(prime, p_size) : 
  
    # False here indicates  
    # that it is not prime  
    prime[0] = False;  
    prime[1] = False;  
  
    for p in range(2, int(sqrt(p_size)) + 1) :  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p]) : 
  
            # Update all multiples of p,  
            # set them to non-prime  
            for i in range(2 * p, p_size, p) :  
                prime[i] = False;  
  
# Function to return the GCD of elements  
# in an array having prime frequency  
def gcdPrimeFreq(arr, n) : 
  
    prime = [True] * (n + 1);  
  
    SieveOfEratosthenes(prime, n + 1); 
      
    # Map is used to store 
    # element frequencies 
    m = dict.fromkeys(arr, 0); 
      
    for i in range(n) : 
        m[arr[i]] += 1;  
  
    __gcd = 0;  
  
    # Traverse the map using iterators  
    for key,value in m.items() :  
  
        # Count the number of elements  
        # having prime frequencies  
        if (prime[value]) : 
            __gcd = gcd(__gcd, key);  
      
    return __gcd;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 5, 4, 6, 5, 4, 6 ]; 
    n = len(arr);  
  
    print(gcdPrimeFreq(arr, n));  
  
# This code is contributed by AnkitRai01 

