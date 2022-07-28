

import math 
  
# Python program to implement 
# the above approach 
  
# Function to get the prime factors 
# and its count of times it divides 
def primeFactors(n, freq): 
    cnt = 0
  
    # Count the number of 2s that divide n 
    while n % 2 == 0: 
        cnt = cnt + 1
        n = int(n // 2) 
  
    freq[2] = cnt 
  
    # n must be odd at this point. So we can skip 
    # one element (Note i = i+2) 
    i=3
    while i<=math.sqrt(n): 
        cnt = 0
  
        # While i divides n, count i and divide n 
        while (n % i == 0): 
            cnt = cnt+1
            n = int(n // i) 
              
        freq[int(i)] = cnt 
        i=i + 2
          
    # This condition is to handle the case when n 
    # is a prime number greater than 2 
    if (n > 2): 
        freq[int(n)] = 1
  
  
# Function to return the highest power 
def getMaximumPower(n, m): 
  
    # Initialize two arrays 
    freq1 = [0] * (n + 1) 
    freq2 = [0] * (m + 1) 
  
  
    # Get the prime factors of n and m 
    primeFactors(n, freq1) 
    primeFactors(m, freq2) 
  
    maxi = 0
  
    # Iterate and find the maximum power 
    i = 2
    while i <= m: 
  
        # If i not a prime factor of n and m 
        if (freq1[i] == 0 and freq2[i] == 0): 
            i = i + 1
            continue
  
        # If i is a prime factor of n and m 
        # If count of i dividing m is more 
        # than i dividing n, then power will be 0 
        if (freq2[i] > freq1[i]): 
            return 0
  
        # If i is a prime factor of M 
        if (freq2[i]): 
  
            # get the maximum power 
            maxi = max(maxi, int(freq1[i] // freq2[i])) 
          
        i = i + 1
      
  
    return maxi 
  
  
# Drivers code 
n = 48
m = 4
print(getMaximumPower(n, m)) 
  
# This code is contributed by Shashank_Sharma 

