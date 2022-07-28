

# Python 3 implementation of the above approach 
from math import sqrt 
  
# stores whether a number is prime or not 
  
# create the sieve of eratosthenes 
def SieveOfEratosthenes(): 
    MAX = 1000001
      
    # Create a boolean array "prime[0..n]" and  
    # initialize all entries it as true. A value  
    # in prime[i] will finally be false if i is  
    # Not a prime, else true. 
    prime = [True for i in range(MAX + 1)] 
  
    prime[1] = False
  
    for p in range(2, int(sqrt(MAX)) + 1, 1): 
          
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p  
            # as non-prime 
            for i in range(p * 2, MAX + 1, p): 
                prime[i] = False
  
    return prime 
      
# find the two prime numbers with minimum 
# difference and whose sum is equal to 
# variable sum 
def find_Prime(sum): 
      
    # start from sum/2 such that difference  
    # between i and sum-i will be minimum 
    # create the sieve 
    prime = SieveOfEratosthenes() 
    i = int(sum / 2) 
    while(i > 1): 
          
        # if both 'i' and 'sum - i' are prime 
        # then print them and break the loop 
        if (prime[i] and prime[sum - i]): 
            print(i, (sum - i)) 
            return
              
        i -= 1
  
    # if there is no prime 
    print("Cannot be represented as sum",  
                         "of two primes") 
  
# Driver code 
if __name__ == '__main__': 
  
    sum = 1002
  
    # find the primes 
    find_Prime(sum) 
  
# This code is contributed by 
# Shashank_Sharma 

