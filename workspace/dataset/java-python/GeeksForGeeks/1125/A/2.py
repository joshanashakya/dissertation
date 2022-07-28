

   
# Python3 program to find  
# quotient of arrayelements 
import math 
  
# Function to calculate the quotient 
# of every element of the array 
def calculate(a, b, n, m): 
          
    mul = 1
  
    # Calculate the product  
    # of all elements 
    for i in range(m): 
        if (b[i] != 0): 
            mul = mul * b[i] 
  
    # To calculate the quotient  
    # of every array element 
    for i in range(n): 
        x = math.floor(a[i] / mul) 
        print(x, end = " ") 
          
  
# Driver code 
a = [ 5, 100, 8 ] 
b = [ 2, 3 ] 
n = len(a) 
m = len(b) 
          
calculate(a, b, n, m) 
  
# This code is contributed by Anant Agarwal. 

