

# Python 3 program to find 
# minimum operations required 
# to set all the element of 
# binary matrix 
  
# Return minimum operation  
# required to make all 1s. 
def minOperation(arr): 
    ans = 0
    for i in range(N - 1, -1, -1): 
        for j in range(M - 1, -1, -1): 
              
            # check if this  
            # cell equals 0 
            if(arr[i][j] == 0): 
      
                # increase the 
                # number of moves 
                ans += 1
  
                # flip from this cell  
                # to the start point 
                for k in range(i + 1): 
                    for h in range(j + 1): 
                      
                        # flip the cell 
                        if (arr[k][h] == 1): 
                            arr[k][h] = 0
                        else: 
                            arr[k][h] = 1
                      
    return ans 
  
# Driver Code 
mat = [[ 0, 0, 1, 1, 1], 
       [0, 0, 0, 1, 1], 
       [0, 0, 0, 1, 1], 
       [1, 1, 1, 1, 1], 
       [1, 1, 1, 1, 1]] 
M = 5
N = 5
  
print(minOperation(mat)) 
  
# This code is contributed 
# by ChitraNayal 

