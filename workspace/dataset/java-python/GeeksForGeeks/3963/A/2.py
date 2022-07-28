

# Python3 program to get total coverage of all zeros in 
# a binary matrix 
R = 4
C = 4
  
# Returns total coverage of all zeros in mat[][] 
def getTotalCoverageOfMatrix(mat): 
    res = 0
      
    # looping for all rows of matrix 
    for i in range(R): 
          
        isOne = False # 1 is not seen yet 
          
        # looping in columns from left to right 
        # direction to get left ones 
        for j in range(C): 
              
            # If one is found from left 
            if (mat[i][j] == 1): 
                isOne = True
                  
            # If 0 is found and we have found 
            # a 1 before. 
            elif (isOne): 
                res += 1
              
        # Repeat the above process for right to 
        # left direction. 
        isOne = False
        for j in range(C - 1, -1, -1): 
            if (mat[i][j] == 1): 
                isOne = True
            elif (isOne): 
                res += 1
      
    # Traversing across columms for up and down 
    # directions. 
    for j in range(C): 
        isOne = False # 1 is not seen yet 
        for i in range(R): 
              
            if (mat[i][j] == 1): 
                isOne = True
            elif (isOne): 
                res += 1
          
        isOne = False
        for i in range(R - 1, -1, -1): 
            if (mat[i][j] == 1): 
                isOne = True
            elif (isOne): 
                res += 1
                  
    return res 
  
# Driver code 
mat = [[0, 0, 0, 0],[1, 0, 0, 1],[0, 1, 1, 0],[0, 1, 0, 0]] 
print(getTotalCoverageOfMatrix(mat)) 
  
# This code is contributed by shubhamsingh10 

