

# Python implementation of the approach 
  
# Function to return length 
# of the resulatant number 
def numLen(K): 
  
    # If K is a multiple of 2 or 5 
    if (K % 2 == 0 or K % 5 == 0): 
        return -1; 
  
    number = 0; 
  
    len = 1; 
  
    for len in range(1,K+1): 
  
        # Generate all possible numbers 
        # 1, 11, 111, 111, ..., K 1's 
        number = number * 10 + 1; 
  
        # If number is divisible by k 
        # then return the length 
        if ((number % K == 0)): 
            return len; 
  
    return -1; 
  
# Driver code 
K = 7; 
print(numLen(K)); 
  
# This code contributed by Rajput-Ji 

