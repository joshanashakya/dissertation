

# Python3 program to find Sum and product of Prime 
# Frequencies of Characters in a String 
  
# Function to create Sieve to check primes 
def SieveofEratosthenes(prime, p_size): 
  
    # false here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
  
    for p in range(2, p_size + 1): 
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if prime[p]: 
  
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range(p * 2, p_size + 1, p): 
                prime[i] = False
  
# Function to find the sum of prime frequencies 
# of the characters of the given string 
def sumProdOfPrimeFreq(s): 
    prime = [True] * (len(s) + 2) 
  
    SieveofEratosthenes(prime, len(s) + 1) 
  
    i = 0
    j = 0
  
    # map is used to store 
    # character frequencies 
    m = dict() 
  
    for i in range(len(s)): 
        m[s[i]] = (m[s[i]] + 1) if s[i] in m else 1
  
    s = 0
    product = 1
  
    # Traverse the map 
    for it in m: 
  
        # If the frequency is prime 
        if prime[m[it]]: 
            s += m[it] 
            product *= m[it] 
  
    print("Sum =", s) 
    print("Product =", product) 
  
# Driver code 
if __name__ == "__main__": 
    s = "geeksforgeeks"
    sumProdOfPrimeFreq(s) 
  
# This code is contributed by 
# sanjeev2552 

