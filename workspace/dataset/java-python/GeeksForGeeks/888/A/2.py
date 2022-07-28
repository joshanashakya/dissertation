

# Python3 program to find if a number 
# is power of d where d is power of 2. 
  
def Log2n(n): 
    return (1 + Log2n(n / 2)) if (n > 1) else 0; 
  
def isPowerOfd(n, d): 
    count = 0; 
      
    # Check if there is only  
    # one bit set in n 
      
    if (n and (n & (n - 1))==0): 
        # count 0 bits  
        # before set bit  
        while (n > 1): 
            n >>= 1; 
            count += 1; 
        # If count is a multiple of log2(d)  
        # then return true else false  
        return (count%(Log2n(d)) == 0); 
  
    # If there are more than 1 bit set 
    # then n is not a power of 4 
    return False; 
  
# Driver Code 
n = 64; 
d = 8; 
if (isPowerOfd(n, d)): 
    print(n,"is a power of",d); 
else: 
    print(n,"is not a power of",d); 
  
# This code is contributed by mits 

