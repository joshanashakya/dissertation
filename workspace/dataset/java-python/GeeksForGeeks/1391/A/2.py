

# Python3 program to check  
# if number starts with one 
# in base b representation 
import math 
  
# Returns true if n  
# starts with 1 in  
# base b represenation 
def CheckIfstartsWithOne(n, b): 
      
    # highest m can be log2(n) 
    m = (int)(math.log2(n)); 
    for i in range (1, m + 1): 
          
        # if b^m <= N <= 2*b^m - 1, 
        #return true 
        x = (int)(math.pow(b, i)); 
        if n >= x and n <= 2 * x - 1: 
            return 1; 
    return 0; 
  
# printing yes or no 
def printYesORno(n, b): 
    if CheckIfstartsWithOne(n, b) == 1: 
        print("Yes"); 
    if CheckIfstartsWithOne(n, b) == 0: 
        print("No"); 
          
# Driver Code 
printYesORno(6, 4); 
printYesORno(24, 2); 
printYesORno(24, 7); 
printYesORno(24, 15); 
  
# This code is contributed by mits. 

