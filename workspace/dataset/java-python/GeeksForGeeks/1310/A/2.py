

# Python3 program to count number of divisors 
# of N which are Fibonacci numbers 
from math import sqrt,ceil,floor 
  
# Function to create hash table 
# to check Fibonacci numbers 
def createHash(maxElement): 
    prev = 0
    curr = 1
    d = dict() 
    d[prev] = 1
    d[curr] = 1
  
    while (curr <= maxElement): 
        temp = curr + prev 
        d[temp] = 1
        prev = curr 
        curr = temp 
    return d 
  
# Function to count number of divisors 
# of N which are fibonacci numbers 
def countFibonacciDivisors(n): 
    hash = createHash(n) 
  
    cnt = 0
    for i in range(1, ceil(sqrt(n))): 
        if (n % i == 0): 
  
            # If divisors are equal, 
            # check and count only one 
            if ((n // i == i) 
                and (n // i in hash)): 
                cnt += 1
  
            # Otherwise check and count both 
            else: 
                if (n // i in hash): 
                    cnt += 1
                if (n // (n // i) in hash): 
                    cnt += 1
    return cnt 
  
# Driver code 
n = 12
  
print(countFibonacciDivisors(n)) 
  
# This code is contriuted by mohit kumar 29 

