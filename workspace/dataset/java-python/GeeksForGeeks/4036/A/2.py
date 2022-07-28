

# Python3 implementation of the approach 
  
# Function that returns true if all the 1's 
# in the binary s are equidistant 
def check(s, l): 
  
    # Initialize vector to store 
    # the position of 1's 
    pos = [] 
  
    for i in range(l): 
  
        # Store the positions of 1's 
        if (s[i] == '1'): 
            pos.append(i) 
  
    # Size of the position vector 
    t = len(pos) 
    for i in range(1, t): 
  
        # If condition isn't satisfied 
        if ((pos[i] - 
             pos[i - 1]) != (pos[1] - 
                             pos[0])): 
            return False
  
    return True
  
# Driver code 
s = "100010001000"
l = len(s) 
if (check(s, l)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by mohit kumar 

