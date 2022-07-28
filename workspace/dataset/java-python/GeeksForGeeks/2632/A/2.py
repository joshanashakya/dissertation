

# Python3 Program to find Nth term 
import math 
  
# Function that will return nth term 
def getValue(n): 
  
    # Find log of n+1 on base 2 
    result = int(math.floor(math.log(n + 1) / 
                            math.log(2))) 
    return int(math.pow(2, result)) 
  
# Driver code 
n = 9
print(getValue(n)) 
  
n = 1025
print(getValue(n)) 
  
# This code is contributed  
# by Shrikant13  

