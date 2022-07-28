

# Python program to find remainder without 
# using modulo operator. This function  
# returns remainder of num / divisor without  
# using % (modulo) operator 
  
def getRemainder(num, divisor): 
  
    # Handle divisor equals to 0 case 
    if (divisor == 0): 
        return False
  
    # Handle negative values 
    if (divisor < 0): 
        divisor = -divisor 
    if (num < 0):  
        num = -num 
  
    # Find the largest product of 'divisor' 
    # that is smaller than or equal to 'num' 
    i = 1
    product = 0
    while (product <= num): 
            product = divisor * i 
            i += 1
    # return remainder 
    return num - (product - divisor) 
  
# Driver program to test above functions 
num = 100
divisor = 7
print(getRemainder(num, divisor)) 
  
# This code is contributed by Danish Raza 

