

# Python3 implementation of above apporach 
N = 4
  
# Function to count steps in 
# conversion of matrix into upper 
# Hessenberg matrix 
def stepsRequired(arr): 
    result = 0
    for i in range(N): 
        for j in range(N): 
            if (j > i + 1): 
                result += abs(arr[i][j]) 
    return result 
  
  
# Driver code 
arr = [[1, 2, 3, 2], 
        [3, 1, 0, 3], 
        [3, 2, 1, 3], 
        [-3, 4, 2, 1]] 
  
print(stepsRequired(arr)) 
  
# This code is contributed by mohit kumar 29  
  

