

# Optimized Python3 Program to find last  
# digit of nth Fibonacci number 
  
# Finds nth fibonacci number 
def fib(f, n): 
  
    # 0th and 1st number of 
    # the series are 0 and 1 
    f[0] = 0; 
    f[1] = 1; 
  
    # Add the previous 2 numbers  
    # in the series and store  
    # last digit of result 
    for i in range(2, n + 1): 
        f[i] = (f[i - 1] + f[i - 2]) % 10; 
  
    return f; 
  
# Returns last digit of n'th  
# Fibonacci Number 
def findLastDigit(n): 
    f = [0] * 61; 
  
    # Precomputing units digit of  
    # first 60 Fibonacci numbers 
    f = fib(f, 60); 
  
    return f[n % 60]; 
  
# Driver code 
n = 1; 
print(findLastDigit(n)); 
n = 61; 
print(findLastDigit(n)); 
n = 7; 
print(findLastDigit(n)); 
n = 67; 
print(findLastDigit(n)); 
  
# This code is contributed  
# by chandan_jnu 

