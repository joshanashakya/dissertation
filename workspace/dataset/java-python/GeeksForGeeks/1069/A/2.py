

# Python3 implementation of the approach  
from math import sqrt 
  
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
            for i in range(p * 2, p_size + 1, p) :  
                prime[i] = False;  
                  
    return prime 
      
# Function to return the xor of elements  
# in an array having prime frequency  
def xorPrimeFreq( arr, n) :  
    prime = [True] * (n + 1);  
  
    prime = SieveOfEratosthenes(prime, n + 1);  
  
    # Map is used to store  
    # element frequencies  
    m = dict.fromkeys(arr, 0); 
      
    for i in range(n) : 
        m[arr[i]] += 1;  
  
    xorVal = 0;  
  
    # Traverse the map using iterators  
    for key,value in m.items() : 
  
        # Count the number of elements  
        # having prime frequencies  
        if (prime[value]) : 
            xorVal ^= key;  
  
    return xorVal;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 5, 4, 6, 5, 4, 6 ];  
      
    n = len(arr);  
  
    print(xorPrimeFreq(arr, n));  
  
# This code is contributed by AnkitRai01 

