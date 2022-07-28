

# Python3 implementation of above approach  
  
from math import sqrt 
  
max_val = 257 
  
# Function to find prime characters in the string  
def PrimeCharacters(s) : 
  
    # USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
    # THAN OR EQUAL TO max_val  
    # Create a Boolean array "prime[0..n]". A  
    # value in prime[i] will finally be false  
    # if i is Not a prime, else true. 
    prime = [True] * (max_val + 1) 
  
    # 0 and 1 are not primes  
    prime[0] = False
    prime[1] = False 
    for p in range(2, int(sqrt(max_val)) + 1) : 
  
        # If prime[p] is not changed, then  
        # it is a prime  
        if (prime[p] == True) :  
  
            # Update all multiples of p  
            for i in range(2*p ,max_val + 1, p) : 
                prime[i] = False
  
    count = 0
  
    # Traverse all the characters  
    for i in range(len(s)) : 
        if (prime[ord(s[i])]) : 
            count += 1
              
    return count  
  
# Driver program  
if __name__ == "__main__" :  
  
    S = "geeksforgeeks";  
  
    # print required answer  
    print(PrimeCharacters(S))  
  
# This code is contributed by Ryuga 

