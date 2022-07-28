

# Python3 implementation of the approach 
  
# Function to return the minimum  
# value K such that K % p = 0  
# and q % k = 0 
def getMinVal(p, q): 
  
    # If K is possible 
    if q % p == 0: 
        return p 
  
    # No such K is possible 
    return -1
  
# Driver code 
p = 24; q = 48
print(getMinVal(p, q)) 
  
# This code is contributed 
# by Shrikant13 

