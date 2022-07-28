

# Python 3 implementation of the approach 
  
# Function that returns true if multiple 
# lines are possible passing through 
# (x, y) that divide the given 
# rectangle into two equal parts 
def isPossible(w, h, x, y): 
      
    # If the point (x, y) is the 
    # centre of the rectangle 
    if (x * 2 == w and y * 2 == h): 
        return True
  
    return False
  
# Driver code 
if __name__ == '__main__': 
    w = 1
    h = 2
    x = 1
    y = 2
  
    if (isPossible(w, h, x, y)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by Surendra_Gangwar 

