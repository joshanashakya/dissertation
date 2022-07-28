

# Python3 program to  
# find the sum of 
# the series 1+11+111+1111+.... 
import math 
  
# Function for  
# finding summation 
def summation(n): 
    return int((pow(10, n + 1) - 
                    10 - (9 * n)) / 81); 
  
# Driver Code 
print(summation(5)); 
  
# This code is contributed 
# by mits. 

