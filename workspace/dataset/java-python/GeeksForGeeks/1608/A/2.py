

# Python3 program to find the maximum  
# element of each column 
MAX = 100
  
# function to find the maximum 
# elements of each column 
def largestInColumn(mat, rows, cols): 
    for i in range(cols): 
          
        # initialize the maximum element with 0 
        maxm = mat[0][i] 
        # run the inner loop for news 
        for j in range(rows): 
              
            # check if any elements is greater  
            # than the maximum elements 
            # of the cloumn and replace it 
            if mat[j][i] > maxm: 
                maxm = mat[j][i] 
          
        # print the largest element 
        # of the column 
        print(maxm) 
  
# Driver code 
n, m = 4, 4
mat = [[3, 4, 1, 8], 
       [1, 4, 9, 11], 
       [76, 34, 21, 1], 
       [2, 1, 4, 5]] 
      
largestInColumn(mat, n, m);  
  
# This code is contributed  
# by Mohit kumar 29 (IIIT gwalior) 

