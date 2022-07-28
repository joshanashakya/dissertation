

# Python 3 program to find sum  
# of first n terms 
from math import pow
  
def calculateSum(n): 
      
    # Sum = n*(n^2 + 3*n + 5)/3 
    return n * (pow(n, 2) + 3 * n + 5) / 3
  
if __name__ == '__main__': 
      
    # number of terms to be included 
    # in the sum 
    n = 3
  
    # find the Sum 
    print("Sum =", int(calculateSum(n))) 
  
# This code is contributed by 
# Sanjit_Prasad 

