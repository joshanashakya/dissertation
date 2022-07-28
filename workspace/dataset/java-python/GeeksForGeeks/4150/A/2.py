

# Python3 program to find XOR of Prime  
# Frequencies of Characters in a String  
from collections import defaultdict 
  
# Function to create Sieve to check primes  
def SieveOfEratosthenes(prime, p_size):  
  
    # False here indicates  
    # that it is not prime  
    prime[0] = False
    prime[1] = False
    p = 2
  
    while p * p <= p_size:  
  
        # If prime[p] is not changed,  
        # then it is a prime  
        if prime[p]:  
  
            # Update all multiples of p,  
            # set them to non-prime  
            for i in range(p * 2, p_size + 1, p):  
                prime[i] = False
                  
        p += 1
  
# Function to find XOR of prime frequencies  
def xorOfPrime(s): 
  
    prime = [True] * 100005
      
    SieveOfEratosthenes(prime, 10005)  
  
    # map is used to store character frequencies  
    m = defaultdict(lambda:0)  
    for i in range(0, len(s)):  
        m[s[i]] += 1
  
    result = flag = 0
  
    # Traverse the map  
    for it in m:  
          
        # Calculate XOR of all prime frequencies  
        if prime[m[it]]:  
            result ^= m[it]  
            flag = 1
          
    if not flag:  
        return -1
  
    return result  
  
# Driver code  
if __name__ == "__main__":  
  
    s = "gggggeeekkkks"
  
    print(xorOfPrime(s))  
  
# This code is contributed by Rituraj Jain 

