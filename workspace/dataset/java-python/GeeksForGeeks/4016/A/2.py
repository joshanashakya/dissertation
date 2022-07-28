

# Python3 implementation of the approach 
  
# Function to return the factorial 
# of a number 
def factorial(f): 
    fact = 1
    for i in range(2, f + 1): 
        fact *= i 
    return fact 
  
# Function to return the count of distinct 
# (N + M) digit numbers having N 0's 
# and and M 1's with no leading zeros 
def findPermuatation(N, M): 
    permutation = (factorial(N + M - 1) // 
                  (factorial(N) * factorial(M - 1))) 
    return permutation 
  
# Driver code 
N = 3; M = 3
print(findPermuatation(N, M)) 
  
# This code is contributed  
# by Shrikant13 

