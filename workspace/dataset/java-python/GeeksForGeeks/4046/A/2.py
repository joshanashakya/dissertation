

# Python3 implementation of the approach 
  
# Function to calculate the perfix sum of the 
# rows and the columns of the given matrix 
def perfix_calculate(A, row, col): 
      
    # Number of rows and cols 
    n = len(A) 
    m = len(A[0]) 
  
    # First column of the row prefix array 
    for i in range(n): 
        row[i][0] = A[i][0] 
  
    # Update the prefix sum for the rows 
    for i in range(n): 
        for j in range(1, m): 
            row[i][j] = row[i][j - 1]+ A[i][j] 
  
    # First row of the column prefix array 
    for i in range(m): 
        col[0][i] = A[0][i] 
  
    # Update the prefix sum for the columns 
    for i in range(m): 
        for j in range(1, m): 
            col[j][i] = A[j][i] + col[j - 1][i] 
  
# Function to return the perimeter 
# of the square having top-left corner 
# at (i, j) and size k 
def perimeter(i, j, k, row, col, A): 
  
    # i and j represent the top left 
    # corner of the square and 
    # k is the size 
    row_s, col_s = 0, 0
  
    # Get the upper row sum 
    if (j == 0): 
        row_s = 0
    else: 
        row_s = row[i][j - 1] 
  
    # Get the left column sum 
    if (i == 0): 
        col_s = 0
    else: 
        col_s = col[i - 1][j] 
  
    upper_row = row[i][j + k] - row_s 
    left_col = col[i + k][j] - col_s 
  
    # At the distance of k in 
    # both direction 
    if (j == 0): 
        row_s = 0
    else: 
        row_s = row[i + k][j - 1] 
  
    if (i == 0): 
        col_s = 0
    else: 
        col_s = col[i - 1][j + k] 
  
    lower_row = row[i + k][j + k] - row_s 
    right_col = col[i + k][j + k] - col_s 
  
    # The perimeter will be 
    # sum of all the values 
    sum = upper_row + lower_row + \ 
           left_col + right_col 
  
    # Since all the corners are 
    # included twice, they need to 
    # be subtract from the sum 
    sum -= (A[i][j] + A[i + k][j] + \ 
            A[i][j + k] + A[i + k][j + k]) 
  
    return sum
  
# Function to return the maximum perimeter 
# of a square in the given matrix 
def maxPerimeter(A): 
  
    # Number of rows and cols 
    n = len(A) 
    m = len(A[0]) 
  
    row = [[0 for i in range(m)]  
              for i in range(n)] 
    col = [[0 for i in range(m)]  
              for i in range(n)] 
  
    # Function call to calculate 
    # the prefix sum of rows and cols 
    perfix_calculate(A, row, col) 
  
    # To store the maximum perimeter 
    maxPer = 0
  
    # Nested loops to choose the top-left 
    # corner of the square 
    for i in range(n): 
        for j in range(m): 
  
            # Loop for the size of the square 
            for k in range(min(n - i, m - j)): 
  
                # Get the perimeter of the current square 
                perimtr = perimeter(i, j, k,  
                                    row, col, A) 
  
                # Update the maximum perimeter so far 
                maxPer = max(maxPer, perimtr) 
  
    return maxPer 
  
# Driver code 
A = [[ 1, 1, 0 ], 
     [ 1, 1, 1 ], 
     [ 0, 1, 1 ]] 
  
print(maxPerimeter(A)) 
  
# This code is contributed by Mohit Kumar 

