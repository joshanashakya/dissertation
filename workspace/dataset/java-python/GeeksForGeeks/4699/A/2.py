

# Python3 Program to check if a 
# given matrix is Bisymmetric 
# matrix 
  
# Return if the given matrix 
# is Bisymmetric matrix 
def checkBisymmetric(m, n) : 
      
    # Checking Across  
    # Forward Diagonal 
    for i in range(0, n) : 
        for j in range(0, i) :  
            # check if corresponding  
            # position element are equal. 
            if (m[i][j] != m[j][i]) :  
                return false              
  
    # Backward Diagonal 
    for i in range(0, n) :  
        # for each column,  
        # upto main diagonal 
        for j in range(0, n - i) :  
              
            # check if corresponding  
            # position element are  
            # equal. 
            if (m[i][j] != 
             m[n - j - 1][n - i - 1]) : 
                return False
    return True; 
  
# Driven Code 
n = 3; 
m = [[ 1, 2, 3 ], 
     [ 2, 5, 2 ], 
     [ 3, 2, 1 ]] 
  
if(checkBisymmetric(m, n)) : 
    print ("Yes")  
else : 
    print ("No") 
  
# This code is contributed by  
# Manish Shaw (manishshaw1) 

