

# Python3 implementation to find the 
# minimum window size in the range 
# such that each window of that size 
# contains atleast P primes 
  
from math import sqrt 
  
# Function to check that a number is  
# a prime or not in O(sqrt(N)) 
def isPrime(N): 
    if (N < 2): 
        return False
    if (N < 4): 
        return True
    if ((N & 1) == 0): 
        return False
    if (N % 3 == 0): 
        return False
      
    curr = 5
    s = sqrt(N) 
      
    # Loop to check if any number 
    # number is divisible by any  
    # other number or not 
    while (curr <= s): 
        if (N % curr == 0): 
            return False
        curr += 2
        if (N % curr == 0): 
            return False
          
        curr += 4
      
    return True
  
# Function to check whether window 
# size satisfies condition or not 
def check(s, p, prefix_sum, n): 
      
    satisfies = True
    # Loop to check each window of  
    # size have atleast P primes 
    for i in range(n): 
        if (i + s - 1 >= n): 
            break
        # Checking condition  
        # using prefix sum 
        if (i - 1 >= 0): 
            x = prefix_sum[i - 1] 
        else: 
            x = 0
        if (prefix_sum[i + s - 1] - x < p): 
            satisfies = False
          
    return satisfies 
  
# Function to find the minimum  
# window size possible for the 
# given range in X and Y 
def minimumWindowSize(x, y, p): 
      
    # Prefix array 
    prefix_sum = [0]*(y - x + 1) 
      
    # Mark those numbers  
    # which are primes as 1     
    for i in range(x ,y+1): 
        if (isPrime(i)): 
            prefix_sum[i - x] = 1
      
    # Convert to prefix sum 
    for i in range(1 ,y - x + 1): 
        prefix_sum[i] += prefix_sum[i - 1] 
          
    # Applying binary search  
    # over window size 
    low = 1
    high = y - x + 1
      
    while (high - low > 1): 
        mid = (low + high) // 2
          
        # Check whether mid satisfies  
        # the condition or not 
        if (check(mid, p ,prefix_sum, y - x + 1)): 
              
            # If satisfies search 
            # in first half 
            high = mid 
          
        # Else search in second half 
        else: 
            low = mid 
    if (check(low, p, prefix_sum, y - x + 1)): 
        return low 
    return high 
  
# Driver Code 
x = 12
y = 42
p = 3
  
print(minimumWindowSize(x, y, p)) 
  
# This code is contributed by shubhamsingh10 

