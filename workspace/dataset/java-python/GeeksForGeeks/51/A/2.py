

# Python implementation to check 
# if N can be written as sum of 
# k primes 
  
# Checking if a number is prime 
# or not 
def isprime(x): 
      
    # check for numbers from 2 
    # to sqrt(x) if it is divisible 
    # return false 
    i = 2
    while(i * i <= x): 
        if (x % i == 0): 
            return 0
    return 1
  
# Returns true if N can be written 
# as sum of K primes 
def isSumOfKprimes(N, K): 
      
    # N < 2K directly return false 
    if (N < 2 * K): 
        return 0
  
    # If K = 1 return value depends 
    # on primality of N 
    if (K == 1): 
        return isprime(N) 
  
    if (K == 2): 
          
        # if N is even directly 
        # return true; 
        if (N % 2 == 0): 
            return 1
  
        # If N is odd, then one  
        # prime must be 2. All  
        # other primes are odd 
        # and cannot have a pair 
        # sum as even. 
        return isprime(N - 2); 
      
  
    # If K >= 3 return true; 
    return 1
  
# Driver function 
n = 10
k = 2
if (isSumOfKprimes (n, k)): 
    print ("Yes") 
else: 
    print ("No") 
  
# This code is Contributed by Sam007. 

