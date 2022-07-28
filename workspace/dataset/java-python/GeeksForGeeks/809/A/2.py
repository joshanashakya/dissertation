

# Python3 implementation of the above approach 
  
# Storing all the possible 
# changes to make the triangle 
# right-angled 
dx = [-1, 0, 1, 0] 
dy = [0, 1, 0, -1] 
  
# Function to check if the triangle 
# is right-angled or not 
def ifRight(x1, y1, x2, y2, x3, y3): 
  
    a = ((x1 - x2) * (x1 - x2)) + \ 
        ((y1 - y2) * (y1 - y2)) 
  
    b = ((x1 - x3) * (x1 - x3)) + \ 
        ((y1 - y3) * (y1 - y3)) 
  
    c = ((x2 - x3) * (x2 - x3)) + \ 
        ((y2 - y3) * (y2 - y3)) 
  
    if ((a == (b + c) and a != 0 and b != 0 and c != 0) or 
        (b == (a + c) and a != 0 and b != 0 and c != 0) or 
        (c == (a + b) and a != 0 and b != 0 and c != 0)): 
        return 1
  
# Function to check if the triangle 
# can be transformed to right-angled 
def isValidCombination(x1, y1, x2, y2, x3, y3): 
  
    x, y = 0, 0
  
    # Boolean variable to 
    # return true or false 
    possible = 0
  
    # If it is already right-angled 
    if (ifRight(x1, y1, x2, y2, x3, y3)): 
        print("ALREADY RIGHT ANGLED") 
        return
  
    else: 
  
        # Applying the changes on the 
        # co-ordinates 
        for i in range(4): 
  
            # Applying on the first 
            # co-ordinate 
            x = dx[i] + x1 
            y = dy[i] + y1 
  
            if (ifRight(x, y, x2, y2, x3, y3)): 
                print("POSSIBLE") 
                return
  
            # Applying on the second 
            # co-ordinate 
            x = dx[i] + x2 
            y = dy[i] + y2 
  
            if (ifRight(x1, y1, x, y, x3, y3)): 
                print("POSSIBLE") 
                return
  
            # Applying on the third 
            # co-ordinate 
            x = dx[i] + x3 
            y = dy[i] + y3 
  
            if (ifRight(x1, y1, x2, y2, x, y)): 
                print("POSSIBLE") 
                return
  
    # If can't be transformed 
    if (possible == 0): 
        print("NOT POSSIBLE") 
  
# Driver Code 
x1 = -49
y1 = 0
x2 = 0
y2 = 50
x3 = 0
y3 = -50
  
isValidCombination(x1, y1, x2, y2, x3, y3) 
  
# This code is contributed by Mohit Kumar 

