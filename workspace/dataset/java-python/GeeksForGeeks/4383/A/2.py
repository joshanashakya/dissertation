

# Python3 implementation of the approach 
import math 
  
# Assign roots of the pell's  
# equation to p and q 
p = (1 + math.sqrt(5)) / 2
q = (1 - math.sqrt(5)) / 2
  
# Function to return the  
# nth fibonacci number 
def fib(n): 
    i = n - 1
    x = (p**i - q**i) / (p - q) 
    return int(x) 
  
# Driver code 
n = 5
print(fib(n)) 

