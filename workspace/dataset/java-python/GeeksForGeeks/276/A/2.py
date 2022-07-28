

# Python 3 program to count total number of 
# ways to reach destination in a graph 
  
# Utility Function to count total ways 
def countWays(mtrx, vrtx, i, dest, visited): 
      
    # Base condition 
    # When reach to the destination 
    if (i == dest): 
        return 1
          
    total = 0
    for j in range(vrtx): 
        if (mtrx[i][j] == 1 and not visited[j]): 
  
            # Make vertex visited 
            visited[j] = True; 
  
            # Recursive function, for count ways 
            total += countWays(mtrx, vrtx, j, dest, visited); 
  
            # Backtracking 
            # Make vertex unvisited 
            visited[j] = False; 
  
    # Return total ways 
    return total 
  
# Function to count total ways 
# to reach destination 
def totalWays(mtrx, vrtx, src, dest): 
    visited = [False]*vrtx 
  
    # Loop to make all vertex unvisited, 
    # Initially 
    for i in range(vrtx): 
        visited[i] = False
  
    # Make source visited 
    visited[src] = True; 
  
    return countWays(mtrx, vrtx, src, dest,visited) 
  
# Driver function 
vrtx = 11
mtrx = [ 
        [0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 ], 
        [ 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 ], 
        [ 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0 ], 
        [ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 ], 
        [ 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0 ], 
        [ 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0 ], 
        [ 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0 ], 
        [ 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 ], 
        [ 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 ], 
        [ 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0 ], 
        [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 ] 
    ] 
  
src = 3
dest = 9
  
# Print total ways 
print(totalWays(mtrx, vrtx, src - 1,dest - 1)) 
  
# This code is contributed by atul kumar shrivastava 

