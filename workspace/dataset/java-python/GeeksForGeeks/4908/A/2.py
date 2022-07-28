

# Python 3 implementation of the approach 
SIZE = 26
  
from math import sqrt 
  
# Function to create Sieve to check primes 
def SieveOfEratosthenes(prime, p_size): 
      
    # false here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
  
    for p in range(2, int(sqrt(p_size)), 1): 
          
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]): 
              
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range(p * 2, p_size, p): 
                prime[i] = False
  
# Function to print the prime frequency characters 
# in the order of their occurrence 
def printChar(str, n): 
    prime = [True for i in range(n + 1)] 
  
    # Function to create Sieve to check primes 
    SieveOfEratosthenes(prime, len(str) + 1) 
  
    # To store the frequency of each of 
    # the character of the string 
    freq = [0 for i in range(SIZE)] 
  
    # Update the frequency of each character 
    for i in range(n): 
        freq[ord(str[i]) - ord('a')] += 1
  
    # Traverse str character by character 
    for i in range(n): 
        # If frequency of current character is prime 
        if (prime[freq[ord(str[i]) - ord('a')]]): 
            print(str[i], end = "") 
  
# Driver code 
if __name__ == '__main__': 
    str = "geeksforgeeks"
    n = len(str) 
  
    printChar(str, n) 
      
# This code is contributed by Surendra_Gangwar 

