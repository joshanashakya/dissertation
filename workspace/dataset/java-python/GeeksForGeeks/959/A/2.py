

# Python3 implementation of the approach 
N = 3
  
# Function to return the number of cells 
# in which mirror can be placed 
def numberOfCells(mat): 
  
    row = [[ False for i in range(N)]  
                   for i in range(N)] 
    col = [[ False for i in range(N)]  
                   for i in range(N)] 
  
    # Update the row array where row[i][j] 
    # will store whether the current row i 
    # contains all 1s in the columns 
    # starting from j 
    for i in range(N): 
        for j in range(N - 1, -1, -1): 
            if (mat[i][j] == 1): 
                if j + 1 < N: 
                    row[i][j] = row[i][j + 1] 
                else: 
                    row[i][j] = True
  
            else : 
                row[i][j] = False
  
    # Update the column array where col[i][j] 
    # will store whether the current column j 
    # contains all 1s in the rows starting from i 
    for j in range(N): 
        for i in range(N - 1, -1, -1): 
            if (mat[i][j] == 1): 
                if i + 1 < N: 
                    col[i][j] = col[i + 1][j] 
                else: 
                    col[i][j] = True
  
            else: 
                col[i][j] = False
  
    # To store the required result 
    cnt = 0
  
    # For every cell except the last 
    # row and the last column 
    for i in range(N - 1): 
        for j in range(N - 1): 
  
            # If the current cell is not blocked 
            # and the light can travel from the 
            # next row and the next column 
            # then the current cell is valid 
            if (row[i][j] and col[i][j]): 
                cnt += 1
  
    # For the last column 
    for i in range(N): 
        if (col[i][N - 1]): 
            cnt += 1
  
    # For the last row, note that the last column 
    # is not taken into consideration as the bottom 
    # right element has already been considered 
    # in the last column previously 
    for j in range(N - 1): 
        if (row[N - 1][j]): 
            cnt += 1
  
    return cnt 
  
# Driver code 
mat = [[0, 1, 1], 
       [0, 1, 1], 
       [0, 1, 1]] 
  
print(numberOfCells(mat)) 
  
# This code is contributed by Mohit Kumar 

