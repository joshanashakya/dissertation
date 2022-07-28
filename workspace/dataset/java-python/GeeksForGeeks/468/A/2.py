

# Python3 implementation of the approach  
from math import sqrt 
  
sz = int(1e5);  
isPrime = [True] * (sz + 1);  
  
# Function for Sieve of Eratosthenes  
def sieve() : 
  
    isPrime[0] = isPrime[1] = False;  
  
    for i in range(2, int(sqrt(sz)) + 1) : 
        if (isPrime[i]) : 
            for j in range(i * i, sz, i) : 
                isPrime[j] = False;  
      
# Function to return the minimum difference  
# between any two prime numbers  
# from the given range [L, R]  
def minDifference(L, R) :  
  
    # Find the first prime from the range  
    fst = 0;  
    for i in range(L, R + 1) : 
  
        if (isPrime[i]) : 
            fst = i;  
            break;  
  
    # Find the second prime from the range  
    snd = 0;  
    for i in range(fst + 1, R + 1) : 
  
        if (isPrime[i]) : 
            snd = i;  
            break;  
              
    # If the number of primes in  
    # the given range is < 2  
    if (snd == 0) : 
        return -1;  
  
    # To store the minimum difference between  
    # two consecutive primes from the range  
    diff = snd - fst;  
  
    # Range left to check for primes  
    left = snd + 1;  
    right = R;  
  
    # For every integer in the range  
    for i in range(left, right + 1) : 
  
        # If the current integer is prime  
        if (isPrime[i]) : 
  
            # If the difference between i  
            # and snd is minimum so far  
            if (i - snd <= diff) : 
  
                fst = snd;  
                snd = i;  
                diff = snd - fst;  
  
    return diff;  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Generate primes  
    sieve();  
  
    L = 21; R = 50;  
  
    print(minDifference(L, R));  
  
# This code is contributed by AnkitRai01 

