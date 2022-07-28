

# Python 3 program to print 
# first n non-square numbers. 
import math 
  
# Returns n-th non-square  
# number. 
def nonsquare(n) : 
      
    return n + (int)(0.5 + math.sqrt(n)) 
  
def printNonSquare(n) : 
      
    # loop to print non 
    # squares below n 
    for i in range(1, n + 1) : 
        print(nonsquare(i), end = " ") 
  
n = 10
printNonSquare(n) 
      
# This code is contributed by Nikita Tiwari. 

