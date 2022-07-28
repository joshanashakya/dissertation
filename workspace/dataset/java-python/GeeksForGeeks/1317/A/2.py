

# Python 3 program 
# to find maximum 
# sum of digits in  
# all divisors of 
# n numbers 
import math 
  
# Function to get  
# sum of digits  
def getSum(n) : 
    sm = 0
    while (n != 0) : 
        sm = sm + n % 10
        n = n // 10
          
    return sm 
      
      
# returns maximum sum 
def largestDigitSumdivisior(n) : 
    res = 0
      
    # traverse till sqrt(n)  
    for i in range(1, (int)(math.sqrt(n))+1) : 
          
        # if i is factor of n then  
        # push the divisor in the 
        # stack. 
        if (n % i == 0) : 
  
            # check for both the 
            # divisors 
            res = max(res, getSum(i)) 
            res = max(res, getSum(n // i)) 
              
    return res 
  
# Driver Code 
n = 14
print(largestDigitSumdivisior(n)) 
  
#This code is contributed  
# by Nikita Tiwari 

