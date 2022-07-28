

# Python3 Program to find  
# the sum of fourth powers of 
# first n even natural numbers 
  
# calculate the sum of fourth  
# power of first n even 
# natural numbers 
def evenPowerSum(n): 
    sum = 0; 
    for i in range(1, n + 1): 
          
        # made even number 
        j = 2 * i; 
        sum = sum + (j * j * j * j); 
    return sum; 
  
# Driver Code 
n = 5; 
print(evenPowerSum(n)); 
  
# This is contributed by mits. 

