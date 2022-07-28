

# Python 3 program to find product of primes 
# in range L to R 
  
mod = 1000000007
MAX = 10000
  
# prefix[i] is going to store product of primes 
# till i (including i). 
prefix = [0]*(MAX + 1) 
  
# Function to build the prefix product array 
def buildPrefix(): 
  
    # Create a boolean array "prime[0..n]". A 
    # value in prime[i] will finally be false 
    # if i is Not a prime, else true. 
    prime = [True]*(MAX + 1) 
  
    p = 2
    while p * p <= MAX : 
  
        # If prime[p] is not changed, then 
        # it is a prime 
        if (prime[p] == True) : 
  
            # Update all multiples of p 
            for i in range( p * 2, MAX+1, p): 
                prime[i] = False
                  
        p += 1
  
    # Build prefix array 
    prefix[0] = prefix[1] = 1
    for p in range(2,MAX+1) : 
        prefix[p] = prefix[p - 1] 
        if (prime[p]): 
            prefix[p] = (prefix[p] * p) % mod 
      
# Iterative Function to calculate  
# (x^y)%p in O(log y)  
def power(x, y,p): 
  
    # Initialize result 
    res = 1
  
    # Update x if it is more than or 
    # equal to p 
    x = x % p 
  
    while (y > 0) : 
  
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p 
  
        # y must be even now 
        # y = y//2 
        y = y >> 1
        x = (x * x) % p 
  
    return res 
  
# Returns modular inverse 
def inverse( n): 
  
    return power(n, mod - 2, mod) 
  
# Function to return product of prime in range 
def productPrimeRange(L, R): 
    return (prefix[R] * inverse(prefix[L - 1])) % mod 
  
# Driver code 
if __name__ == "__main__": 
    buildPrefix() 
  
    L = 10
    R = 20
  
    print(productPrimeRange(L, R)) 
      
# this code is contributed by 
# ChitraNayal 

