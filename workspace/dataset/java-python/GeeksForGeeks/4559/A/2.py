

# Python program to find 
# if a number is powerful or not. 
import math 
  
# function to check if 
# the number is powerful 
def isPowerful(n): 
  
    # First divide the number repeatedly by 2 
    while (n % 2 == 0): 
  
        power = 0
        while (n % 2 == 0): 
          
            n = n//2 
            power = power + 1
          
           
        # If only 2 ^ 1 divides 
        # n (not higher powers), 
        # then return false 
        if (power == 1): 
            return False
      
   
    # if n is not a power of 2 
    # then this loop will execute 
    # repeat above process 
    for factor in range(3, int(math.sqrt(n))+1, 2): 
      
        # Find highest power of 
        # "factor" that divides n 
        power = 0
        while (n % factor == 0): 
          
            n = n//factor 
            power = power + 1
          
   
        # If only factor ^ 1 divides 
        # n (not higher powers), 
        # then return false 
        if (power == 1): 
            return false 
      
   
     # n must be 1 now if it 
     # is not a prime numenr. 
     # Since prime numbers are 
     # not powerful, we return 
     # false if n is not 1. 
    return (n == 1) 
  
# Driver code 
  
print("YES" if isPowerful(20) else "NO") 
print("YES" if isPowerful(27) else "NO") 
  
  
# This code is contributed 
# by Anant Agarwal. 

