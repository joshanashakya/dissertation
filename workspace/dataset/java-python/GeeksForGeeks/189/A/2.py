

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function to check if a 
# number is perfect square 
def isPerfectSquare(x): 
    s = sqrt(x) 
    return (s * s == x) 
  
# Function to check if a 
# number is Fibinacci Number 
def isFibonacci(N): 
  
    # N is Fibinacci if either 
    # (5*N*N + 4), (5*N*N - 4) or both 
    # is a perferct square 
    return isPerfectSquare(5 * N * N + 4) or \ 
            isPerfectSquare(5 * N * N - 4) 
  
# Function to find 
# the next Non-Fibinacci Number 
def nextNonFibonacci(N): 
      
    # Case 1 
    # If N<=3, then 4 will be 
    # next Non-Fibinacci Number 
    if (N <= 3): 
        return 4
  
    # Case 2 
    # If N+1 is Fibinacci, then N+2 
    # will be next Non-Fibinacci Number 
    if (isFibonacci(N + 1)): 
        return N + 2
  
    # If N+1 is Non-Fibinacci, then N+2 
    # will be next Non-Fibinacci Number 
    else: 
        return N  
  
# Driver code 
if __name__ == '__main__': 
    N = 3
    print(nextNonFibonacci(N)) 
    N = 4
    print(nextNonFibonacci(N)) 
  
    N = 7
    print(nextNonFibonacci(N)) 
      
# This code is contributed by Surendra_Gangwar 

