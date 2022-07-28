

# Python3 implementation to  
# check whether all the bits 
# are unset in the given  
# range or not 
  
# function to check whether  
# all the bits are unset in 
# the given range or not 
def allBitsSetInTheGivenRange(n, l, r): 
  
    # calculating a number 'num' 
    # having 'r' number of bits  
    # and bits in the range l 
    # to r are the only set bits 
    num = (((1 << r) - 1) ^  
           ((1 << (l - 1)) - 1)) 
  
    # new number which could only  
    # have one or more set bits in  
    # the range l to r and nowhere else 
    new_num = n & num 
  
    # if true, then all bits are  
    # unset in the given range 
    if (new_num == 0): 
        return True
  
    # else all bits are not  
    # unset in the given range 
    return false 
  
# Driver Code 
n = 17
l = 2
r = 4
if (allBitsSetInTheGivenRange(n, l, r)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed  
# by Smitha 

