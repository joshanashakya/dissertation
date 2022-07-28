

# Python program to check if given 
# number is power of 2 or not  
  
# Function to check if x is power of 2 
def isPowerOfTwo (x): 
  
    # First x in the below expression  
    # is for the case when x is 0  
    return (x and (not(x & (x - 1))) ) 
  
# Driver code 
if(isPowerOfTwo(31)): 
    print('Yes') 
else: 
    print('No') 
      
if(isPowerOfTwo(64)): 
    print('Yes') 
else: 
    print('No') 
      
# This code is contributed by Danish Raza     

