

# Python3 implementation of the approach  
  
# Function that return true if n  
# can be represented as the sum  
# of powers of 2 without using 2^0 
def isSumOfPowersOfTwo(n): 
    if n % 2 == 1: 
        return False
    else: 
        return True
  
# Driver code 
n = 10
if isSumOfPowersOfTwo(n): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Shrikant13 

