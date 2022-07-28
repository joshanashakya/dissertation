

# Python 3 program to print  
# first n non-square numbers. 
import math 
  
# Function to check perfect  
# square 
def isPerfectSquare(n) : 
      
    if (n < 0) : 
        return False
  
    root = round(math.sqrt(n)) 
      
    return (n == root * root) 
  
# function to print all 
# non square number 
def printnonsquare(n) : 
      
    # variable which stores the 
    # count 
    count = 0
    i = 1
      
    while(count < n) : 
      
        # Not perfect square 
        if (isPerfectSquare(i)== False) : 
            print(i, end =" ") 
            count = count + 1
  
        i = i + 1
  
n = 10
printnonsquare(n) 
  
# This code is contributed by Nikita Tiwari. 

