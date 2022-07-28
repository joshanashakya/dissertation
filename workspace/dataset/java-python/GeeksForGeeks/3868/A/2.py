

# Python3 program to implement 
# the above approach 
N = 2
M = 3
  
# Function to check if a number from every row  
# can be selected such that xor of the numbers  
# is greater than zero 
def check(mat): 
  
    xorr = 0
  
    # Find the xor of first 
    # column for every row 
    for i in range(N): 
        xorr ^= mat[i][0] 
  
    # If Xorr is 0 
    if (xorr != 0): 
        return True
  
    # Traverse in the matrix 
    for i in range(N): 
        for j in range(1, M): 
  
            # Check is atleast 
            # 2 distinct elements 
            if (mat[i][j] != mat[i][0]): 
                return True
          
    return False
  
# Driver code 
mat = [[ 7, 7, 7 ], 
       [ 10, 10, 7 ]] 
  
if (check(mat)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 

