

# Python3 code to find  
# sum of series 
# 2, 22, 222, .. 
import math 
  
# function which return  
# the sum of series 
def sumOfSeries( n ): 
    return 0.0246 * (math.pow(10, n) - 1 - (9 * n)) 
      
# driver code 
n = 3
print( sumOfSeries(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

