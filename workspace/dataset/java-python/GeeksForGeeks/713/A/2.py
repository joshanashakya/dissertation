

# An efficient Python3 program to find  
# bit-wise & of all numbers from x to y.  
def andOperator(a, b): 
    while(a < b): 
          
        # -b is the 2's complement of b  
        # when do bitwise or with b we 
        # get LSB and we subtract that from b  
        b -= (b & -b)  
    return b  
  
# Driver code  
a, b = 10, 15
print(andOperator(a, b)) 
  
# This code is contributed by  
# Shubham Singh (SHUBHAMSINGH10) 

