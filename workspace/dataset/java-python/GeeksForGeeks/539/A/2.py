

# Python3 implementation of the above approach 
  
# Function to find primes 
def sieve(maxm, prime): 
  
    prime[0] = prime[1] = 1; 
    i = 2; 
  
    while (i * i <= maxm): 
        if (prime[i] == 0): 
            for j in range(2 * i, maxm + 1, i): 
                prime[j] = 1; 
        i += 1; 
  
def countPair(a, n): 
  
    # Find the maximum element  
    # of the array 
    maxm = max(a); 
    prime = [0] * (maxm + 1); 
  
    # Find primes upto maximum 
    sieve(maxm, prime); 
  
    # Count number of primes 
    countPrimes = 0; 
    for i in range(n): 
        if (prime[a[i]] == 0): 
            countPrimes += 1; 
  
    nonPrimes = n - countPrimes; 
    pairswith1Prime = nonPrimes * countPrimes; 
    pairsWith2Primes = (countPrimes * 
                       (countPrimes - 1)) // 2; 
  
    return pairswith1Prime + pairsWith2Primes; 
  
# Driver code 
arr = [ 2, 3, 5, 4, 7 ]; 
n = len(arr); 
  
print(countPair(arr, n)); 
  
# This code is contributed by mits 

