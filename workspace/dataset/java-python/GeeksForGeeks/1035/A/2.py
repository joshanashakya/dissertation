

# Python3 implementation of above approach 
  
from math import sqrt, ceil, floor 
  
# Function to find primes 
def isPrime(n): 
      
    # Corner cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
  
    for i in range(5, ceil(sqrt(n)), 6): 
        if (n % i == 0 or n % (i + 2) == 0): 
            return False
  
    return True
  
# Function to find factors 
def factors(N, v): 
    for i in range(2, N): 
  
        # run a loop upto square root of that number 
        for j in range(1,ceil(sqrt(i)) + 1): 
            if (i % j == 0): 
  
                # if the n is perfect square 
                if (i // j == j): 
                    v[i].append(j) 
  
                # otherwise push it's two divisors 
                else: 
                    v[i].append(j) 
                    v[i].append(i // j) 
  
        # sort the divisors 
        v = sorted(v) 
  
# Function to find max product 
def product(n): 
      
    # To store factors of 'n' 
    v = [[]] * (n + 100) 
  
    # find factors 
    factors(n + 100, v) 
  
    # if it is divisible by 4. 
    if (n % 4 == 0): 
        x = n // 4
        x *= x 
        return x * x 
  
    else : 
  
        # if it is prime 
        if (isPrime[n]): 
            return -1
  
        # otherwise answer will be possible 
        else : 
            ans = -1
            if (len(v[n]) > 2): 
  
                # include last third factor 
                fac = v[n][len(v[n]) - 3] 
  
                # nested loop to find other two factors 
                for i in range(len(v[n] - 1), -1, -1): 
                    for j in range(len(v[n] - 1), -1, -1): 
                        if ((fac * 2) + (v[n][j] + v[n][i]) == n): 
                            ans = max(ans, fac * fac * v[n][j] * v[n][i]) 
  
                return ans 
  
# Driver code 
n = 24
  
# function call 
print(product(n)) 
  
# This code is contributed by mohit kumar 29 

