

# Python3 implementation of the approach 
  
# Function to return the minimum 
# operations required 
def minOperations(x, y, p, q): 
  
    # Not possible 
    if (y % x != 0): 
        return -1
  
    d = y // x 
  
    # To store the greatest power 
    # of p that divides d 
    a = 0
  
    # While divible by p 
    while (d % p == 0): 
        d //= p 
        a+=1
  
    # To store the greatest power 
    # of q that divides d 
    b = 0
  
    # While divible by q 
    while (d % q == 0): 
        d //= q 
        b+=1
  
    # If d > 1 
    if (d != 1): 
        return -1
  
    # Since, d = p^a * q^b 
    return (a + b) 
  
  
# Driver code 
  
x = 12
y = 2592
p = 2
q = 3
  
print(minOperations(x, y, p, q)) 
  
# This code is contributed by mohit kumar 29 

