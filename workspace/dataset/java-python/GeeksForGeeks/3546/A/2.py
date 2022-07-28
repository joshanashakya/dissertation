

# Python3 program to reach bottom  
# right corner using minimum jumps.  
  
R, C = 3, 3
  
# Function to check coordinates are in valid range.  
def safe(x, y):  
  
    if x < R and y < C and x >= 0 and y >= 0:  
        return True
    return False
  
# Function to return minimum no of  
# cells to reach bottom right cell.  
def matrixJump(M, R1, C1):  
  
    q = []  
  
    # push the no of cells and coordinates in a queue.  
    q.append((1, (R1, C1)))  
  
    while len(q) != 0:  
        x = q[0][1][0] # x coordinate  
        y = q[0][1][1] # y coordinate  
        no_of_cells = q[0][0] # no of cells  
  
        q.pop(0)  
  
        # when it reaches bottom right return no of cells  
        if x == R - 1 and y == C - 1:          
            return no_of_cells  
  
        v = M[x][y]  
  
        if safe(x + v, y):  
            q.append((no_of_cells + 1, (x + v, y)))  
  
        if safe(x, y + v):  
            q.append((no_of_cells + 1, (x, y + v)))  
      
    # when destination cannot be reached  
    return -1
  
# Driver code  
if __name__ == "__main__":  
  
    M = [[2, 4, 2],  
        [5, 3, 8],  
        [1, 1, 1]] 
          
    print(matrixJump(M, 0, 0)) 
  
# This code is contributed by Rituraj Jain 

