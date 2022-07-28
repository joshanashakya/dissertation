

# Python3 implementation of the approach 
p = 1000000007
  
# Modulo exponentiation function 
def power(x, y): 
      
    # Function to calculate (x^y)%p in O(log(y)) 
    res = 1
    x = x % p 
  
    while (y > 0): 
        if (y & 1): 
            res = (res * x) % p; 
        y = y >> 1
        x = (x * x) % p 
  
    return res % p 
  
# Driver Code 
n = 3
  
# Evaluating ((3^n-2^(n+1)+1)/2)%p 
x = (power(3, n) % p + 1) % p 
  
x = (x - power(2, n + 1) + p) % p 
  
# From Fermats’s little theorem 
# a^-1 ? a^(m-2) (mod m) 
x = (x * power(2, p - 2)) % p 
  
print(x) 
  
# This code is contributed by Mohit Kumar 

