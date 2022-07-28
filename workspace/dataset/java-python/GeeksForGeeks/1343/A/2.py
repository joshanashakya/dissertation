

# Python 3 program to find the highest  
# occurring digit in prime numbers 
# in a range L to R. 
  
# Sieve of Eratosthenes 
def sieve(prime, n): 
    p = 2
    while p * p <= n : 
        if (prime[p] == False): 
            for i in range(p * 2, n, p): 
                prime[i] = True
                  
        p += 1
  
# Returns maximum occurring digits 
# in primes from l to r. 
def maxDigitInPrimes(L, R): 
  
    prime = [0] * (R + 1) 
  
    # Finding the prime number up to R. 
    sieve(prime, R) 
  
    # Initialse frequency of all 
    # digit to 0. 
    freq = [0] * 10
  
    # For all number between L to R,  
    # check if prime or not. If prime, 
    # incrementing the frequency 
    # of digits present in the prime number. 
    for i in range(L, R + 1): 
        if (not prime[i]): 
            p = i # If i is prime 
            while (p): 
                freq[p % 10] += 1
                p //= 10
  
    # Finding digit with highest frequency. 
    max = freq[0] 
    ans = 0
    for j in range(1, 10): 
        if (max <= freq[j]): 
            max = freq[j] 
            ans = j 
  
    return ans 
  
# Driver Code 
if __name__=="__main__": 
      
    L = 1
    R = 20
  
    print(maxDigitInPrimes(L, R)) 
  
# This code is contributed by ita_c 

