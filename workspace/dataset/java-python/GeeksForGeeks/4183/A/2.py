

# Python 3 Program to find the minimum 
# number of square free divisors 
from math import sqrt 
  
# Initializing MAX with SQRT(10 ^ 6) 
MAX = 1005
  
def SieveOfEratosthenes(primes): 
      
    # Create a boolean array "prime[0..n]" and  
    # initialize all entries it as true. A value  
    # in prime[i] will finally be false if i is  
    # Not a prime, else true. 
    prime = [True for i in range(MAX)] 
  
    for p in range(2,int(sqrt(MAX)) + 1, 1): 
          
        # If prime[p] is not changed, then  
        # it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, MAX, p): 
                prime[i] = False 
  
    # Print all prime numbers 
    for p in range(2, MAX, 1): 
        if (prime[p]): 
            primes.append(p) 
  
    return primes 
  
# This function returns the minimum number  
# of Square Free divisors 
def minimumSquareFreeDivisors(N): 
    prime = [] 
    primes = [] 
      
    # Precomputing Prime Factors 
    primes = SieveOfEratosthenes(prime) 
  
    # holds max of max power of all 
    # prime factors 
    max_count = 0
    i = 0
    while(len(primes) and primes[i] * 
                          primes[i] <= N): 
        if (N % primes[i] == 0): 
  
            # holds the max power of current 
            # prime factor 
            tmp = 0
            while (N % primes[i] == 0): 
                tmp += 1
                N /= primes[i] 
  
            max_count = max(max_count, tmp) 
  
        i += 1
  
    # If number itself is prime, it will be included 
    # as answer and thus minimum required answer is 1 
    if (max_count == 0): 
        max_count = 1
  
    return max_count 
  
# Driver Code 
if __name__ == '__main__': 
    N = 24
    print("Minimum Number of Square Free Divisors is", 
                         minimumSquareFreeDivisors(N)) 
  
    N = 6
    print("Minimum Number of Square Free Divisors is", 
                         minimumSquareFreeDivisors(N)) 
      
# This code is contributed by 
# Surendra_Gangwar 

