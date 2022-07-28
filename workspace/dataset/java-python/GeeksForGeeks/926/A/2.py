

mod = 1000000007; 
  
# Iterative function to compute modular power 
def modularexpo(x, y, p): 
  
    # Initialize result 
    res = 1;  
      
    # Update x if it is more than or 
    # equal to p 
    x = x % p;  
  
    while (y > 0):  
          
        # If y is odd, multiply x with result 
        if (y & 1): 
            res = (res * x) % p; 
  
        # y must be even now 
        y = y >> 1;  
        x = (x * x) % p; 
      
    return res; 
  
# Helper function that multiplies 2 matrices 
# F and M of size 2*2, and puts the 
# multiplication result back to F[][] 
def multiply(F, M, m): 
  
    x = ((F[0][0] * M[0][0]) % m +
         (F[0][1] * M[1][0]) % m) % m; 
  
    y = ((F[0][0] * M[0][1]) % m +
         (F[0][1] * M[1][1]) % m) % m; 
  
    z = ((F[1][0] * M[0][0]) % m +
         (F[1][1] * M[1][0]) % m) % m; 
  
    w = ((F[1][0] * M[0][1]) % m +
         (F[1][1] * M[1][1]) % m) % m; 
  
    F[0][0] = x; 
    F[0][1] = y; 
    F[1][0] = z; 
    F[1][1] = w; 
  
# Helper function that calculates F[][] raise to  
# the power n and puts the result in F[][]  
# Note that this function is designed only for fib()  
# and won't work as general power function  
def power(F, n, m): 
  
    if (n == 0 or n == 1): 
        return; 
    M = [[ 1, 1 ], [ 1, 0 ]]; 
  
    power(F, n // 2, m); 
    multiply(F, F, m); 
  
    if (n % 2 != 0): 
        multiply(F, M, m); 
  
# Function that returns nth Fibonacci number  
def fib(n, m): 
  
    F = [[ 1, 1 ], [ 1, 0 ]]; 
    if (n == 0): 
        return 0; 
    power(F, n - 1, m); 
    return F[0][0]; 
  
# Driver Code 
if __name__ == '__main__': 
    n = 4; 
    base = fib(n, mod) % mod; 
    expo = fib(n, mod - 1) % (mod - 1); 
    result = modularexpo(base, expo, mod) % mod; 
    print(result); 
  
# This code is contributed by 29AjayKumar 

