

# Python Program to find sum of series 
# 1^2 + 3^2 + 5^2 + . . . + (2*n - 1)^2. 
  
import math 
  
# Function to find sum of series. 
def sumOfSeries(n): 
  
    sum = 0
    for i in range(1,n+1): 
        sum = sum + (2 * i - 1) * (2 * i - 1) 
    return sum
      
# driver code 
n= 10
print(sumOfSeries(n)) 
  
# This code is contributed by Gitanjali. 

