

      
# Python implementation of the approach 
  
# Iterative Function to calculate (x^y) in O(log y) 
def power(x, y): 
  
    # Initialize result 
    res = 1; 
  
    while (y > 0): 
  
        # If y is odd, multiply x with result 
        if (y %2== 1): 
            res = (res * x); 
  
        # y must be even now 
        #y = y / 2 
        y = int(y) >> 1; 
        x = (x * x); 
    return res; 
  
  
# Function to return the count  
# of required trees 
def solve(L): 
      
    # number of nodes 
    n = L / 2 + 1; 
  
    ans = power(n, n - 2); 
  
    # Return the result 
    return int(ans); 
  
L = 6; 
print(solve(L)); 
  
# This code has been contributed by 29AjayKumar 

