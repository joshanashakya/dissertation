

# Python program to Find the 
# GCD of N Fibonacci Numbers  
# with given Indices  
from math import *
  
# Function to return n'th  
# Fibonacci number  
def getFib(n) : 
  
    # Declare an array to store  
    # Fibonacci numbers. 
    f = [0] * (n + 2) # 1 extra to handle case, n = 0  
  
    # 0th and 1st number of the  
    # series are 0 and 1  
    f[0], f[1] = 0, 1
  
    # Add the previous 2 numbers  
    # in the series and store it  
    for i in range(2, n + 1) : 
  
        f[i] = f[i - 1] + f[i - 2] 
  
    return f[n] 
  
# Function to Find the GCD of N Fibonacci  
# Numbers with given Indices 
def find(arr, n) : 
  
    gcd_1 = 0
  
    # find the gcd of the indices  
    for i in range(n) : 
        gcd_1 = gcd(gcd_1, arr[i]) 
  
    # find the fibonacci number  
    # at index gcd_1  
    return getFib(gcd_1) 
  
# Driver code      
if __name__ == "__main__" : 
  
    indices = [3, 6, 9] 
    N = len(indices) 
  
    print(find(indices, N)) 
  
# This code is contributed by ANKITRAI1 

