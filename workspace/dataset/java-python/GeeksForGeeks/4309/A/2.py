

# Python3 Implementation to print 
# the pattern 
import math as mt 
  
# Function definition 
def pattern(n): 
  
    i = n - 1
    j = 1
    for i in range(n - 1, -1, -1): 
  
        # outer gap loop 
        for j in range(n - 1, i, -1): 
            print(' ', end = '') 
              
        # 65 is ASCII of 'A' 
        print(chr(i + 65), end = '') 
  
        # inner gap loop 
        for j in range(1, i * 2): 
            print(' ', end = '') 
  
        if (i >= 1): 
            print(chr(i + 65), end = '') 
        print() 
          
# Driver code 
  
# taking size from the user 
n = 5
  
# function calling 
pattern(n) 
  
# This code is contributed  
# by MOhit kumar 

