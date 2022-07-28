

# Python program to get 
# maximum sum of Numbers 
# with condition that 
# their LCM should be N 
  
import math 
  
# Method returns maximum sum f distinct 
# number whose LCM is N 
def getMaximumSumWithLCMN(N): 
  
    sum = 0
    LIM = int(math.sqrt(N)) 
   
    # find all divisors which divides 'N' 
    for i in range(1, LIM + 1): 
  
        # if 'i' is divisor of 'N' 
        if (N % i == 0): 
  
            # if both divisors are same then add 
            # it only once else add both 
            if (i == (N // i)): 
                sum = sum + i 
            else: 
                sum = sum + (i + N // i) 
       
    return sum
  
# driver code 
  
N = 12
print(getMaximumSumWithLCMN(N)) 
  
# This code is contributed 
# by Anant Agarwal. 

