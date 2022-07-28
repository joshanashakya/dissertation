

# Python3 for finding super 
# power of n 
MAX = 100000; 
  
# global hash for prime 
prime = [True] * 100002; 
  
# sieve method for storing 
# a list of prime 
def SieveOfEratosthenes(): 
  
    p = 2; 
    while(p * p <= MAX): 
        if (prime[p] == True): 
            i = p * 2; 
            while(i <= MAX): 
                prime[i] = False; 
                i += p; 
        p += 1; 
  
# function to return super power 
def superpower(n): 
  
    SieveOfEratosthenes(); 
    superPower = 0; 
    factor = 0; 
    i = 2; 
      
    # find the super power 
    while (n > 1 and i <= MAX): 
        if (prime[i]): 
            factor = 0; 
            while (n % i == 0 and n > 1): 
                factor += 1; 
                n = int(n / i); 
  
            if (superPower < factor): 
                superPower = factor; 
        i += 1; 
  
    return superPower; 
  
# Driver Code 
n = 256; 
print(superpower(n)); 
  
# This code is contributed by mits 

