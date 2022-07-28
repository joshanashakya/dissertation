

# Python3 program to find common  
# elements in two diagonals. 
  
Max = 100
  
# Returns count of row wise same 
# elements in two diagonals of 
# mat[n][n] 
def countCommon(mat, n): 
    res = 0
      
    for i in range(n): 
          
        if mat[i][i] == mat[i][n-i-1] : 
            res = res + 1
    return res      
  
# Driver Code 
mat = [[1, 2, 3], 
       [4, 5, 6], 
       [7, 8, 9]] 
  
print(countCommon(mat, 3)) 
  
# This code is contributed by Anant Agarwal. 

