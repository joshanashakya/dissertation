

# Python Program to prthe Diagonals of a Matrix  
MAX = 100; 
  
# Function to prthe Principal Diagonal 
def printPrincipalDiagonal(mat, n): 
    print("Principal Diagonal: ", end = ""); 
  
    for i in range(n): 
  
        # Condition for principal diagonal 
        print(mat[i][i], end= ", "); 
      
    print(); 
  
# Function to prthe Secondary Diagonal 
def printSecondaryDiagonal(mat, n): 
    print("Secondary Diagonal: ", end = ""); 
  
    for i in range(n): 
  
        # Condition for secondary diagonal 
        print(mat[i][n - i - 1], end = ", "); 
      
    print(); 
  
# Driver code 
if __name__ == '__main__': 
    n = 4; 
    a = [[ 1, 2, 3, 4 ], 
        [ 5, 6, 7, 8 ], 
        [ 1, 2, 3, 4 ], 
        [ 5, 6, 7, 8 ]]; 
  
    printPrincipalDiagonal(a, n); 
    printSecondaryDiagonal(a, n); 
  
# This code is contributed by PrinciRaj1992 

