

# Python 3 code to find last digit of a ^ b 
  
import math 
  
# Function to find b % a 
def Modulo(a, b) : 
    # Initialize result 
    mod = 0
  
    # calculating mod of b with a to make 
    # b like 0 <= b < a 
    for i in range(0, len(b)) : 
        mod = (mod * 10 + (int)(b[i])) % a 
  
    return mod # return modulo 
  
  
# function to find last digit of a ^ b 
def LastDigit(a, b) : 
    len_a = len(a) 
    len_b = len(b) 
  
    # if a and b both are 0 
    if (len_a == 1 and len_b == 1 and b[0] == '0' and a[0] == '0') : 
        return 1
  
    # if exponent is 0 
    if (len_b == 1 and b[0]=='0') : 
        return 1
  
    # if base is 0 
    if (len_a == 1 and a[0] == '0') : 
        return 0
  
    # if exponent is divisible by 4 that means last 
    # digit will be pow(a, 4) % 10. 
    # if exponent is not divisible by 4 that means last 
    # digit will be pow(a, b % 4) % 10 
    if((Modulo(4, b) == 0)) : 
        exp = 4
    else :  
        exp = Modulo(4, b) 
  
    # Find last digit in 'a' and compute its exponent 
    res = math.pow((int)(a[len_a - 1]), exp) 
  
    # Return last digit of result 
    return res % 10
      
  
# Driver program to run test case 
a = ['1', '1', '7'] 
b = ['3'] 
print(LastDigit(a, b)) 
  
# This code is contributed to Nikita Tiwari. 

