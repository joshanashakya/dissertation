

# Python 3 implementation to count  
# number of digits in the product  
# of two numbers 
  
# function to count number of digits  
# in the product of two numbers 
def countDigits(a, b) : 
    count = 0
      
    # absolute value of the  
    # product of two numbers 
    p = abs(a * b) 
      
    # if product is 0 
    if (p == 0) : 
        return 1
      
    # count number of digits  
    # in the product 'p'  
    while (p > 0) : 
        count = count + 1
        p = p // 10
      
      
    # required count of digits  
    return count 
  
  
# Driver program to test above 
a = 33
b = -24
print("Number of digits = ", 
       countDigits(a,b)) 
  
# This code is contributed by Nikita Tiwari. 

