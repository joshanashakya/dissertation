

# Python3 program to find smallest and  
# largest elements of both diagonals 
  
n = 5
  
# Function to find smallest and largest element 
# from principal and secondary diagonal 
def diagonalsMinMax(mat): 
      
    # take length of matrix 
    if (n == 0): 
        return
  
    # declare and initialize variables 
    # with appropriate value 
    principalMin = mat[0][0] 
    principalMax = mat[0][0] 
    secondaryMin = mat[n - 1][0] 
    secondaryMax = mat[n - 1][0] 
  
    for i in range(n): 
  
        # Condition for principal 
        # diagonal mat[i][i] 
  
        # take new smallest value 
        if (mat[i][i] < principalMin): 
            principalMin = mat[i][i] 
  
        # take new largest value 
        if (mat[i][i] > principalMax): 
            principalMax = mat[i][i] 
  
        # Condition for secondary 
        # diagonal is mat[n-1-i][i] 
        # take new smallest value 
        if (mat[n - 1 - i][i] < secondaryMin): 
            secondaryMin = mat[n - 1 - i][i] 
  
        # take new largest value 
        if (mat[n - 1 - i][i] > secondaryMax): 
            secondaryMax = mat[n - 1 - i][i] 
  
    print("Principal Diagonal Smallest Element: ",principalMin) 
    print("Principal Diagonal Greatest Element : ",principalMax) 
  
    print("Secondary Diagonal Smallest Element: ",secondaryMin) 
    print("Secondary Diagonal Greatest Element: ",secondaryMax) 
  
# Driver code 
  
# Declare and initialize 5X5 matrix 
matrix= [[ 1, 2, 3, 4, -10 ], 
        [ 5, 6, 7, 8, 6 ], 
        [ 1, 2, 11, 3, 4 ], 
        [ 5, 6, 70, 5, 8 ], 
        [ 4, 9, 7, 1, -5 ]] 
  
diagonalsMinMax(matrix) 
  
# This code is contributed by mohit kumar 29 

