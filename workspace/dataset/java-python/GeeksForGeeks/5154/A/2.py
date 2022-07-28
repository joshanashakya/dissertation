

# Python3 implementation of the approach 
from collections import deque 
m = 4
n = 3
  
# Function to return the number of valid 
# paths in the given maze 
def Maze(matrix): 
    q = deque() 
  
    # Insert the starting poi.e. 
    # (0, 0) in the queue 
    q.append((0, 0)) 
  
    # To store the count of possible paths 
    count = 0
  
    while (len(q) > 0): 
        p = q.popleft() 
  
        # Increment the count of paths since 
        # it is the destination 
        if (p[0] == n - 1 and p[1] == m - 1): 
            count += 1
  
        # If moving to the next row is a valid move 
        if (p[0] + 1 < n and
            matrix[p[0] + 1][p[1]] == 1): 
            q.append((p[0] + 1, p[1])) 
  
        # If moving to the next column is a valid move 
        if (p[1] + 1 < m and 
            matrix[p[0]][p[1] + 1] == 1): 
            q.append((p[0], p[1] + 1)) 
  
    return count 
  
# Driver code 
  
# Matrix to represent maze 
matrix = [ [ 1, 0, 0, 1 ], 
           [ 1, 1, 1, 1 ], 
           [ 1, 0, 1, 1 ] ] 
  
print(Maze(matrix)) 
      
# This code is contributed by Mohit Kumar 

