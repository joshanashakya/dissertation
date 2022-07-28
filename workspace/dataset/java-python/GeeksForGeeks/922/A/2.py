

# Python3 program to find product of 
# primes in given array 
import math as mt 
  
# function to find the product of prime 
# numbers in the given array 
def primeProduct(arr, n): 
      
    # find the maximum value in the array 
    max_val = max(arr) 
      
    # USE SIEVE TO FIND ALL PRIME NUMBERS  
    # LESS THAN OR EQUAL TO max_val 
    # Create a boolean array "prime[0..n]". A 
    # value in prime[i] will finally be false 
    # if i is Not a prime, else true. 
    prime = [True for i in range(max_val + 1)] 
      
    # remaining part of SIEVE 
    prime[0] = False
    prime[1] = False
      
    for p in range(mt.ceil(mt.sqrt(max_val))): 
          
        # Remaining part of SIEVE 
          
        # if prime[p] is not changed,  
        # than it is prime 
        if prime[p]: 
              
            # update all multiples of p 
            for i in range(p * 2, max_val + 1, p): 
                prime[i] = False
      
    # product all primes in arr[] 
    prod = 1
      
    for i in range(n): 
        if prime[arr[i]]: 
            prod *= arr[i] 
      
    return prod 
  
# Driver code 
arr = [1, 2, 3, 4, 5, 6, 7] 
  
n = len(arr) 
  
print(primeProduct(arr, n)) 
  
# This code is contributed  
# by Mohit kumar 29 
                 

