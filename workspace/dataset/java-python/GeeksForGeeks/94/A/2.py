

# Python3 implementation of the approach 
import math 
  
# Function that returns true if the the sum of all the  
# perfect squares of the given array is divisible by x 
def check (a, y): 
    sum = 0
    for i in range(len(a)): 
          
        x = math.sqrt(a[i]) 
  
        # If a[i] is a perfect square 
        if (math.floor(x) == math.ceil(x)): 
            sum = sum + a[i] 
      
    if (sum % y == 0): 
        return True
    else: 
        return False
          
  
# Driver code 
a = [2, 3, 4, 9, 10] 
x = 13
  
if check(a, x) : 
    print("Yes") 
else: 
    print("No") 

