

# Python 3 program to find max possible  
# side-length of a square in a given matrix 
  
n = 5
  
# Function to return side-length of square 
def largestSideLen(matrix): 
    result = 1
  
    # Traverse the matrix 
    for i in range(int(n / 2)): 
        element = matrix[i][i] 
        isSquare = 1
  
        for j in range(i, n - i): 
              
            # for row i 
            if (matrix[i][j] != element): 
                isSquare = 0
                  
            # for row n-i-1 
            if (matrix[n - i - 1][j] != element): 
                isSquare = 0
                  
            # for column i 
            if (matrix[j][i] != element): 
                isSquare = 0
                  
            # for column n-i-1 
            if (matrix[j][n - i - 1] != element): 
                isSquare = 0
  
        if (isSquare): 
            return n - 2 * i 
  
    # Return result 
    return result 
  
# Driver Code 
if __name__ == '__main__': 
    matrix = [[1, 1, 1, 1, 1], 
              [1, 2, 2, 2, 1], 
              [1, 2, 1, 2, 1], 
              [1, 2, 2, 2, 1], 
              [1, 1, 1, 1, 1]] 
  
    print(largestSideLen(matrix)) 
  
# This code is contributed by 
# Surendra_Gangwar 

