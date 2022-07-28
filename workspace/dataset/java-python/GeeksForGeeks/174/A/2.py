

# Python3 program to check if a large  
# number is divisible by 20. 
import math 
  
def divisibleBy20(num): 
  
    # Get number with last two digits 
    lastTwoDigits = int(num[-2:]) 
  
    # Check if the number formed by last two 
    # digits is divisible by 5 and 4. 
    return ((lastTwoDigits % 5 == 0 and 
             lastTwoDigits % 4 == 0)) 
  
# driver code  
num = "63284689320"
if (divisibleBy20(num) == True): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Gitanjali. 

