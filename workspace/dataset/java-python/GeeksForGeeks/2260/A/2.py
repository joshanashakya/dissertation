

# Python3 implementation of  
# the approach 
  
# Function to return smallest  
# even number with n digits 
def smallestEven(n) : 
  
    if (n == 1): 
        return 0
    return pow(10, n - 1) 
  
# Driver Code 
n = 4
print(smallestEven(n)) 
  
# This code is contributed  
# by ihritik. 

