

# Python 3 program to print 
# first n non-square numbers. 
import math 
  
# Returns n-th non-square  
# number. 
def printNonSquare(n) : 
  
    curr_count = 2
    num = 2
    count = 0
  
    while (count < n) : 
          
        # Print curr_count numbers.  
        # curr_count is current gap 
        # between two square numbers. 
        i = 0
          
        while(i < curr_count and count < n) : 
              
            print(num, end = " ") 
            count = count + 1
            num = num + 1
            i = i + 1
              
        # skip a square number. 
        num = num + 1
  
        # Count of next non-square  
        # numbers is next even number. 
        curr_count = curr_count + 2
  
n = 10
printNonSquare(n) 
      
# This code is contributed by Nikita Tiwari. 

