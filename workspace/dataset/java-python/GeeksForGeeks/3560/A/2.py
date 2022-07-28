

# Python3 implementation of the approach 
MAX = 100005
prime = [True for i in range(MAX)] 
  
# Function for Sieve of Eratosthenes 
def SieveOfEratosthenes(): 
  
    # False here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
  
    for p in range(MAX): 
  
        if(p * p > MAX): 
            break
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]): 
  
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range(2 * p, MAX, p): 
                prime[i] = False
  
# Function to return the count of primes 
# less than or equal to n which can be 
# expressed as the sum of two primes 
def countPrimes(n): 
    SieveOfEratosthenes() 
  
    # To store the required count 
    cnt = 0
  
    for i in range(2, n): 
  
        # If the integer is prime and it 
        # can be expressed as the sum of 
        # 2 and a prime number 
        if (prime[i] and prime[i - 2]): 
            cnt += 1
  
    return cnt 
  
# Driver code 
n = 11
  
print(countPrimes(n)) 
  
# This code is contributed by Mohit Kumar 

