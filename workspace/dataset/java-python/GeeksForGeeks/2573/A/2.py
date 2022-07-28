

# Python 3 implementation to find the 
# count of numbers those are  
# powers of K in range L to R 
import sys 
from math import pow,ceil,floor 
import random 
  
# Function to find the  
# Nth root of the number 
def nthRoot(A,N): 
  
    # intially guessing a random  
    # number between 0 to 9 
    xPre = (random.randint(0, 9))%10
  
    # Smaller eps, 
    # denotes more accuracy 
    eps = 1e-3
  
    # Initializing difference between two 
    # roots by INT_MAX 
    delX = sys.maxsize 
  
    # xK denotes  
    # current value of x 
  
    # loo3p untill we reach desired accuracy 
    while (delX > eps): 
          
        # calculating current value 
        # from previous value 
        xK = ((N - 1.0) * xPre + A / pow(xPre, N - 1))/ N 
        delX = abs(xK - xPre) 
        xPre = xK 
    return xK 
  
# Function to count the perfect 
# powers of K in range L to R 
def countPowers(a, b, k): 
    return (floor(nthRoot(b, k)) - ceil(nthRoot(a, k)) + 1) 
  
# Driver code 
if __name__ == '__main__': 
    a = 7
    b = 28
    k = 2
    print("Count of Powers is",countPowers(a, b, k)) 
      
# This code is contributed by Surendra_Gangwar 

