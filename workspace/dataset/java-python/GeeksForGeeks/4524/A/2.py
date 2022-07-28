

# Python3 implementation to check 
# whether bits are in alternate 
# pattern in the given range 
  
# function to check whether 
# bits are in alternate  
# pattern in the given range 
def bitsAreInAltPatrnInGivenTRange(n, l, r): 
  
    # right shift n by (l - 1) bits 
    num = n >> (l - 1); 
  
    # get the bit at the  
    # last position in 'num' 
    prev = num & 1; 
  
    # right shift 'num' by 1 
    num = num >> 1; 
  
    # loop until there are  
    # bits in the given range 
    for i in range(1,(r - l)): 
  
        # get the bit at the  
        # last position in 'num' 
        curr = num & 1; 
  
        # if true, then bits are  
        # not in alternate pattern 
        if (curr == prev): 
            return False; 
  
        # update 'prev' 
        prev = curr; 
  
        # right shift 'num' by 1 
        num = num >> 1; 
  
    # bits are in alternate  
    # pattern in the given range 
    return True; 
  
# Driver Code 
if __name__ == "__main__": 
    n = 18; 
    l = 1; 
    r = 3; 
  
    if(bitsAreInAltPatrnInGivenTRange(n, l, r)): 
        print("Yes"); 
    else: 
        print("No"); 
  
# This Code is contributed by mits 

