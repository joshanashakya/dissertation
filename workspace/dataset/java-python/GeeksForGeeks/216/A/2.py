

# Python program to find  
# minimum number which  
# divide n to make it a  
# perfect square. 
import math 
  
# Return the minimum  
# number to be divided  
# to make n a perfect  
# square. 
def findMinNumber(n): 
    count = 0
    ans = 1
  
    # Since 2 is only  
    # even prime, compute  
    # its power seprately. 
    while n % 2 == 0: 
        count += 1
        n //= 2
  
    # If count is odd,  
    # it must be removed 
    # by dividing n by  
    # prime number. 
    if count % 2 is not 0: 
        ans *= 2
  
    for i in range(3, (int)(math.sqrt(n)) + 1, 2): 
        count = 0
        while n % i == 0: 
            count += 1
            n //= i 
  
        # If count is odd, it  
        # must be removed by  
        # dividing n by prime  
        # number. 
        if count % 2 is not 0: 
            ans *= i 
  
    if n > 2: 
        ans *= n 
  
    return ans 
  
# Driver Code 
n = 72
print(findMinNumber(n)) 
  
# This code is contributed 
# by Sanjit_Prasad. 

