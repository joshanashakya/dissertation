

# Python 3 implementation of the approach 
n = 3
  
# Function to return the minimum steps 
# required to reach the end of the matrix 
def minSteps(arr): 
      
    # Array to determine whether 
    # a cell has been visited before 
    v = [[0 for i in range(n)] for j in range(n)] 
  
    # Queue for bfs 
    q = [[0,0]] 
  
    # To store the depth of search 
    depth = 0
  
    # BFS algorithm 
    while (len(q) != 0): 
          
        # Current queue size 
        x = len(q) 
        while (x > 0): 
              
            # Top-most element of queue 
            y = q[0] 
  
            # To store index of cell 
            # for simplicity 
            i = y[0] 
            j = y[1] 
            q.remove(q[0]) 
  
            x -= 1
  
            # Base case 
            if (v[i][j]): 
                continue
  
            # If we reach (n-1, n-1) 
            if (i == n - 1 and j == n - 1): 
                return depth 
  
            # Marking the cell visited 
            v[i][j] = 1
  
            # Pushing the adjacent cells in the 
            # queue that can be visited 
            # from the current cell 
            if (i + arr[i][j] < n): 
                q.append([i + arr[i][j], j]) 
            if (j + arr[i][j] < n): 
                q.append([i, j + arr[i][j]]) 
  
        depth += 1
  
    return -1
  
# Driver code 
if __name__ == '__main__': 
    arr = [[1, 1, 1], 
            [1, 1, 1], 
            [1, 1, 1]] 
  
    print(minSteps(arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

