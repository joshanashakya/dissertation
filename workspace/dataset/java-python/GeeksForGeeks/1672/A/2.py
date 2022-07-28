

# Python 3 Program to find the 
# sum of fifth powers of first 
# n natural numbers 
  
# calculate the sum of fifth  
# power of first n natural  
# numbers 
def fifthPowerSum(n) : 
  
    sm = 0
      
    for i in range(1, n+1) : 
        sm = sm + (i * i * i * i * i) 
      
    return sm 
  
# Driven Program 
n = 6
print(fifthPowerSum(n)) 
  
# This code is contributed  
# by Nikita Tiwari. 

