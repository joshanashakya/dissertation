

# Python 3 program to determine if 
# A and B can be reached starting 
# from 1, 1 following the given steps. 
import numpy as np 
  
# function to check is it is possible to  
# reach A and B starting from 1 and 1 
def possibleToReach(a, b): 
  
    # find the cuberoot of the number 
    c = np.cbrt(a * b) 
  
    # divide the number by cuberoot 
    re1 = a // c 
    re2 = b // c 
  
    # if it is a perfect cuberoot and 
    # divides a and b 
    if ((re1 * re1 * re2 == a) and 
        (re2 * re2 * re1 == b)): 
        return True
    else: 
        return False
  
# Driver Code 
if __name__ == "__main__": 
      
    A = 60
    B = 450
  
    if (possibleToReach(A, B)): 
        print("yes") 
    else: 
        print("no") 
  
# This code is contributed by ita_c 

