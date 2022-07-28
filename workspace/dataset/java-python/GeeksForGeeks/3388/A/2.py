

# Python implementation of the above approach 
  
N = 4; 
  
# Function to find the sum of all diagonal 
# and Boundary elements 
def diagonalBoundarySum(arr): 
    requiredSum = 0; 
  
    # Traverse arr 
    # Loop from i to N-1 for rows 
    for i in range(N): 
  
        # Loop from j = N-1 for columns 
        for j in range(N): 
  
            # Condition for diagonal 
            # elements 
            if (i == j or (i + j) == N - 1): 
                requiredSum += arr[i][j]; 
              
            # Condition for Boundary 
            # elements 
            elif(i == 0 or j == 0 or i == N - 1 or j == N - 1): 
                requiredSum += arr[i][j]; 
  
    # Prthe final Sum 
    print(requiredSum); 
  
  
# Driver Code 
if __name__ == '__main__': 
    arr = [[ 1, 2, 3, 4 ], 
    [ 1, 2, 3, 4 ], 
    [ 1, 2, 3, 4 ], 
    [ 1, 2, 3, 4 ]]; 
  
    diagonalBoundarySum(arr); 
  
# This code is contributed by 29AjayKumar 

