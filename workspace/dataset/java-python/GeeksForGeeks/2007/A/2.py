

# Python3 implementation of the approach 
MAX = 10000
  
# Create a boolean array "prime[0..n]" and  
# initialize all entries it as true.  
# A value in prime[i] will finally be false + 
# if i is Not a prime, else true. 
prime = [True for i in range(MAX + 1)] 
  
def SieveOfEratosthenes(): 
  
    prime[1] = False
  
    for p in range(2, MAX + 1): 
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
  
            # Set all multiples of p to non-prime 
            for i in range(2 * p, MAX + 1, p): 
                prime[i] = False
  
# Function to return the xor of  
# 1st N prime numbers 
def xorFirstNPrime(n): 
      
    # Count of prime numbers 
    count = 0
    num = 1
  
    # XOR of prime numbers 
    xorVal = 0
  
    while (count < n): 
  
        # If the number is prime xor it 
        if (prime[num]): 
            xorVal ^= num 
  
            # Increment the count 
            count += 1
  
        # Get to the next number 
        num += 1
  
    return xorVal 
  
# Driver code 
  
# Create the sieve 
SieveOfEratosthenes() 
  
n = 4
  
# Find the xor of 1st n prime numbers 
print(xorFirstNPrime(n)) 
  
# This code is contributed by Mohit Kumar 

