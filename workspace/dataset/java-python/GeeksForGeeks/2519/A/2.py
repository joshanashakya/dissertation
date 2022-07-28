

# Python program to make  
# the array elements equal 
# in minimum steps 
  
# Returns the minumum steps  
# required to make an array  
# of N elements equal, where 
# the first array element  
# equals M 
def steps(N, M): 
  
    # Corner Case 1: When N = 1 
    if (N == 1): 
        return 0
  
    # Corner Case 2: When N = 2 
    elif(N == 2):  
        return M 
  
    return 2 * M + (N - 3) 
  
# Driver Code 
N = 4
M = 4
print(steps(N,M)) 
  
# This code is contributed 
# by Shivi_Aggarwal. 

