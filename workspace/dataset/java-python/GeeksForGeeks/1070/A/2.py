

# Python3 program to find Sum of elements 
# in an array having prime frequency 
import math as mt 
  
# Function to create Sieve to 
# check primes 
def SieveOfEratosthenes(prime, p_size): 
      
    # False here indicates 
    # that it is not prime 
    prime[0] = False
    prime[1] = False
  
    for p in range(2, mt.ceil(mt.sqrt(p_size + 1))): 
  
        # If prime[p] is not changed, 
        # then it is a prime 
        if (prime[p]): 
  
            # Update all multiples of p, 
            # set them to non-prime 
            for i in range(p * 2, p_size + 1, p): 
                prime[i] = False
          
# Function to return the Sum of elements 
# in an array having prime frequency 
def SumOfElements(arr, n): 
    prime = [True for i in range(n + 1)] 
    SieveOfEratosthenes(prime, n + 1) 
  
    i, j = 0, 0
  
    # Map is used to store 
    # element frequencies 
    m = dict() 
    for i in range(n): 
        if arr[i] in m.keys(): 
            m[arr[i]] += 1
        else: 
            m[arr[i]] = 1
              
    Sum = 0
  
    # Traverse the map using iterators 
    for i in m: 
          
        # Count the number of elements 
        # having prime frequencies 
        if (prime[m[i]]): 
            Sum += (i) 
      
    return Sum
  
# Driver code 
arr = [5, 4, 6, 5, 4, 6 ] 
n = len(arr) 
print(SumOfElements(arr, n)) 
  
# This code is contributed 
# by Mohit kumar 29 

