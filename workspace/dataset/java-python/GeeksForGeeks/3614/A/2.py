

# Python3 program to check if two points 
# lie on the same side or not 
  
# Function to check if two points 
# lie on the same side or not 
def pointsAreOnSameSideOfLine(a, b, c, x1, y1, x2, y2): 
    fx1 = 0 # Variable to store a * x1 + b * y1 - c 
    fx2 = 0 # Variable to store a * x2 + b * y2 - c 
  
    fx1 = a * x1 + b * y1 - c 
    fx2 = a * x2 + b * y2 - c 
  
    # If fx1 and fx2 have same sign 
    if ((fx1 * fx2) > 0): 
        return True
  
    return False
  
# Driver code 
a, b, c = 1, 1, 1
x1, y1 = 1, 1
x2, y2 = 2, 1
  
if (pointsAreOnSameSideOfLine(a, b, c,  
                              x1, y1, x2, y2)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

