

# Python3 program to find the N-th  
# term of the series:  
# 0, 4, 14, 30, 51, 80, 114, 154, 200, … 
  
# from math lib. import everything 
from math import *
  
# calculate Nth term of series  
def nthTerm(n) : 
      
    return pow(n, 2) - 2 * n + 2
  
          
# Driver code      
if __name__ == "__main__" : 
  
    N = 4
    print(nthTerm(N)) 
  
# This code is contributed by  
# ANKITRAI1 

