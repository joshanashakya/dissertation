

# Python 3 program to find the 
# count of positive integer of a 
# given number of digits that 
# contain atleast one zero 
import math 
  
# Returns count of 'd' digit 
# integers have 0 as a digit 
def findCount(d) : 
    return 9*(pow(10,d-1) - pow(9,d-1)); 
  
  
# utility function to count 
# the required answer 
def findCountUpto(d) : 
  
    # Count of numbers with 
    # digits smaller than 
    # or equal to d. 
    totalCount = 0
    for i in range(1,d+1) : 
        totalCount = totalCount + findCount(i) 
   
    return totalCount 
  
   
# Driver Code 
d = 1
print(findCountUpto(d)) 
  
d = 2
print(findCountUpto(d)) 
  
d = 4
print(findCountUpto(d)) 
  
  
# This code is contributed by Nikita Tiwari. 

