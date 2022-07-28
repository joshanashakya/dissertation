

# Python3 implmentation to count the 
# consecutive fibonacci pairs in the array 
from math import sqrt 
  
# Function to find the previous 
# fibonacci for the number N 
def previousFibonacci(n): 
  
    a = n / ((1 + sqrt(5)) / 2.0) 
    return round(a) 
  
# Function to find the next 
# fibonacci number for the number N 
def nextFibonacci(n): 
  
    a = n * (1 + sqrt(5)) / 2.0
    return round(a) 
  
# Function to check that a Number 
# is a perfect square or not 
def isPerfectSquare(x): 
  
    s = sqrt(x) 
    return (s * s == x) 
  
# Function to check that a number 
# is fibonacci number or not 
def isFibonacci(n): 
  
    # N is Fibinacci if one of 
    # (5*n*n + 4) or (5*n*n - 4) 
    # is a perferct square 
    return (isPerfectSquare(5 * n * n + 4) 
            or isPerfectSquare(5 * n * n - 4)) 
  
# Function to count the fibonacci 
# pairs in the array 
def countFibonacciPairs(arr, n): 
  
    res = 0
  
    # Loop to iterate over the array 
    # to choose all pairs of the array 
    for i in range(n): 
        for j in range(i+1,n): 
  
            # Condition to check if both 
            # the number of pair is a 
            # fibonacci number 
            if (isFibonacci(arr[i]) 
                and isFibonacci(arr[j])): 
  
                prevFib = previousFibonacci(arr[i]) 
                nextFib = nextFibonacci(arr[i]) 
  
                # Condition to check if both 
                # the number form consecutive 
                # fibonacci numbers 
                if (prevFib == arr[j] 
                    or nextFib == arr[j]): 
                    res += 1
  
    return res 
  
# Driver Code 
a = [3, 5, 8, 11] 
n = len(a) 
print(countFibonacciPairs(a, n)) 
  
# This code is contributed by mohit kumar 29 

