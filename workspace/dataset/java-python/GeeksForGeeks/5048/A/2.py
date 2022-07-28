

n = 3
  
# Function to pre-compute the xor 
def preComputeXor(arr, prefix_xor): 
      
    # Left to right prefix xor 
    # for each row 
    for i in range(n): 
        for j in range(n): 
            if (j == 0): 
                prefix_xor[i][j] = arr[i][j] 
            else: 
                prefix_xor[i][j] = (prefix_xor[i][j - 1] ^  
                                               arr[i][j]) 
  
    # Top to bottom prefix xor 
    # for each column 
    for i in range(n): 
        for j in range(1, n): 
            prefix_xor[j][i] = (prefix_xor[j - 1][i] ^  
                                    prefix_xor[j][i]) 
  
# Function to process the queries 
# x1, x2, y1, y2 represent the 
# positions of the top-left 
# and bottom right corners 
def ansQuerie(prefix_xor, x1, y1, x2, y2): 
  
    # To store the xor values 
    xor_1, xor_2, xor_3 = 0, 0, 0
  
    # Finding the values we need to xor 
    # with value at (x2, y2) in prefix-xor 
    # matrix 
    if (x1 != 0): 
        xor_1 = prefix_xor[x1 - 1][y2] 
    if (y1 != 0): 
        xor_2 = prefix_xor[x2][y1 - 1] 
    if (x1 != 0 and y1 != 0): 
        xor_3 = prefix_xor[x1 - 1][y1 - 1] 
  
    # Return the required prefix xor 
    return ((prefix_xor[x2][y2] ^ xor_1) ^  
                         (xor_2 ^ xor_3)) 
  
  
# Driver code 
arr = [[ 1, 2, 3 ], 
       [ 4, 5, 6 ], 
       [ 7, 8, 9 ]] 
  
# To store pre-computed xor 
prefix_xor = [[0 for i in range(n)] 
                 for i in range(n)] 
  
# Pre-computing xor 
preComputeXor(arr, prefix_xor) 
  
# Queries 
print(ansQuerie(prefix_xor, 1, 1, 2, 2)) 
print(ansQuerie(prefix_xor, 1, 2, 2, 2)) 
  
# This code is contributed by Mohit Kumar 

