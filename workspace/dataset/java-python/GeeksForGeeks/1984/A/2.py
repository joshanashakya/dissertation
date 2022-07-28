

# Python3 implementation of the approach 
# Function to return the required number 
def getMinNum(a, b, c): 
  
    # If doesn't belong to the range 
    # then c is the required number 
    if (c < a or c > b): 
        return c 
  
    # Else get the next multiple of c 
    # starting from b + 1 
    x = ((b // c) * c) + c 
  
    return x 
  
# Driver code 
a, b, c = 2, 4, 4
print(getMinNum(a, b, c)) 
  
# This code is contributed by 
# Mohit kumar 29 

