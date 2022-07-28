

# Python implementation to sort the rows 
# of matrix in ascending order followed by 
# sorting the columns in descending order 
  
MAX_SIZE=10
   
# function to sort each row of the matrix 
# according to the order specified by  
# ascending. 
def sortByRow(mat, n, ascending): 
  
    for i in range(n): 
        if (ascending):     
            mat[i].sort() 
        else: 
            mat[i].sort(reverse=True) 
   
# function to find  
# transpose of the matrix 
def transpose(mat, n): 
  
    for i in range(n): 
        for j in range(i + 1, n):  
          
            # swapping element at index (i, j)  
            # by element at index (j, i) 
            temp = mat[i][j] 
            mat[i][j] = mat[j][i] 
            mat[j][i] = temp 
  
# function to sort  
# the matrix row-wise 
# and column-wise 
def sortMatRowAndColWise(mat, n): 
  
    # sort rows of mat[][] 
    sortByRow(mat, n, True) 
   
    # get transpose of mat[][] 
    transpose(mat, n) 
   
    # again sort rows of  
    # mat[][] in descending 
    # order. 
    sortByRow(mat, n, False) 
   
    # again get transpose of mat[][] 
    transpose(mat, n) 
   
# function to print the matrix 
def printMat(mat, n): 
  
    for i in range(n): 
        for j in range(n): 
            print(mat[i][j] , " ", end="") 
        print() 
  
#Driver code 
n = 3
       
mat = [[3, 2, 1], 
    [9, 8, 7],  
    [6, 5, 4]] 
   
print("Original Matrix:") 
printMat(mat, n) 
   
sortMatRowAndColWise(mat, n) 
   
print("Matrix After Sorting:") 
printMat(mat, n) 
  
# This code is contributed 
# by Anant Agarwal. 

