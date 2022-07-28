

# Python3 Program to convert 
# given decimal number of  
# gray code into its inverse  
# in decimal form 
  
def inversegrayCode(n): 
    inv = 0; 
      
    # Taking xor until 
    # n becomes zero 
    while(n): 
        inv = inv ^ n; 
        n = n >> 1; 
    return inv; 
  
# Driver Code 
n = 15; 
print(inversegrayCode(n)); 
  
# This code is contributed 
# by mits 

