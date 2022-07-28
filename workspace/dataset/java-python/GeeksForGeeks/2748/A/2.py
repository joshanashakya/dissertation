

# Python3 implementation of the approach 
from math import sqrt 
row = 2
col = 2
  
# Function to return the Frobenius 
# Norm of the given matrix 
def frobeniusNorm(mat): 
  
    # To store the sum of squares of the 
    # elements of the given matrix 
    sumSq = 0
    for i in range(row): 
        for j in range(col): 
            sumSq += pow(mat[i][j], 2) 
  
    # Return the square root of 
    # the sum of squares 
    res = sqrt(sumSq) 
    return round(res, 5) 
  
# Driver code 
  
mat = [ [ 1, 2 ], [ 3, 4 ] ] 
  
print(frobeniusNorm(mat)) 
  
# This code is contributed by mohit kumar 29 

