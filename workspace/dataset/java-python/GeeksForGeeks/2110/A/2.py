

# A Python3 program to validate a number 
import math as mt 
  
# Function to validate number (Check if  
# frequency of a digit is less than the  
# digit itself or not) 
def validate(n): 
  
    count = [0 for i in range(10)]  
    while (n > 0): 
      
        # calculate frequency of each digit 
        r = n % 10
  
        # If count is already r, then 
        # incrementing it would invalidate,  
        # hence we return false. 
        if (count[r] == r): 
            return False
  
        count[r] += 1
        n = n // 10
      
    return True
  
# Driver Code 
n = 1552793
if (validate(n)): 
    print("True") 
else: 
    print("False") 
  
# This code is contributed by  
# Mohit kumar 29 

