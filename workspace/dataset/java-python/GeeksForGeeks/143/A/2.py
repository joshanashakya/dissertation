

# Python3 implementation of the approach 
N = 100005
mod = (10 ** 9 + 7) 
  
# To store the factorial and the 
# factorial mod inverse of a number 
factorial = [0]*N 
modinverse = [0]*N 
  
# Function to find factorial 
# of all the numbers 
def factorialfun(): 
    factorial[0] = 1
    for i in range(1, N): 
        factorial[i] = (factorial[i - 1] * i)%mod 
  
# Function to find the factorial 
# mod inverse of all the numbers 
def modinversefun(): 
    modinverse[N - 1] = pow(factorial[N - 1],  
                            mod - 2, mod) % mod 
  
    for i in range(N - 2, -1, -1): 
        modinverse[i] = (modinverse[i + 1]* (i + 1))% mod 
  
# Function to return nCr 
def binomial(n, r): 
    if (r > n): 
        return 0
  
    a = (factorial[n]* modinverse[n - r])% mod 
  
    a = (a * modinverse[r]) % mod 
    return a 
  
# Function to find sum of f(s) for all 
# the chosen sets from the given array 
def max_min(a, n, k): 
  
    # Sort the given array 
    a = sorted(a) 
  
    # Calculate the factorial and 
    # modinverse of all elements 
    factorialfun() 
    modinversefun() 
  
    ans = 0
    k -= 1
  
    # For all the possible sets 
    # Calculate max(S) and min(S) 
    for i in range(n): 
        x = n - i - 1
        if (x >= k): 
            ans -= (binomial(x, k) * a[i]) % mod 
  
        y = i 
        if (y >= k): 
            ans += (binomial(y, k) * a[i]) % mod 
  
        ans = (ans + mod) % mod 
  
    return ans 
  
# Driver code 
  
a = [1, 1, 3, 4] 
k = 2
n = len(a) 
  
print(max_min(a, n, k)) 
  
# This code is contributed by mohit kumar 29 

