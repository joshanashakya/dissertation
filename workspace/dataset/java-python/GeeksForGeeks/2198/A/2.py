

# Python3 implementation of the approach 
  
# Function to return the smallest n digit  
# number which is a multiple of 5 
def smallestMultiple(n): 
  
    if (n == 1): 
        return 5
    return pow(10, n - 1) 
  
# Driver code 
n = 4
print(smallestMultiple(n)) 

