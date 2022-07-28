

# Python3 implementation of the approach 
mod = 10**9 + 7
  
# Function to return (2^P % mod) 
def power(p): 
  
    res = 1
    for i in range(1, p + 1): 
        res *= 2
        res %= mod 
  
    return res % mod 
  
# Function to return the sum of 
# squares of subsets 
def subset_square_sum(A): 
  
    n = len(A) 
  
    ans = 0
  
    # Squaring the elements 
    # and adding it to ans 
    for i in A: 
        ans += i * i % mod 
        ans %= mod 
  
    return ans * power(n - 1) % mod 
  
# Driver code 
A = [3, 7] 
  
print(subset_square_sum(A)) 
  
# This code is contributed by Mohit Kumar 

