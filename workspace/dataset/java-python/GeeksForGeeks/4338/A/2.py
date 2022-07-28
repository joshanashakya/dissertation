

# Python3 program to find the XOR of  
# XOR's of all submatrices 
  
# Function to find to required 
# XOR value 
def submatrixXor(arr, n): 
  
    ans = 0
  
    # Nested loop to find the 
    # number of sub-matrix each 
    # index belongs to 
    for i in range(0, n): 
        for j in range(0, n): 
  
            # Number of ways to choose 
            # from top-left elements 
            top_left = (i + 1) * (j + 1) 
  
            # Number of ways to choose 
            # from bottom-right elements 
            bottom_right = (n - i) * (n - j) 
            if (top_left % 2 == 1 and 
                bottom_right % 2 == 1): 
                ans = (ans ^ arr[i][j]) 
    return ans 
  
# Driver code 
n = 3
arr = [[6, 7, 13], 
       [8, 3, 4], 
       [9, 7, 6]] 
print(submatrixXor(arr, n)) 
  
# This code is contributed by Shrikant13 

