

# Python 3 Program to find the 
# sum of fourth powers of 
# first n odd natural numbers 
  
# calculate the sum of  
# fourth power of first   
# n odd natural numbers 
def oddNumSum(n) : 
    j = 0
    sm = 0
    for i in range(1, n + 1) : 
        j = (2 * i - 1) 
        sm = sm + (j * j * j * j) 
      
    return sm 
      
# Driven Program 
n = 6; 
print(oddNumSum(n)) 
  
  
# This code is contributed  
# by Nikita tiwari. 

