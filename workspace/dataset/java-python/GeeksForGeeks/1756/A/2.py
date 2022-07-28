

# Python3 implementation of  
# finding power of p in n! 
  
# Returns power of p in n! 
def PowerOFPINnfactorial(n, p): 
  
    # initializing answer 
    ans = 0; 
  
    # initializing 
    temp = p; 
  
    # loop until temp<=n 
    while (temp <= n): 
  
        # add number of numbers  
        # divisible by n 
        ans += n / temp; 
  
        # each time multiply 
        # temp by p 
        temp = temp * p; 
          
    return ans; 
  
# Driver Code 
print(PowerOFPINnfactorial(4, 2)); 
  
# This code is contributed by  
# mits 

