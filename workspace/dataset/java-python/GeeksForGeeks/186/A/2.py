

# Python 3 implementation to 
# check divisibility by 36 
  
# Function to check whether a 
# number is divisible by  
# 36 or not 
def divisibleBy36(num) : 
    l = len(num) 
  
    # null number cannot 
    # be divisible by 36 
    if (l == 0) : 
        return ("No") 
  
    # single digit number other 
    # than 0 is not divisible 
    # by 36 
    if (l == 1 and num[0] != '0') : 
        return ("No") 
  
    # number formed by the  
    # last 2 digits 
    two_digit_num = (((int)(num[l - 2])) *
                    10 +(int)(num[l - 1])) 
  
    # if number is not  
    # divisible by 4 
    if (two_digit_num%4 != 0) : 
        return "No"
  
    # number is divisible  
    # by 4 calculate sum 
    # of digits 
    sm = 0
    for i in range(0,l) : 
        sm = sm + (int)(num[i]) 
  
    # sum of digits is not 
    # divisible by 9 
    if (sm%9 != 0) : 
        return ("No") 
  
    # Number is divisible  
    # by 4 and 9 hence,  
    # number is divisible 
    # by 36 
    return ("Yes") 
  
# Driver program 
num = "92567812197966231384"
print(divisibleBy36(num)) 
  
# This code is contributed by Nikita Tiwari. 

