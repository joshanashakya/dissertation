

# Simple Python3 Program to 
# print Fibonacci sequence 
# using 2 variables 
  
def fib(n): 
    a = 0
    b = 1
    if (n >= 0): 
        print(a, end=' ') 
    if (n >= 1): 
        print(b, end=' ') 
    for i in range(2, n+1): 
        print(a + b, end=' ') 
        b = a + b 
        a = b - a 
  
# Driver code 
fib(9) 
  
# This code is contributed by 
# Prasad Kshirsagar 

