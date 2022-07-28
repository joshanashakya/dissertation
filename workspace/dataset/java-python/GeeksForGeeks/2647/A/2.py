

# Python3 implementation of the approach 
import math 
  
# Function to return the nth  
# Fibonacci number 
def fib(n): 
  
    phi = (1 + math.sqrt(5)) / 2; 
    return int(round(pow(phi, n) / 
                         math.sqrt(5))); 
  
# Function to return the required sum 
def calculateSum(l, r): 
  
    # Using our deduced result 
    sum = fib(r + 2) - fib(l + 1); 
    return sum; 
  
# Driver code 
l = 4;  
r = 8; 
print(calculateSum(l, r)); 
  
# This code is contributed by mits 

