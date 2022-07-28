

# Python3 program to Count number of rows  
# and columns having sum is equal to sum   
# of any diagonal in matrix 
n = 4
  
# Function to count number of rows 
# countnd columns whose sum is equal 
# to sum of any diagonal 
def count(arr): 
    diag1 = 0; diag2 = 0; row = 0
    col = 0; count = 0; j = n - 1
      
    for i in range(n): 
      
        # sum of principle diagonal 
        diag1 += arr[i][i] 
  
        # sum of secondary diagonal 
        diag2 += arr[i][j] 
        j -= 1
      
  
    # Find the sum of individual 
    # row and column 
    for i in range(n): 
        row = 0; col = 0
          
        for j in range(n): 
            row += arr[i][j] 
          
        for j in range(n): 
            col +=  arr[j][i] 
          
        if ((row == diag1) or (row == diag2)): 
            count += 1
          
        if ((col == diag1) or (col == diag2)): 
            count += 1
      
    return count 
  
# Driver code 
  
arr = [[ 7, 2, 3, 5 ], 
      [ 4, 5, 6, 3 ], 
      [ 7, 9, 10, 12 ], 
      [ 1, 5, 4, 3 ] ]  
print(count(arr)) 
  
# This code is contributed by Anant Agarwal. 

