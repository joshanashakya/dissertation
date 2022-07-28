

# Python3 implementation of the approach 
  
# Function to return the required XOR 
def computeXOR(n) : 
  
    # Modulus operator are expensive 
    # on most of the computers. 
    # n & 3 will be equivalent to n % 4 
    # n % 4 
    switch = {  
  
        # If n is a multiple of 4 
        0 : n, 
  
        # If n % 4 gives remainder 1 
        1 : 1, 
  
        # If n % 4 gives remainder 2 
        2: n + 1, 
  
        # If n % 4 gives remainder 3 
        3 : 0, 
    } 
    return switch.get( n & 3, "") 
  
# Driver code 
l = 1
r = 4
print(computeXOR(r) ^ computeXOR(l - 1)) 
  
# This code is contributed by ihritik 

