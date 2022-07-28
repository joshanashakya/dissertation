

# Python 3 program to find the 
# count of natural numbers upto a 
# given number of digits that 
# contain atleast one zero 
import math 
  
  
# Utility function to calculate 
# the count of natural numbers 
# upto a given number of digits 
# that contain atleast one zero 
def findCountUpto(d) : 
    # Sum of two GP series 
    GP1_Sum = 9*((int)((math.pow(10,d))-1)//9) 
    GP2_Sum = 9*((int)((math.pow(9,d))-1)//8) 
   
    return GP1_Sum - GP2_Sum 
  
  
# Driver Code 
d = 1
print(findCountUpto(d)) 
  
d = 2
print(findCountUpto(d)) 
  
d = 4
print(findCountUpto(d)) 
  
  
# This code is contributed by Nikita Tiwari. 

