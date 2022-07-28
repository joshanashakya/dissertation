

# Python 3 program to find length of the  
# longest subarray with all primes except  
# possibily one. 
from math import sqrt 
N = 100000
  
prime = [True for i in range(N + 1)] 
  
def SieveOfEratosthenes(): 
      
    # Create a boolean array "prime[0..n]"  
    # and initialize all entries it as true.  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true. 
    k = int(sqrt(N)) + 1
    for p in range(2, k, 1): 
          
        # If prime[p] is not changed,  
        # then it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, N + 1, p): 
                prime[i] = False
                  
def longestPrimeSubarray(arr, n): 
    left = [0 for i in range(n)] 
    right = [0 for i in range(n)] 
    primecount = 0
    res = 0
  
    # left array used to count number of  
    # continuous prime numbers starting  
    # from left of current element 
    for i in range(n): 
        left[i] = primecount 
        if (prime[arr[i]]): 
            primecount += 1
          
        else: 
            primecount = 0
          
    # right array used to count number of  
    # continuous prime numbers starting  
    # from right of current element 
    primecount = 0
    i = n - 1
    while(i >= 0): 
        right[i] = primecount 
        if (prime[arr[i]]): 
            primecount += 1
      
        else: 
            primecount = 0
              
        i -= 1
  
    for i in range(n): 
        res = max(res, left[i] + right[i]) 
      
    return res 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 8, 5, 7, 9, 5, 7] 
  
    # used of SieveOfEratosthenes method  
    # to detect a number prime or not 
    SieveOfEratosthenes() 
    n = len(arr) 
    print("largest length of PrimeSubarray",  
               longestPrimeSubarray(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

