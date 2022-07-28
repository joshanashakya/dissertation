

# Python 3 code to find 
# the sum of series 
  
  
# function to calculate sum of series 
def calculateSum(n, k): 
      
    # initialize res 
    res = 1
   
    # initialize MOD 
    MOD = 1000000007
      
    # loop to calculate n ^ k % MOD 
    for i in range ( 0, k): 
        res = ( res * n ) % MOD 
  
    return res 
  
  
# Driver code 
n = 4
k = 3
  
# function calling 
print(calculateSum(n, k)) 

