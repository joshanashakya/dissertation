

# Python3 implementation of the approach 
  
# Function to return the integer formed 
# by taking the rightmost set bit in n 
def firstSetBit(n): 
  
    # n & (n - 1) unsets the first set 
    # bit from the right in n 
    x = n & (n - 1) 
  
    # Take xor with the original number 
    # The position of the 'changed bit' 
    # will be set and rest will be unset 
    return (n ^ x) 
  
# Driver code 
n = 12
  
print(firstSetBit(n)) 
  
# This code is contributed by mohit kumar 29 

