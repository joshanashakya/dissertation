

# Python3 implementation of the approach 
import math as mt 
  
# Function that returns true 
# if x is a perfect square 
def isPerfectSquare(x): 
  
    # Find floating po value of 
    # square root of x 
    sr = mt.sqrt(x) 
  
    # If square root is an eger 
    return ((sr - mt.floor(sr)) == 0) 
  
# Function that returns true 
# if n is a sunny number 
def isSunnyNum(n): 
  
    # If (n + 1) is a perfect square 
    if (isPerfectSquare(n + 1)): 
        return True
    return False
  
# Driver code 
n = 3
  
if (isSunnyNum(n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed  
# by Mohit Kumar 

