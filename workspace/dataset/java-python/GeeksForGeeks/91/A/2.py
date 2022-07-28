

# Python3 implementation of above approach 
from math import gcd, sqrt 
  
MAX = 100000
  
prime = [True] * MAX
  
# Sieve to find prime 
def sieve() : 
      
    # 0 and 1 are not prime numbers 
    prime[0] = False
    prime[1] = False
      
    for i in range(2, MAX) : 
  
        if prime[i] : 
            for j in range(2**i, MAX, i) : 
                prime[j] = False
      
# Function to check if the sum of 
# prime is prime or not 
def checkArray(arr, n) : 
  
    # find sum of all prime number 
    sum = 0
    for i in range(n) : 
  
        if prime[arr[i]] : 
            sum += arr[i] 
  
    # if sum is prime 
    # then return yes 
    if prime[sum] : 
        return True
  
    return False
  
# Driver code 
if __name__ == "__main__" : 
  
    # list of elements 
    arr = [1, 2, 3] 
    n = len(arr) 
  
    sieve() 
  
    if checkArray(arr, n) : 
        print("Yes") 
    else : 
        print("No") 
          
# This code is contributed by ANKITRAI1 

