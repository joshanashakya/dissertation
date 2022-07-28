

# Python3 implementation of the approach 
  
# Function to return the maximum bitwise AND 
# possible among all the possible pairs 
def maxAND(L, R): 
  
    # If there is only a single value 
    # in the range [L, R] 
    if (L == R): 
        return L; 
  
    # If there are only two values 
    # in the range [L, R] 
    elif ((R - L) == 1): 
        return (R & L); 
    else: 
        if (((R - 1) & R) > 
            ((R - 2) & (R - 1))): 
            return ((R - 1) & R); 
        else: 
            return ((R - 2) & (R - 1)); 
  
# Driver code 
L = 1; 
R = 632; 
print(maxAND(L, R)); 
  
# This code contributed by PrinciRaj1992  

