

# Python3 code to find sum of all 
# divisor of number up to 'n' 
  
# Utility function to find sum of 
# all divisor of number up to 'n' 
def divisorSum( n ): 
    sum = 0
      
    for i in range(1, n + 1): 
          
        # Find all divisors of i 
        # and add them 
        j = 1
        while j * j <= i: 
            if i % j == 0: 
                if i / j == j: 
                    sum += j 
                else: 
                    sum += j + i / j 
            j = j + 1
    return int(sum) 
  
# Driver code 
n = 4
print( divisorSum(n)) 
n = 5
print( divisorSum(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

