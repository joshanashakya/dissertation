

# Python3 code Program to   
# check a pentagonal number 
  
# Import math library 
import math as m 
  
# Function to determine if 
# N is pentagonal or not 
def isPentagonal( n ): 
      
    # Get positive root of 
    # equation P(n) = N. 
    n = (1 + m.sqrt(24 * N + 1)) / 6
      
  
    # Check if n is an integral 
    # value of not. To get the 
    # floor of n, type cast to int 
    return( (n - int (n)) == 0) 
  
# Driver Code 
N = 19
  
if (isPentagonal(N)): 
    print ( N, " is pentagonal " )  
else: 
    print ( N, " is not pentagonal" )  
  
# This code is contributed by 'saloni1297' 

