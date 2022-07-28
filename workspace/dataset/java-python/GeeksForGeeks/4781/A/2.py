

# Python 3 Program to convert 
# given decimal number into  
# decimal equivalent of its  
# gray code form 
  
def grayCode(n): 
  
    # Right Shift the number 
    # by 1 taking xor with  
    # original number 
    return n ^ (n >> 1) 
  
  
# Driver Code 
n = 10
print(grayCode(n)) 
  
# This code is contributed 
# by Smitha Dinesh Semwal 

