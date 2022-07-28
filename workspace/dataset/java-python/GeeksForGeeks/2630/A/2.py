

# Python3 program to find nth term  
# of the series 5 2 13 41 
from math import pow
  
# function to calculate nth term  
# of the series 
def nthTermOfTheSeries(n): 
      
    # to store the nth term of series 
    # if n is even number 
    if (n % 2 == 0): 
        nthTerm = pow(n - 1, 2) + n 
  
    # if n is odd number 
    else: 
        nthTerm = pow(n + 1, 2) + n 
  
    # return nth term 
    return nthTerm 
  
# Driver code 
if __name__ == '__main__': 
      
    n = 8
    print(int(nthTermOfTheSeries(n))) 
  
    n = 12
    print(int(nthTermOfTheSeries(n))) 
  
    n = 102
    print(int(nthTermOfTheSeries(n))) 
  
    n = 999
    print(int(nthTermOfTheSeries(n))) 
  
    n = 9999
    print(int(nthTermOfTheSeries(n))) 
  
# This code is contributed by 
# Shashank_Sharma 

