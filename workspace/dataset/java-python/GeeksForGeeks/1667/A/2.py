

# Python3 implementation to find sum of all 
# proper divisor of numbers up to N 
  
# Utility function to find sum of 
# all proper divisor of number up to N 
def properDivisorSum(n): 
      
    sum = 0
      
    # Loop to find the proper 
    # divisor of every number 
    # from 1 to N 
    for i in range(1, n + 1): 
        sum += (n // i) * i 
          
    return sum - n * (n + 1) // 2
  
  
# Driver Code 
n = 4
print(properDivisorSum(n)) 
  
n = 5
print(properDivisorSum(n)) 
  
# This code is contributed by shubhamsingh10 

