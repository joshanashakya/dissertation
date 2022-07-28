

# Python implementation to sort the  
# major diagonal of the matrix 
  
# Function to sort the major  
# diagonal of the matrix 
def sortDiagonal(a, M, N): 
      
    # Loop to find the ith minimum 
    # element from the major diagonal 
    for i in range(M): 
        sm = a[i][i] 
        pos = i 
          
        # Loop to find the minimum  
        # element from the unsorted matrix 
        for j in range(i + 1 , N): 
            if (sm > a[j][j]): 
                sm = a[j][j] 
                pos = j 
                  
        # Swap to put the minimum 
        # element at the begining of  
        # the major diagonal of matrix 
        a[i][i], a[pos][pos] = a[pos][pos] , a[i][i] 
          
    # Loop to prthe matrix 
    for i in range(M): 
        for j in range(N): 
            print(a[i][j],end=" ") 
        print() 
  
# Driven Code 
a = [[4, 2],[3, 1]] 
  
# Sort the major Diagonal 
sortDiagonal(a, 2, 2) 
  
# This code is contributed by shubhamsingh10 

