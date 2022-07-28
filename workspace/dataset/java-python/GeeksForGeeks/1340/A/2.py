

# Python3 implementation of the approach 
  
# Function that returns true if any 
# prime number satisfies 
# the given conditions 
def isPossible(x, y): 
  
    # No such prime exists 
    if ((x - y) == 1): 
        return False
  
    return True
  
# Driver code 
x = 100
y = 98
  
if (isPossible(x, y)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

