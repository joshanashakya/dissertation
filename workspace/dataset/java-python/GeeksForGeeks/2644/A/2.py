

# Python Program to find 
# GCD of Fib(M) and Fib(N) 
  
MAX = 1000
   
# Create an array for memoization 
f=[0 for i in range(MAX)] 
   
# Returns n'th Fibonacci 
# number using table f[].  
# Refer method 6 of below 
# post for details. 
# https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/ 
def fib(n): 
  
    # Base cases 
    if (n == 0): 
        return 0
    if (n == 1 or n == 2): 
        f[n] = 1
   
    # If fib(n) is already computed 
    if (f[n]): 
        return f[n] 
   
    k = (n+1)//2 if(n & 1) else n//2
   
    # Applying recursive 
    # formula [Note value n&1 is 1 
    # if n is odd, else 0. 
    f[n] = (fib(k)*fib(k) + fib(k-1)*fib(k-1)) if(n & 1) else ((2*
           fib(k-1) + fib(k))*fib(k)) 
   
    return f[n] 
  
   
# Function to return 
# gcd of a and b 
def gcd(M, N): 
  
    if (M == 0): 
        return N 
    return gcd(N % M, M) 
  
   
# Returns GCD of 
# Fib(M) and Fib(N) 
def findGCDofFibMFibN(M, N): 
  
    return fib(gcd(M, N)) 
  
   
# Driver code 
  
M = 3
N = 12
  
print(findGCDofFibMFibN(M, N)) 
  
# This code is contributed 
# by Anant Agarwal. 

