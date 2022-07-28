

# Python 3 Program to find LCM of  
# Fib(a) and Fib(b) 
MAX = 1000
  
# Create an array for memoization 
f = [0] * MAX
  
# Function to return the n'th  
# Fibonacci number using table f[]. 
def fib(n): 
  
    # Base cases 
    if (n == 0): 
        return 0
    if (n == 1 or n == 2): 
        f[n] = 1
        return f[n] 
  
    # If fib(n) is already computed 
    if (f[n]): 
        return f[n] 
  
    k = (n + 1) // 2 if (n & 1) else n // 2
  
    # Applying recursive formula 
    # Note value n&1 is 1 
    # if n is odd, else 0. 
    if (n & 1): 
        f[n] = (fib(k) * fib(k) + 
                fib(k - 1) * fib(k - 1)) 
    else: 
        f[n] = (2 * fib(k - 1) + fib(k)) * fib(k) 
  
    return f[n] 
  
# Function to return gcd of a and b 
def gcd(a, b): 
    if (a == 0): 
        return b 
  
    return gcd(b % a, a) 
  
# Function to return the LCM of 
# Fib(a) and Fib(a) 
def findLCMFibonacci(a, b): 
  
    return (fib(a) * fib(b)) // fib(gcd(a, b)) 
  
# Driver code 
if __name__ == "__main__": 
    a = 3
    b = 12
  
    print (findLCMFibonacci(a, b)) 
  
# This code is contributed by ita_c 

