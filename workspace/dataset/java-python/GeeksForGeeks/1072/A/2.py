

# Python3 implementation of the approach 
MOD = 1000000007
  
# Function to create Sieve to check primes 
def SieveOfEratosthenes(prime, p_size): 
      
    # False here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
  
    for p in range(2, p_size): 
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]): 
  
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range(2 * p, p_size, p): 
                prime[i] = False
  
# Function to return the product of elements 
# in an array having prime frequency 
def productPrimeFreq(arr, n): 
    prime = [True for i in range(n + 1)] 
  
    SieveOfEratosthenes(prime, n + 1) 
  
    i, j = 0, 0
  
    # Map is used to store 
    # element frequencies 
    m = dict() 
    for i in range(n): 
        m[arr[i]] = m.get(arr[i], 0) + 1
  
    product = 1
  
    # Traverse the map using iterators 
    for it in m: 
  
        # Count the number of elements 
        # having prime frequencies 
        if (prime[m[it]]): 
            product *= it % MOD 
            product %= MOD 
  
    return product 
  
# Driver code 
arr = [5, 4, 6, 5, 4, 6] 
n = len(arr) 
  
print(productPrimeFreq(arr, n)) 
  
# This code is contributed by Mohit Kumar 

