

# Python 3 implementation to count 
# number of digits in the product 
# of two numbers 
import math  
  
# function to count number of digits  
# in the product of two numbers 
def countDigits(a, b) : 
      
    # if either of the number is 0,  
    # then product will be 0 
    if (a == 0 or b == 0) : 
        return 1
          
    # required count of digits          
    return math.floor(math.log10(abs(a)) + 
                   math.log10(abs(b))) + 1
  
  
# Driver program to test above 
a = 33
b = -24
print(countDigits(a, b)) 
  
# This code is contributed by Nikita Tiwari. 

