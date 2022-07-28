

# Python3 implementation of the approach  
from math import sqrt; 
  
N = 100005; 
  
# To check if a number is prime or not  
isprime = [True] * N;  
  
# To store possible numbers  
can = [False] * N;  
  
# Function to return all prime numbers  
def SieveOfEratosthenes() : 
  
    for p in range(2, int(sqrt(N)) + 1) : 
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if (isprime[p] == True) : 
  
            # Update all multiples of p greater  
            # than or equal to the square of it  
            # numbers which are multiple of p and are  
            # less than p^2 are already been marked.  
            for i in range(p * p, N , p) :  
                isprime[i] = False;  
  
    primes = [];  
    for i in range(2, N) : 
        if (isprime[i]):  
            primes.append(i);  
  
    return primes;  
  
# Function to count all possible prime numbers 
# that can be expressed as the sum of two  
# consecutive primes and one  
def Prime_Numbers(n) :  
  
    primes = SieveOfEratosthenes();  
  
    # All possible prime numbers below N  
    for i in range(len(primes) - 1) : 
        if (primes[i] + primes[i + 1] + 1 < N) : 
            can[primes[i] + primes[i + 1] + 1] = True;  
  
    ans = 0;  
    for i in range(2, n + 1) :  
        if (can[i] and isprime[i]) :  
            ans += 1;  
              
    return ans;  
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 50;  
    print(Prime_Numbers(n));  
  
# This code is contributed by Ryuga 

