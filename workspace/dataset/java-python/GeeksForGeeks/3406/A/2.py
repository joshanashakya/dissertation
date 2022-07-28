

# Python3 code for n'th perrin  
# number using Recursion' 
  
# function return n'th 
# perrin number 
def per(n): 
  
    if (n == 0): 
        return 3; 
    if (n == 1): 
        return 0; 
    if (n == 2): 
        return 2; 
    return per(n - 2) + per(n - 3); 
  
# Driver Code 
n = 9; 
print(per(n)); 
      
# This code is contributed mits 

