

# Python program to find sum of  
# the series. 
  
def factorial(n): 
    res = 1
    for i in range(2, n+1): 
        res = res * i 
    return res 
  
# Function to calculate required 
# series 
def calculateSeries(n): 
    return factorial(n + 1) - 1
  
# Drivers code 
n = 3
print(calculateSeries(n)) 
  
# This code is contributed by  
# Ansu Kumari. 

