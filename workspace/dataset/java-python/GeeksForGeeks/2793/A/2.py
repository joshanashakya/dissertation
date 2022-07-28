

# Python 3 program of finding 
# modulo multiplication 
  
# Returns (a * b) % mod 
def moduloMultiplication(a, b, mod): 
  
    res = 0; # Initialize result 
  
    # Update a if it is more than 
    # or equal to mod 
    a = a % mod; 
  
    while (b): 
      
        # If b is odd, add a with result 
        if (b & 1): 
            res = (res + a) % mod; 
              
        # Here we assume that doing 2*a 
        # doesn't cause overflow 
        a = (2 * a) % mod; 
  
        b >>= 1; # b = b / 2 
      
    return res; 
  
# Driver Code 
a = 10123465234878998; 
b = 65746311545646431; 
m = 10005412336548794; 
print(moduloMultiplication(a, b, m)); 
      
# This code is contributed 
# by Shivi_Aggarwal 

