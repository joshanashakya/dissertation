

# Python implementation to 
# find first digit of a 
# single number 
  
def firstDigit(x): 
  
    # Keep dividing by 10 until it is 
    # greater than equal to 10 
    while(x >= 10): 
        x = x//10
    return x 
  
   
# driver function 
  
print(firstDigit(12345)) 
print(firstDigit(5432)) 
  
# This code is contributed 
# by Anant Agarwal. 

