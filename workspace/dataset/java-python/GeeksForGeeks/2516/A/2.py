

# Python3 program to find the minimum number 
# of squares to cover the surface of the 
# rectangle with given dimensions 
import math 
  
def squares(l, b, a): 
      
    # function to count 
    # the number of squares that can 
    # cover the surface of the rectangle 
    return math.ceil(l / a) * math.ceil(b / a) 
  
# Driver code 
if __name__ == "__main__": 
    l = 11
    b = 23
    a = 14
    print(squares(l, b, a)) 
  
# This code is contributed 
# by ChitraNayal 

