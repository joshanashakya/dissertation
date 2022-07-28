

# Python 3 implementation of the approach 
MAX = 1000000
  
# stores whether the number is prime or not 
prime = [True] * (MAX + 1) 
  
# stores the count of prime numbers 
# less than or equal to the index 
sum = [0] * (MAX + 1) 
  
# create the sieve 
def SieveOfEratosthenes(): 
  
    prime[1] = False
  
    p = 2
    while p * p <= MAX: 
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p]): 
  
            # Update all multiples of p 
            i = p * 2
            while i <= MAX: 
                prime[i] = False
                i += p 
                  
        p += 1
  
    # stores the prefix sum of number 
    # of primes less than or equal to 'i' 
    for i in range(1, MAX + 1): 
        if (prime[i] == True): 
            sum[i] = 1
  
        sum[i] += sum[i - 1] 
  
# Driver code 
if __name__ == "__main__": 
      
    # create the sieve 
    SieveOfEratosthenes() 
  
    # 'l' and 'r' are the lower and  
    # upper bounds of the range 
    l = 3
    r = 9
  
    # get the value of count 
    c = (sum[r] - sum[l - 1]) 
  
    # display the count 
    print("Count:", c) 
  
# This code is contributed by ita_c 

