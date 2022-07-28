

# Program to check matrix 
# is scalar matrix or not. 
  
  
N = 4
  
# Function to check matrix is 
# scalar matrix or not. 
def isScalarMatrix(mat) : 
      
    # Check all elements  
    # except main diagonal are 
    # zero or not. 
    for i in range(0,N) : 
        for j in range(0,N) : 
            if ((i != j)  
               and (mat[i][j] != 0)) : 
                return False
   
    # Check all diagonal 
    # elements are same or not. 
    for i in range(0,N-1) : 
        if (mat[i][i] !=
           mat[i + 1][i + 1]) : 
            return False
  
    return True
  
  
# Driver function 
mat = [[ 2, 0, 0, 0 ], 
       [ 0, 2, 0, 0 ], 
       [ 0, 0, 2, 0 ], 
       [ 0, 0, 0, 2 ]] 
  
# Function call 
if (isScalarMatrix(mat)): 
    print("Yes") 
else : 
    print("No") 
      
      
# This code is contributed by 
# Nikita tiwari. 

