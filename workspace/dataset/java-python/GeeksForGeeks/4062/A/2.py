

# Python program to find sum of 
# the series. 
import math 
  
def factorial(n): 
    res = 1
    i = 2
    for i in (n+1): 
        res = res * i 
    return res 
      
# Function to calculate required 
# series 
def calculateSeries(n): 
    return (2 + (n * n + n - 2)  
        * math.factorial(n + 1)) 
  
# Driver code 
n = 3
print(calculateSeries(n)) 
  
# This code is contributed by  
# Prateek bajaj 

