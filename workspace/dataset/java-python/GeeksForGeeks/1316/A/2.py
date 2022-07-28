

# Python3 code to find  
# maximum sum of digits  
# in all divisors of n numbers. 
  
# Function to get sum of digits 
def getSum( n ): 
    sum = 0
    while n != 0: 
        sum = sum + n % 10
        n = int( n / 10 ) 
    return sum
  
# returns maximum sum 
def largestDigitSumdivisior( n ): 
    res = 0
    for i in range(1, n + 1): 
  
        # if i is factor of n  
        # then push the divisor 
        # in the stack. 
        if n % i == 0: 
            res = max(res, getSum(i)) 
  
    return res 
  
  
# Driver Code 
n = 14
print(largestDigitSumdivisior(n) ) 
  
# This code is contributed 
# by "Sharad_Bhardwaj". 

