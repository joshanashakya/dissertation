

# Log based Python program to count number of 
# digits in a number 
  
# function to import ceil and log  
import math 
  
def countDigit(n): 
    return math.floor(math.log(n, 10)+1) 
  
# Driver Code 
n = 345289467
print ("Number of digits : % d"%(countDigit(n))) 
  
# This code is contributed by Shreyanshi Arun 

