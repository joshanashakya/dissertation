

# A space optimized Python3 program to  
# check  if a number is happy number 
  
  
# Returns sum of squares of  
# digits of a number n. For  
# example for n = 12 it  
# returns 1 + 4 = 5 
def sumDigitSquare(n) : 
    sq = 0
    while (n) : 
        digit = n % 10
        sq = sq + digit * digit 
        n = n // 10
      
    return sq 
  
  
# Returns true if n  
# is Happy number else  
# returns false. 
def isHappy(n) : 
  
    # Keep replacing n with  
    # sum of squares of digits 
    # until we either reach 1  
    # or we end up in a cycle 
    while (1) : 
  
        # Number is Happy if  
        # we reach 1 
        if (n == 1) : 
            return True
  
        # Replace n with sum of  
        # squares of digits 
        n = sumDigitSquare(n) 
  
        # Number is not Happy  
        # if we reach 4 
        if (n == 4) : 
            return False
      
    return False
  
# Driver code 
n = 23
if (isHappy(n)) : 
    print("Yes") 
else : 
    print("No") 
      
  
# This code is contributed  
# by Nikita tiwari. 

