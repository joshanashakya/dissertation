

# Python3 program to find the N-th  
# term of the series:  
# 5, 10, 17, 26, 37, 50, 65, 82, ...  
  
# from math lib. import everything 
from math import *
  
# calculate Nth term of series  
def nthTerm(n) : 
      
    return pow(n, 2) + 2 * n + 2
      
# Driver code      
if __name__ == "__main__" : 
  
    N = 4
    print(nthTerm(N)) 
  
# This code is contributed by  
# ANKITRAI1 

