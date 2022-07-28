

# Python 3 program to find  
# LCM of 2 numbers without  
# using GCD 
import sys 
  
# Function to return 
# LCM of two numbers 
def findLCM(a, b): 
  
    lar = max(a, b) 
    small = min(a, b) 
    i = lar 
    while(1) : 
        if (i % small == 0): 
            return i 
        i += lar 
      
# Driver Code 
a = 5
b = 7
print("LCM of " , a , " and ",  
                  b , " is " ,  
      findLCM(a, b), sep = "") 
  
# This code is contributed  
# by Smitha 

