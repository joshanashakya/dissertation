

# Python 3 implementation of the approach 
import sys 
  
# Function to return the minimum flips 
# required such that the submatrix from 
# mat[i][j] to mat[i + 1][j + 1] 
# contains all equal elements 
def minFlipsSub(mat, i, j): 
    cnt0 = 0
    cnt1 = 0
  
    if (mat[i][j] == '1'): 
        cnt1 += 1
    else: 
        cnt0 += 1
  
    if (mat[i][j + 1] == '1'): 
        cnt1 += 1
    else: 
        cnt0 += 1
  
    if (mat[i + 1][j] == '1'): 
        cnt1 += 1
    else: 
        cnt0 += 1
  
    if (mat[i + 1][j + 1] == '1'): 
        cnt1 += 1
    else: 
        cnt0 += 1
  
    return min(cnt0, cnt1) 
  
# Function to return the minimum number 
# of slips required such that the matrix 
# contains at least a single submatrix 
# of size 2*2 with all equal elements 
def minFlips(mat, r, c): 
      
    # To store the result 
    res = sys.maxsize 
  
    # For every submatrix of size 2*2 
    for i in range(r - 1): 
        for j in range(c - 1): 
              
            # Update the count of flips required 
            # for the current submatrix 
            res = min(res, minFlipsSub(mat, i, j)) 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    mat = ["0101", "0101", "0101"] 
    r = len(mat) 
    c = len(mat[0]) 
  
    print(minFlips(mat, r, c)) 
      
# This code is contributed by Surendra_Gangwar 

