

# Python 3 program for finding the sum  
# of first N terms of the series.  
  
# from math import everything 
from math import *
  
# CalculateSum function returns the final sum  
def calculateSum(n) : 
  
    # r1 and r2 are common ratios  
    # of 1st and 2nd series  
    r1, r2 = 2, 3
  
    # a1 and a2 are common first terms  
    # of 1st and 2nd series  
    a1, a2 = 1, 1
  
    return (a1 * (pow(r1, n) - 1) // (r1 - 1)  
           + a2 * (pow(r2, n) - 1) // (r2 - 1)) 
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 4
  
    # function calling for 4 terms 
    print("SUM = ",calculateSum(n)) 
  
  
# This code is contributed by ANKITRAI1 

