

# Python3 code to find minimum flip 
# required to make Binary Matrix 
# symmetric along main diagonal 
N = 3
  
# Return the minimum flip required 
# to make Binary Matrix symmetric  
# along main diagonal. 
def minimumflip( mat , n ): 
  
    # Comparing elements across diagonal 
    flip = 0
    for i in range(n): 
        for j in range(i): 
            if mat[i][j] != mat[j][i] : 
                flip += 1
      
    return flip 
  
# Driver Program 
n = 3
mat =[[ 0, 0, 1], 
      [ 1, 1, 1], 
      [ 1, 0, 0]] 
print( minimumflip(mat, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

