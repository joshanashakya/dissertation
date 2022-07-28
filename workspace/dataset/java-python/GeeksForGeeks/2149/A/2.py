

# Python3 implementation of  
# decimal to binary conversion 
# without using arithmetic operators 
  
# function for decimal to  
# binary conversion without  
# using arithmetic operators 
def decToBin(n): 
    if(n == 0): 
        return "0"; 
          
    # to store the binary 
    # equivalent of decimal 
    bin = ""; 
      
    while (n > 0): 
          
        # to get the last binary 
        # digit of the number 'n' 
        # and accumulate it at  
        # the beginning of 'bin' 
        if (n & 1 == 0): 
            bin = '0' + bin; 
        else: 
            bin = '1' + bin; 
          
        # right shift 'n' by 1 
        n = n >> 1; 
      
    # required binary number 
    return bin; 
  
# Driver Code 
n = 38; 
print(decToBin(n)); 
  
# This code is contributed 
# by mits 

