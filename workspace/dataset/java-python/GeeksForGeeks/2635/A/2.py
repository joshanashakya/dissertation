

# Python program to find the nth term  
# of the series 1 2 2 3 3 3 ... 
import math  
  
# function to solve the quadratic equation 
def term( n ): 
  
    # calculating the Nth term 
    x = (((1) + math.sqrt(1 + (8 * n))) / 2) 
    return x 
  
# Driver code 
n = 5
print(int(term(n))) 
  
# This code is contributed by Sharad_Bhardwaj. 

