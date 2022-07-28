

# Python3 implementation to sort 
# the given matrix in strict order 
  
# Function to sort the matrix 
def sortMat(data, row, col): 
      
    # Number of elements in matrix 
    size = row * col 
      
    # Loop to sort the matrix  
    # using Bubble Sort 
    for i in range(0, size): 
        for j in range(0, size-1): 
              
            # Condition to check 
            # if the Adjacent elements 
            if ( data[j//col][j % col] >\ 
                data[(j + 1)//col][(j + 1)% col] ): 
                  
                # Swap if previous value is greater 
                temp = data[j//col][j % col] 
                data[j//col][j % col] =\ 
                    data[(j + 1)//col][(j + 1)% col] 
                data[(j + 1)//col][(j + 1)% col] =\ 
                                 temp 
  
def printMat(mat, row, col): 
      
    # Loop to print the matrix 
    for i in range(row): 
        for j in range(col): 
            print(mat[i][j], end =" ") 
        print() 
  
# Driver Code 
if __name__ == "__main__": 
    mat = [ [5, 4, 7], 
            [1, 3, 8], 
            [2, 9, 6] ] 
    row = len(mat)  
    col = len(mat[0]) 
      
    # Function call to sort 
    sortMat(mat, row, col) 
      
    # Function call to 
    # print matrix 
    printMat(mat, row, col) 

