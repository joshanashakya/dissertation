

# Python3 program to find smallest and  
# largest elements of both diagonals 
  
# Function to find smallest and largest element  
# from principal and secondary diagonal 
def diagonalsMinMax(mat): 
  
    # take length of matrix 
    n = len(mat) 
    if (n == 0): 
        return
  
    # declare and initialize variables  
    # with appropriate value 
    principalMin = mat[0][0] 
    principalMax = mat[0][0] 
    secondaryMin = mat[n - 1][0]  
    secondaryMax = mat[n - 1][0] 
  
    for i in range(1, n):  
      
        for j in range(1, n):  
          
            # Condition for principal 
            # diagonal 
            if (i == j): 
              
                # take new smallest value 
                if (mat[i][j] < principalMin): 
                  
                    principalMin = mat[i][j] 
                  
                # take new largest value 
                if (mat[i][j] > principalMax): 
                  
                    principalMax = mat[i][j] 
                  
            # Condition for secondary 
            # diagonal 
            if ((i + j) == (n - 1)):  
              
                # take new smallest value 
                if (mat[i][j] < secondaryMin): 
                  
                    secondaryMin = mat[i][j] 
                  
                # take new largest value 
                if (mat[i][j] > secondaryMax): 
                  
                    secondaryMax = mat[i][j] 
                  
    print("Principal Diagonal Smallest Element: ",  
                                     principalMin) 
    print("Principal Diagonal Greatest Element : ",  
                                      principalMax) 
  
    print("Secondary Diagonal Smallest Element: ",  
                                     secondaryMin) 
    print("Secondary Diagonal Greatest Element: ", 
                                     secondaryMax) 
  
# Driver code 
  
# Declare and initialize 5X5 matrix 
matrix = [[ 1, 2, 3, 4, -10 ], 
          [ 5, 6, 7, 8, 6 ], 
          [ 1, 2, 11, 3, 4 ], 
          [ 5, 6, 70, 5, 8 ], 
          [ 4, 9, 7, 1, -5 ]] 
diagonalsMinMax(matrix) 
  
# This code is contributed by Mohit kumar 29 

