

# Python3 program to distribute a  
# square matrix into symmetric 
# and skew symmetric matrix. 
N = 3; 
  
def printMatrix(mat): 
  
    for i in range(N): 
        for j in range(N): 
            print(mat[i][j], end = " "); 
        print(""); 
  
def printDistribution(mat): 
      
    # tr is the transpose 
    # of matrix mat. 
    tr = [[0 for x in range(N)]  
             for y in range(N)]; 
  
    # Find transpose of matrix. 
    for i in range(N): 
        for j in range(N): 
            tr[i][j] = mat[j][i]; 
  
    # Declare two square  
    # matrix symm and 
    # skewsymm of size N. 
    symm = [[0 for x in range(N)]  
               for y in range(N)] ; 
    skewsymm = [[0 for x in range(N)]  
                   for y in range(N)]; 
  
    # Loop to find symmetric  
    # and skew symmetric and  
    # store it into symm and  
    # skewsymm matrix. 
    for i in range(N): 
        for j in range(N):  
            symm[i][j] = (mat[i][j] + tr[i][j]) / 2; 
            skewsymm[i][j] = (mat[i][j] - tr[i][j]) / 2; 
  
    print("Symmetric matrix-"); 
    printMatrix(symm); 
  
    print("Skew Symmetric matrix"); 
    printMatrix(skewsymm); 
  
# Driver Code 
  
# mat is the N * N  
# square matrix. 
mat = [[2, -2, -4], [-1, 3, 4], [1, -2, -3]]; 
printDistribution(mat); 
  
# This code is contributed by mits. 

