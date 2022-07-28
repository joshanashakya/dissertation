

# Python3 program find the count of 
# mountains in a given Matrix 
MAX = 100
  
# Function to count number of mountains 
# in a given matrix of size n 
def countMountains(a, n): 
    A = [[0 for i in range(n+2)] for i in range(n+2)] 
    count = 0
  
    # form another matrix with one extra 
    # layer of border elements. Border 
    # elements will contain INT_MIN value. 
    for i in range(n+2): 
        for j in range(n+2):  
            if ((i == 0) or (j == 0) or 
                (i == n + 1) or (j == n + 1)): 
  
                # For border elements, 
                # set value as INT_MIN 
                A[i][j] = float('-inf') 
            else: 
  
                # For rest elements, just copy 
                # it into new matrix 
                A[i][j] = a[i - 1][j - 1] 
              
    # Check for mountains in the modified matrix 
    for i in range(n + 1): 
        for j in range(n + 1):  
            if ((A[i][j] > A[i - 1][j]) and 
                (A[i][j] > A[i + 1][j]) and 
                (A[i][j] > A[i][j - 1]) and 
                (A[i][j] > A[i][j + 1]) and 
                (A[i][j] > A[i - 1][j - 1]) and 
                (A[i][j] > A[i + 1][j + 1]) and 
                (A[i][j] > A[i - 1][j + 1]) and 
                (A[i][j] > A[i + 1][j - 1])): 
                count = count + 1
  
    return count 
  
# Driver code 
a = [ [ 1, 2, 3 ], 
    [ 4, 5, 6 ], 
    [ 7, 8, 9 ] ] 
  
n = 3
  
print(countMountains(a, n)) 
  
# This code is contributed by Sanjit_Prasad 

