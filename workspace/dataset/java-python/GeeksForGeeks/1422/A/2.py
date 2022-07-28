

# Python3 program to count of steps until  
# one of the two numbers become 0. 
import math 
  
# Returns count of steps before one of  
# the numbers become 0 after repeated 
# subtractions. 
def countSteps(x, y): 
      
    # If y divides x, then simply 
    # return x/y. 
    if (x % y == 0): 
        return math.floor(x / y); 
  
    # Else recur. Note that this function  
    # works even if x is smaller than y  
    # because in that case first recursive  
    # call exchanges roles of x and y. 
    return math.floor((x / y) + 
           countSteps(y, x % y)); 
  
# Driver code 
x = 100; 
y = 19; 
print(countSteps(x, y)); 
  
# This code is contributed by mits 

