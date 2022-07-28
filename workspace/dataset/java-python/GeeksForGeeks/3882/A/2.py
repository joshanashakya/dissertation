

# Python 3 program to check for pairs  
# with given difference exits in the  
# matrix or not  
N = 4
M = 4
  
# function to check if a pair with given 
# difference exist in the matrix 
def isPairWithDiff(mat, k): 
      
    # store elements in a hash 
    s = dict() 
      
    # store elements in dict  
    for i in range(N): 
        for j in range(M): 
            s[mat[i][j]] = 1
      
    # looping through elements id present 
    # int the matrix return true 
    for i in range(N): 
        for j in range(M): 
            if k + mat[i][j] in s: 
                return True
      
    return False        
      
# Driver code 
n, m = 4, 4
mat = [[5, 2, 3, 4], 
       [5, 6, 7, 8], 
       [9, 10, 11, 12], 
       [13, 14, 15, 100]] 
      
# given difference 
k = 85
  
if isPairWithDiff(mat, k): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by 
# Mohit kumar 29 (IIIT gwalior) 

