

# Python3 program to traverse a 
# m x n matrix in L shape. 
  
# Printing matrix in L shape 
def traverseLshape(a, n, m): 
      
    # for each column or each L shape 
    for j in range(0, m): 
  
        # traversing vertically 
        for i in range(0, n - j): 
            print(a[i][j], end = " "); 
  
        # traverse horizontally 
        for k in range(j + 1, m): 
            print(a[n - 1 - j][k], end = " "); 
  
# Driven Code 
if __name__ == '__main__': 
    n = 4; 
    m = 3; 
    a = [[1, 2, 3], 
         [4, 5, 6], 
         [7, 8, 9], 
         [10, 11, 12]]; 
    traverseLshape(a, n, m); 
  
# This code is contributed by PrinciRaj1992 

