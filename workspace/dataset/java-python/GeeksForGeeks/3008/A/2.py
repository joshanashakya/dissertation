

# Python3 implementation of the apporach 
  
N = 3
  
# Function to return the minimum steps 
# required to convert the given matrix 
# to a Diagonally Dominant Matrix 
def findStepsForDDM(arr): 
  
    result = 0
  
    # For each row 
    for i in range(N): 
  
        # To store the sum of the current row 
        sum = 0
        for j in range(N): 
            sum += abs(arr[i][j]) 
  
        # Remove the element of the current row 
        # which lies on the main diagonal 
        sum -= abs(arr[i][i]) 
  
        # Checking if the diagonal element is less 
        # than the sum of non-diagonal element 
        # then add their difference to the result 
        if (abs(arr[i][i]) < abs(sum)): 
            result += abs(abs(arr[i][i]) - abs(sum)) 
  
    return result 
  
# Driver code 
  
arr= [ [ 3, -2, 1 ], 
    [ 1, -3, 2 ], 
    [ -1, 2, 4 ] ] 
  
print(findStepsForDDM(arr)) 
  
# This code is contributed by mohit kumar 29 

