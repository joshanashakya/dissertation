

# Python3 code to find sum of all 
# divisor of number up to 'n' 
  
# Utility function to find sum of 
# all divisor of number up to 'n' 
def divisorSum( n ): 
    sum = 0
    for i in range(1, n + 1): 
        sum += int(n / i) * i 
    return int(sum) 
      
# Driver code 
n = 4
print( divisorSum(n)) 
n = 5
print( divisorSum(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

