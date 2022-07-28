

# Python3 program of number of  
# leading zeros in binary  
# representation of a given number 
  
# Function to count the  
# no. of leading zeros 
def countZeros(x): 
      
    # Keep shifting x by one until  
    # leftmost bit does not become 1. 
    total_bits = 32
    res = 0
    while ((x & (1 << (total_bits - 1))) == 0): 
        x = (x << 1) 
        res += 1
  
    return res 
  
# Driver Code 
x = 101
print(countZeros(x)) 
  
# This code is contributed  
# by Mohit Kumar 

