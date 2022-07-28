

# Python 3 implementation to check whether  
# all the bits in the given range of two  
# numbers are complement of each other 
  
# function to check whether all the bits 
# are set in the given range or not 
def allBitsSetInTheGivenRange(n, l, r): 
      
    # calculating a number 'num' having 'r' 
    # number of bits and bits in the range l 
    # to r are the only set bits 
    num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1) 
  
    # new number which will only have one  
    # or more set bits in the range l to r 
    # and nowhere else 
    new_num = n & num 
  
    # if both are equal, then all bits  
    # are set in the given range 
    if (num == new_num): 
        return True
  
    # else all bits are not set 
    return False
  
# function to check whether all the bits  
# in the given range of two numbers are  
# complement of each other 
def bitsAreComplement(a, b, l, r): 
    xor_value = a ^ b 
    return allBitsSetInTheGivenRange(xor_value, l, r) 
  
# Driver Code 
if __name__ == "__main__": 
      
    a = 10
    b = 5
    l = 1
    r = 3
  
    if (bitsAreComplement(a, b, l, r)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by ita_c 

