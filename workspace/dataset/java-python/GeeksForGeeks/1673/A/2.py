

# Python 3 Program to find the  
# sum of fifth power of first  
# n natural numbers 
  
# Calculate the sum of fifth  
# power of first n natural  
# numbers 
def fifthPowerSum(n) : 
    return ((2 * n * n * n * n * n * n) +
            (6 * n * n * n * n * n) +
            (5 * n * n * n * n) -
            (n * n)) // 12
  
  
# Driven Program 
n = 5
print(fifthPowerSum(n)) 
  
# This code is contributed by Nikita Tiwari. 

