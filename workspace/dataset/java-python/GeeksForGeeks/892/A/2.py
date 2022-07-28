

# Python program to 
# check if a number can be 
# raised to k 
  
def isPowerOfK(n, k): 
  
    # loop to change base 
    # n to base = k 
    oneSeen = False
    while (n > 0): 
   
        # Find current digit in base k 
        digit = n % k 
   
        # If digit is neither 0 nor 1  
        if (digit > 1): 
            return False
   
        # Make sure that only one 1 
        # is present.  
        if (digit == 1): 
          
            if (oneSeen): 
                return False
            oneSeen = True
   
        n //= k 
      
    return True
      
# Driver code 
  
n = 64
k = 4
   
if (isPowerOfK(n , k)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Anant Agarwal. 

