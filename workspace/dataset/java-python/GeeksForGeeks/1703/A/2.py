

# Python code to check 
# if a number is multiple of 
# 5 without using / and % 
  
def isMultipleof5(n): 
      
    # If n is a multiple of 5 then we 
    # make sure that last digit of n is 0  
    if ( (n & 1) == 1 ): 
        n <<= 1; 
  
    x = n 
    x = ( (int)(x * 0.1) ) * 10
      
    # If last digit of n is 0 
    # then n will be equal to x 
    if ( x == n ): 
        return 1
  
    return 0
      
# Driver Code 
i = 19
if ( isMultipleof5(i) == 1 ): 
    print (i, "is multiple of 5") 
else: 
    print (i, "is not a multiple of 5") 
  
# This code is contributed 
# by Sumit Sudhakar 

