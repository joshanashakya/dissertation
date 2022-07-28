

# Python 3 program to count almost  
# prime numbers  
# from 1 to n  
  
# from math import everything 
from math import *
  
N = 100005
  
# Create a boolean array "prime[0..n]" 
# and initialize all entries it as true.  
# A value in prime[i] will  
# finally be false if i is Not a prime, else true.  
prime = [True] * N 
  
def SieveOfEratosthenes() : 
  
    prime[1] = False
  
    for p in range(2, int(sqrt(N))) : 
  
        # If prime[p] is not changed, then  
        # it is a prime  
        if prime[p] == True : 
  
            # Update all multiples of p  
            for i in range(2*p, N, p) : 
                prime[i] = False
  
  
# Function to count almost prime numbers  
# from 1 to n  
def almostPrimes(n) : 
  
    # to store required answer 
    ans = 0
  
    # 6 is first almost prime number  
    for i in range(6, n + 1) : 
  
        # to count prime factors  
        c = 0
        for j in range(2, int(sqrt(i)) + 1) : 
  
            # if it is perfect square 
            if i % j == 0 : 
  
                if j * j == i : 
                    if prime[j] : 
                        c += 1
                else : 
                    if prime[j] : 
                        c += 1
                    if prime[i // j] : 
                        c += 1
  
        # if I is almost prime number  
        if c == 2 : 
            ans += 1
  
    return ans 
      
      
# Driver Code 
if __name__ == "__main__" : 
  
    SieveOfEratosthenes() 
    n = 21
  
    print(almostPrimes(n)) 
      
# This code is contributed by ANKITRAI1 

