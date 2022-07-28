

      
# Python implementation of the approach 
   
# Iterative Function to calculate (x^y)%p in O(log y) 
def power(x, y, p): 
   
    # Initialize result 
    res = 1; 
   
    # Update x if it is >= p 
    x = x % p; 
   
    while (y > 0): 
   
        # If y is odd, multiply x with result 
        if (y %2== 1): 
            res = (res * x) % p; 
   
        # Y must be even now 
        y = y >> 1; # y = y/2 
        x = (x * x) % p; 
    return res; 
   
# Driver Code 
L = 2; P = pow(10, 9); 
ans = power(325, L, P); 
print(ans); 
  
  
#  This code contributed by Rajput-Ji 

