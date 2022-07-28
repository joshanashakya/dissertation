

# Python3 implementation of above approach 
  
# Function to find the Nth smallest number 
def find_number(N, K): 
      
    r = "" 
  
    # If N is divisible by 100 then we 
    # multiply N + 1 otherwise, it will be 
    # divisible by 100 more than K times 
    if (N % 100 == 0): 
        N += 1; 
  
        # convert integer to string 
        r = str(N) 
  
    # if N is not divisible by 100 
    else: 
          
        # convert integer to string 
        r = str(N) 
  
    # add 2*K 0's at the end to be divisible 
    # by 100 exactly K times 
    for i in range(1, K + 1): 
        r += "00"
  
    return r 
  
# Driver Code 
N = 1000
K = 2; 
ans = find_number(N, K) 
print(ans) 
  
# This code is contributed by Mohit Kumar 

