

# Python3 Program to find  
# the sum of fourth powers  
# of first n even natural  
# numbers 
  
# calculate the sum of  
# fourth power of first n  
# even natural numbers 
def evenPowerSum(n): 
    return (8 * n * (n + 1) * 
           (2 * n + 1) * (3 *
            n * n + 3 * n - 1)) / 15; 
  
# Driver Code 
n = 4; 
print (int(evenPowerSum(n))); 
  
# This code is contributed by mits 

