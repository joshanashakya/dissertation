

# Python3 program to generate k digits of n ^ n  
import math 
  
# function to calculate first k digits of n^n  
def firstkdigits(n, k): 
      
    # take log10 of n^n. 
    # log10(n^n) = n*log10(n) 
    product = n * math.log(n, 10); 
      
    # We now try to separate the decimal  
    # and integral part of the /product. 
    # The floor function returns the smallest  
    # integer less than or equal to the argument.  
    # So in this case, product - floor(product)  
    # will give us the decimal part of product 
    decimal_part = product - math.floor(product); 
      
    # we now exponentiate this back 
    # by raising 10 to the power of 
    # decimal part 
    decimal_part = pow(10, decimal_part); 
      
    # We now try to find the power of 10 by  
    # which we will have to multiply the  
    # decimal part to obtain our final answer 
    digits = pow(10, k - 1); 
      
    return math.floor(decimal_part * digits);  
  
# Driver Code  
n = 1450;  
k = 6;  
print(firstkdigits(n, k));  
  
# This code is contributed by mits 

