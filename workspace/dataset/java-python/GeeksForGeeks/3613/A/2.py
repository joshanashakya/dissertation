

# Python3 implementation of the approach  
  
# Function that return true if the  
# given point lies on the given line  
def pointIsOnLine(m, c, x, y): 
      
    # If (x, y) satisfies the  
    # equation of the line  
    if (y == ((m * x) + c)):  
        return True;  
  
    return False;  
  
# Driver code  
m = 3; c = 2;  
x = 1; y = 5;  
  
if (pointIsOnLine(m, c, x, y)):  
    print("Yes");  
else: 
    print("No");  
      
# This code is contributed by mits 

