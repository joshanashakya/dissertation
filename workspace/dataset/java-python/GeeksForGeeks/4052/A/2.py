

# Python 3 program to find 
# sum of given series 
  
import math 
  
# function to find sum of series 
def sum(n) : 
    root = (int)(math.sqrt(n)) 
    ans = 0
   
    for i in range(1, root + 1) : 
        ans = ans + n // i 
       
    ans = 2 * ans - (root * root) 
    return ans 
  
# driver code 
n = 35
print(sum(n)) 
  
# This code is contributed by Nikita Tiwari. 

