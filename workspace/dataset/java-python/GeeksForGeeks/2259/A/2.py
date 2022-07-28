

# Python3 implementation of the approach 
  
# Function to return smallest even 
# number with n digits 
def smallestOdd(n) : 
  
    if (n == 1): 
        return 1
    return pow(10, n - 1) + 1
  
# Driver Code 
n = 4
print(smallestOdd(n)) 
  
# This code is contributed by ihritik. 

