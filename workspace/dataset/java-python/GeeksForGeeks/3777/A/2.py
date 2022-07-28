

# Python3 program to check if two 
# circles are orthogonal or not 
  
# Function to Check if the given 
# circles are orthogonal 
def orthogonality(x1, y1, x2, y2, r1, r2): 
  
    # calculating the square 
    # of the distance between C1 and C2 
    dsquare = (x1 - x2) * (x1 - x2) + \ 
              (y1 - y2) * (y1 - y2); 
  
    # Check if the given 
    # circles are orthogonal 
    if (dsquare == r1 * r1 + r2 * r2): 
        return True
    else: 
        return False
  
# Driver code 
x1, y1 = 4, 3
x2, y2 = 0, 1
r1, r2 = 2, 4
  
f = orthogonality(x1, y1, x2, y2, r1, r2) 
  
if (f): 
    print("Given circles are orthogonal.") 
else: 
    print("Given circles are not orthogonal.") 
  
# This code is contributed by Mohit Kumar 

