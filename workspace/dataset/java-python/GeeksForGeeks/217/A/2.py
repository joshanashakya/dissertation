

# Python3 program to count  
# number of trailing zeros in  
# Binary representation of a number 
  
# Function to count number of  
# trailing zeros in Binary 
# representation of a number 
def CountTrailingZeros(n): 
      
    # declare bitset of 64 bits 
    bit = bin(n)[2:] 
    bit = bit[::-1] 
  
    zero = 0; 
  
    for i in range(len(bit)): 
        if (bit[i] == '0'): 
            zero += 1
              
        # if '1' comes then break 
        else: 
            break
  
    return zero 
  
# Driver Code 
n = 4
  
ans = CountTrailingZeros(n) 
  
print(ans) 
  
# This code is contributed  
# by Mohit Kumar 

