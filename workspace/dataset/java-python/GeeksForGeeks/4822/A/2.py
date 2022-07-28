

# Python3 program to print first N  
# Leyland Numbers. 
import math 
  
# Print first n Leyland Number. 
def leyland(n): 
    ans = [] 
    x = 2
    y = 2
  
    # Outer loop for x from 2 to n. 
    while x <= n : 
  
        # Inner loop for y from 2 to x. 
        y = 2
        while y <= x : 
  
            # Calculating x^y + y^x 
            temp = pow(x, y) + pow(y, x) 
  
            ans.append(temp); 
            y = y + 1
        x = x + 1
  
    # Sorting the all Leyland Number. 
    ans.sort(); 
  
    i = 0
  
    # Printing first n Leyland number. 
    while i < n : 
        print(ans[i], end = " ") 
        i = i + 1
  
# Driver Code 
n = 6
leyland(n) 
  
# This code is contributed by rishabh_jain 

