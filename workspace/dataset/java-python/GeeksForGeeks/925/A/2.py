

# Python3 Program to find product 
# of prime numbers between 1 to n 
  
# Returns product of primes  
# in range from 1 to n. 
def ProdOfPrimes(n): 
  
    # Array to store prime numbers 
    prime = [True for i in range(n + 1)] 
  
    # Create a boolean array "prime[0..n]" 
    # and initialize all entries it as true. 
    # A value in prime[i] will finally be 
    # false if i is Not a prime, else true. 
    p = 2
    while(p * p <= n):  
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True):  
  
            # Update all multiples of p 
            i = p * 2
            while(i <= n): 
                prime[i] = False
                i += p 
        p += 1
  
    # Return product of primes  
    # generated through Sieve. 
    prod = 1
    for i in range(2, n+1): 
        if (prime[i]): 
            prod *= i 
    return prod 
  
# Driver code 
n = 10
print(ProdOfPrimes(n)) 
  
# This code is contributed by Anant Agarwal. 

