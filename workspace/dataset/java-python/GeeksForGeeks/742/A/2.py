

# Python3 implementation to find the 
# sum of all non-fibonacci numbers 
# in a range from L to R 
from math import sqrt 
  
# Array to precompute the sum of 
# non-fibonacci numbers 
pref = [0]*100010
  
# Function to find if a number 
# is a perfect square 
def isPerfectSquare(x): 
      
    s = int(sqrt(x)) 
    if (s * s == x): 
        return True
    return False
  
# Function that returns N 
# if N is non-fibonacci number 
def isNonFibonacci(n): 
      
    # N is Fibinacci if one of 
    # 5*n*n + 4 or 5*n*n - 4 or both 
    # are perferct square 
    x = 5 * n * n 
    if (isPerfectSquare(x + 4) or isPerfectSquare(x - 4)): 
        return 0
    else: 
        return n 
  
# Function to precompute sum of 
# non-fibonacci Numbers 
def compute(): 
      
    for i in range(1,100001): 
        pref[i] = pref[i - 1] + isNonFibonacci(i) 
      
# Function to find the sum of all 
# non-fibonacci numbers in a range 
def printSum(L, R): 
      
    sum = pref[R] - pref[L-1] 
    print(sum, end=" ") 
  
# Driver Code 
# Pre-computation 
compute() 
  
Q = 2
arr = [[1, 5],[6, 10]] 
# Loop to find the sum for 
# each query 
  
for i in range(Q): 
    printSum(arr[i][0], arr[i][1]) 
  
# This code is contributed by shubhamsingh10 

