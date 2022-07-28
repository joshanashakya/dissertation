

# Python 3 implementation to find  
# the sum of all the terms in the 
# nth row of the given series 
from math import pow
  
# function to find the required sum 
def sumOfTermsInNthRow(n): 
      
    # sum = n * (2 * n^2 + 1) 
    sum = n * (2 * pow(n, 2) + 1) 
    return sum
  
# Driver Code 
if __name__ == '__main__': 
    n = 4
    print("Sum of all the terms in nth row =",  
                   int(sumOfTermsInNthRow(n))) 
  
# This code is contributed 
# by Surendra_Gangwar 

