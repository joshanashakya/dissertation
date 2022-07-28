

# Python3 program to find product of 
# middle row and middle column in matrix 
  
MAX = 100
  
def middleProduct(mat, n): 
  
    # loop for product of row and column 
    row_prod = 1
    col_prod = 1
    for i in range(n) : 
        row_prod *= mat[n // 2][i] 
        col_prod *= mat[i][n // 2] 
  
    # Print result 
    print ("Product of middle row = ",  
                             row_prod) 
  
    print ("Product of middle column = ",  
                                col_prod) 
                                  
# Driver code 
if __name__ == "__main__": 
  
    mat = [[ 2, 1, 7 ], 
           [ 3, 7, 2 ], 
           [ 5, 4, 9 ]] 
  
    middleProduct(mat, 3) 
  
# This code is contributed by ita_c     

