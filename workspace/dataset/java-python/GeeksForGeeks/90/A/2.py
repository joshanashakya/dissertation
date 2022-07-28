

# Python3 program to check if sum of  
# primes from an array is divisible 
# by any of the primes from the same array 
import math 
  
# Function to print "YES" if sum of primes  
# from an array is divisible by any of the  
# primes from the same array 
def SumDivPrime(A, n): 
  
    max_val = max(A) + 1
  
    # USE SIEVE TO FIND ALL PRIME NUMBERS  
    # LESS THAN OR EQUAL TO max_val 
    # Create a boolean array "prime[0..n]".  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true. 
    prime = [True] * (max_val + 1) 
  
    # Remaining part of SIEVE 
    prime[0] = False
    prime[1] = False
    for p in range(2, int(math.sqrt(max_val)) + 1): 
  
        # If prime[p] is not changed,  
        # then it is a prime 
        if prime[p] == True : 
  
            # Update all multiples of p 
            for i in range(2 * p, max_val + 1, p): 
                prime[i] = False
  
    sum = 0
  
    # Traverse through the array 
    for i in range(0, n): 
        if prime[A[i]]: 
            sum += A[i] 
      
    for i in range(0, n): 
        if prime[A[i]] and sum % A[i] == 0: 
            print("YES") 
            return
          
    print("NO") 
  
# Driver Code 
A = [ 1, 2, 3, 4, 5 ] 
n = len(A) 
  
SumDivPrime(A, n) 
  
# This code is contributed  
# by saurabh_shukla 

