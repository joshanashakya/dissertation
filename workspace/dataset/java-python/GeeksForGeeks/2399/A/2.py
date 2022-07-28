

# Python program to check 
# if a given number can be 
# represented in given number 
# of digits in any base 
  
# Returns true if 'num' can 
# be represented using 'dig' 
# digits in 'base' 
def checkUtil(num,dig,base): 
      
    # Base case 
    if (dig==1 and num < base): 
        return True
   
    # If there are more than 1 
    # digits left and number 
    # is more than base, then 
    # remove last digit by doing 
    # num/base, reduce the number 
    # of digits and recur 
    if (dig > 1 and num >= base): 
        return checkUtil(num/base, --dig, base) 
   
    return False
   
# return true of num can 
# be represented in 'dig' 
# digits in any base from 2 to 32 
def check(num,dig): 
  
    # Check for all bases one by one 
    for base in range(2,33): 
  
        if (checkUtil(num, dig, base)): 
            return True
    return False
  
# driver code 
num = 8
dig = 3
if(check(num, dig)==True): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Anant Agarwal. 

