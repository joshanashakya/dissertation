

# Python3 program for  
# computing x^x^x^x.. %m 
import math 
  
# Function to compute 
# the given value 
def calculate(x, k, m): 
    result = x; 
    k = k - 1; 
      
    # compute power k times 
    while (k): 
        result = math.pow(result, x); 
        if (result > m): 
            result = result % m; 
        k = k - 1; 
    return int(result); 
  
# Driver Code 
x = 5; 
k = 2; 
m = 3; 
  
# Calling function 
print(calculate(x, k, m)); 
      
# This code is contributed  
# by mits 

