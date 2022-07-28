

# Python 3 program to find the 
# count of positive integer of a 
# given number of digits that 
# contain atleast one zero 
import math 
  
# Returns count of 'd' digit 
# integers have 0 as a digit 
def findCount(d) : 
    return 9*((int)(math.pow(10,d-1)) - (int)(math.pow(9,d-1))); 
  
  
# Driver Code 
d = 1
print(findCount(d)) 
      
d = 2
print(findCount(d)) 
  
d = 4
print(findCount(d)) 
  
  
# This code is contributed by Nikita Tiwari. 

