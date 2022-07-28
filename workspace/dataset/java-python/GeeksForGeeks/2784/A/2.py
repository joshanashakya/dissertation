

# Python3 program to find digital root 
# of a number 
import math  
  
# Returns digital root of num 
def digitalRoot(num): 
      
    # If num is 0. 
    if (num == "0"): 
        return 0
  
    # Count sum of digits under mod 9 
    ans = 0
    for i in range (0, len(num)): 
        ans = (ans + int(num[i])) % 9
          
  
    # If digit sum is multiple of 9, answer 
    # 9, else remainder with 9. 
    if(ans == 0): 
        return 9
    else:  
        return ans % 9
  
# Driver method 
num = "65785412"
  
# Calling digitalRoot function 
print (digitalRoot(num)) 
  
# This code is contributed by Gitanjali. 

