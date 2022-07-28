

# Python program to find if x is a  
# perfect square. 
  
import math 
  
def isPerfectSquare(x): 
  
    # Find floating point value of  
    # square root of x. 
    sr = math.sqrt(x) 
   
    # If square root is an integer 
    return ((sr - math.floor(sr)) == 0) 
  
# Driver code 
  
x = 2500
if (isPerfectSquare(x)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Anant Agarwal. 

