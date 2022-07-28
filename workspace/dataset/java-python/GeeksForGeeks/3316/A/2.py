

# Python3 code to find minimum flip 
# required to make Binary Matrix  
# symmetric along main diagonal 
N = 3
  
# Return the minimum flip required  
# to make Binary Matrix symmetric 
# along main diagonal. 
def minimumflip(mat, n): 
      
    transpose =[[0] * n] * n 
      
    # finding the transpose of the matrix 
    for i in range(n): 
        for j in range(n): 
            transpose[i][j] = mat[j][i] 
      
    # Finding the number of position  
    # where element are not same. 
    flip = 0
    for i in range(n): 
        for j in range(n): 
            if transpose[i][j] != mat[i][j]: 
                flip += 1
      
    return int(flip / 2) 
      
# Driver Program 
n = 3
mat =[[ 0, 0, 1], 
      [ 1, 1, 1], 
      [ 1, 0, 0]] 
print( minimumflip(mat, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

