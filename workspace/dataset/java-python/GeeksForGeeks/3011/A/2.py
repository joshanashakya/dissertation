

# Python3 Program to check if matrix 
# is diagonal matrix or not. 
  
N = 4
  
# Function to check matrix 
# is diagonal matrix 
# or not.    
def isDiagonalMatrix(mat) : 
    for i in range(0, N): 
        for j in range(0, N) : 
              
            # condition to check 
            # other elements  
            # except main diagonal 
            # are zero or not. 
            if ((i != j) and
             (mat[i][j] != 0)) : 
                return False
  
    return True
  
  
# Driver function 
mat = [[ 4, 0, 0, 0 ], 
       [ 0, 7, 0, 0 ], 
       [ 0, 0, 5, 0 ], 
       [ 0, 0, 0, 1 ]] 
  
if (isDiagonalMatrix(mat)) : 
    print("Yes") 
else : 
    print("No") 
      
      
# This code is contributed by Nikita Tiwari. 

