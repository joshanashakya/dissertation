

# Python Program to find sum of series 
# 1^2 + 3^2 + 5^2 + . . . + (2*n - 1)^2. 
  
import math 
  
# Function to find sum of series. 
def sumOfSeries(n): 
  
   # Formula to find sum of series. 
    return int((n * (2 * n - 1) * (2 * n + 1)) / 3) 
   
# driver code 
n=10
print(sumOfSeries(n)) 
  
# This code is contributed by Gitanjali. 

