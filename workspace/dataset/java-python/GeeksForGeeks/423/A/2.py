

# Python 3 implementation of the approach 
  
from math import sqrt 
MAXN = 100001
mod = 1000000007
  
# To store the smallest prime factor 
# for every number 
spf = [0 for i in range(MAXN)] 
  
# Initialize map to store 
# count of prime factors 
cnt = {i:0 for i in range(10)} 
  
# Function to calculate SPF(Smallest Prime Factor) 
# for every number till MAXN 
def sieve(): 
    spf[1] = 1
    for i in range(2,MAXN): 
          
        # Marking smallest prime factor for every 
        # number to be itself 
        spf[i] = i 
  
    # Separately marking spf for every even 
    # number as 2 
    for i in range(4,MAXN,2): 
        spf[i] = 2
  
    for i in range(3,int(sqrt(MAXN))+1,1): 
          
        # Checking if i is prime 
        if (spf[i] == i): 
              
            # Marking SPF for all numbers divisible by i 
            for j in range(i * i,MAXN,i): 
                  
                # Marking spf[j] if it is not 
                # previously marked 
                if (spf[j] == j): 
                    spf[j] = i 
  
# Function to factorize using spf 
# and store in cnt 
def factorize(f): 
    while (f > 1): 
        x = spf[f] 
        while (f % x == 0): 
            cnt[x] += 1
            f = int(f/x) 
  
# Function to return n! % p 
def factorial(n,p): 
      
    #Initialize result 
    res = 1
    for i in range(2,n+1,1): 
        res = (res * i) % p 
    return res 
  
# Iterative Function to calculate (x^y)%p 
# in O(log y) 
def power(x, y, p): 
      
    # Initialize result 
    res = 1
  
    # Update x if it is >= p 
    x = x % p 
  
    while (y > 0): 
          
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
              
        # y must be even now 
        # y = y/2 
        y = y >> 1
        x = (x * x) % p 
    return res 
  
# Function that returns n^(-1) mod p 
def modInverse(n,p): 
    return power(n, p - 2, p) 
  
# Function that returns nCr % p 
# using Fermat's little theorem 
def nCrModP(n,r,p): 
      
    # Base case 
    if (r == 0): 
        return 1
  
    # Fill factorial array so that we 
    # can find all factorial of r, n 
    # and n - r 
    fac = [0 for i in range(n+1)] 
    fac[0] = 1
    for i in range(1,n+1,1): 
        fac[i] = fac[i - 1] * i % p 
  
    return (fac[n] * modInverse(fac[r], p) % p *
                modInverse(fac[n - r], p) % p)% p 
  
# Function to return the count the number of possible 
# arrays mod P of length K such that the product of all 
# elements of that array is equal to the product of 
# all elements of the given array of length N 
def countArrays(arr,N,K,P): 
    # Initialize result 
    res = 1
  
    # Call sieve to get spf 
    sieve() 
  
    for i in range(N): 
        # Factorize arr[i], count and 
        # store its factors in cnt 
        factorize(arr[i]) 
  
    for key,value in cnt.items(): 
        ci = value 
        res = (res * nCrModP(ci + K - 1, K - 1, P)) % P 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 3, 5, 2] 
    K = 3
    N = len(arr) 
  
    print(countArrays(arr, N, K, mod)) 
  
# This code is contributed by 
# Surendra_Gangwar 

