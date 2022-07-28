

# Python 3 implementation to check  
# whether bits are in alternate pattern 
# in the given range 
  
# function to check whether rightmost 
# kth bit is set or not in 'n' 
def isKthBitSet(n, k): 
    if((n >> (k - 1)) & 1): 
        return True
    return False
  
# function to set the rightmost kth bit in 'n' 
def setKthBit(n, k): 
      
    # kth bit of n is being set 
    # by this operation 
    return ((1 << (k - 1)) | n) 
  
# function to check if all the bits are set or not 
# in the binary representation of 'n' 
def allBitsAreSet(n): 
      
    # if true, then all bits are set 
    if (((n + 1) & n) == 0): 
        return True
  
    # else all bits are not set 
    return False
  
# function to check if a number 
# has bits in alternate pattern 
def bitsAreInAltOrder(n): 
    num = n ^ (n >> 1) 
  
    # to check if all bits are set 
    # in 'num' 
    return allBitsAreSet(num) 
  
# function to check whether bits are in 
# alternate pattern in the given range 
def bitsAreInAltPatrnInGivenRange(n, l, r): 
      
    # preparing a number 'num' and 'left_shift' 
    # which can be further used for the check 
    # of alternate pattern in the given range 
    if (isKthBitSet(n, r)): 
        num = n 
        left_shift = r 
  
    else: 
        num = setKthBit(n, (r + 1)) 
        left_shift = r + 1
      
    # unset all the bits which are left to the 
    # rth bit of (r+1)th bit 
    num = num & ((1 << left_shift) - 1) 
  
    # right shift 'num' by (l-1) bits 
    num = num >> (l - 1) 
  
    return bitsAreInAltOrder(num) 
  
# Driver Code 
if __name__ == '__main__': 
    n = 18
    l = 1
    r = 3
    if (bitsAreInAltPatrnInGivenRange(n, l, r)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

