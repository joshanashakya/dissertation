

# Python 3 program to count number of 
# ways we can express a factorial 
# as sum of consecutive numbers 
MAX = 50002; 
  
primes = [] 
  
# sieve of Eratosthenes to compute 
# the prime numbers 
def sieve(): 
    isPrime = [True]*(MAX) 
      
    p = 2
    while p * p < MAX : 
        if (isPrime[p] == True): 
            for i in range( p * 2,MAX, p): 
                isPrime[i] = False
        p+=1
  
    # Store all prime numbers 
    for p in range( 2,MAX): 
        if (isPrime[p]): 
            primes.append(p) 
  
# function to calculate the largest 
# power of a prime in a number 
def power( x, y): 
  
    count = 0
    z = y 
    while (x >= z): 
        count += (x // z) 
        z *= y 
      
    return count 
  
# Modular multiplication to avoid 
# the overflow of multiplication 
# Please see below for details 
# https://www.geeksforgeeks.org/how-to-avoid-overflow-in-modular-multiplication/ 
def modMult(a, b,mod): 
    res = 0
    a = a % mod 
    while (b > 0): 
        if (b % 2 == 1): 
            res = (res + a) % mod 
        a = (a * 2) % mod 
        b //= 2
      
    return res % mod 
  
# Returns count of ways to express n! 
# as sum of consecutives. 
def countWays(n,m): 
    ans = 1
  
    # We skip 2 (First prime) as we need to 
    # consider only odd primes 
    for i in range(1,len(primes)): 
  
        # compute the largest power of prime 
        powers = power(n, primes[i]) 
  
        # if the power of current prime number 
        # is zero in N!, power of primes greater 
        # than current prime number will also 
        # be zero, so break out from the loop 
        if (powers == 0): 
            break
  
        # multiply the result at every step 
        ans = modMult(ans, powers + 1, m) % m 
      
  
    # subtract 1 to exclude the case of 1 
    # being an odd divisor 
    if (((ans - 1) % m) < 0): 
        return (ans - 1 + m) % m 
    else: 
        return (ans - 1) % m 
  
# Driver Code 
if __name__ == "__main__": 
    sieve() 
    n = 4
    m = 7
    print(countWays(n, m)) 
      
# This code is contributed by ChitraNayal 

