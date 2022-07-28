

# Python3 implementation to find smallest  
# number k such that the product of digits 
# of k is equal to n 
import math as mt  
  
# function to find smallest number k such that 
# the product of digits of k is equal to n 
def smallestNumber(n): 
  
    # if 'n' is a single digit number, then 
    # it is the required number 
    if (n >= 0 and n <= 9): 
        return n 
      
    # stack the store the digits 
    digits = list() 
      
    # repeatedly divide 'n' by the numbers  
    # from 9 to 2 until all the numbers are  
    # used or 'n' > 1 
    for i in range(9,1, -1): 
      
        while (n % i == 0): 
          
            # save the digit 'i' that  
            # divides 'n' onto the stack 
            digits.append(i) 
            n = n //i 
          
    # if true, then no number 'k'  
    # can be formed  
    if (n != 1): 
        return -1
  
    # pop digits from the stack 'digits' 
    # and add them to 'k' 
    k = 0
    while (len(digits) != 0): 
      
        k = k * 10 + digits[-1] 
        digits.pop() 
      
    # required smallest number 
    return k 
  
# Driver Code 
n = 100
print(smallestNumber(n))  
  
# This code is contributed by  
# Mohit kumar 29 

