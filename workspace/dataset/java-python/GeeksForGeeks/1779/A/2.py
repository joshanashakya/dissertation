

# Python3 program to print greater  
# of x^y and y^x 
import math 
  
def printGreater(x, y): 
  
    X = y * math.log(x); 
    Y = x * math.log(y); 
    if (abs(X - Y) < 1e-9): 
        print("Equal"); 
    elif (X > Y): 
        print(x, "^", y); 
    else: 
        print(y, "^", x); 
  
# Driver Code 
x = 5; 
y = 8; 
printGreater(x, y); 
  
# This code is contributed by mits 

