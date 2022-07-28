

# Python3 implementation of above approach  
  
# For maximum length of input string  
MAX = 10
  
# Declaring the DP table  
F = [[[-1 for i in range(MAX)] 
          for j in range(MAX)]  
          for k in range(MAX)]  
  
# Function to calculate the number  
# of valid assignments  
def noOfAssignments(S, n, i, c_x, c_y):  
  
    if F[i][c_x][c_y] != -1:  
        return F[i][c_x][c_y]  
  
    if i == n: 
  
        # Return 1 if both subsequences are balanced  
        F[i][c_x][c_y] = not c_x and not c_y  
        return F[i][c_x][c_y]  
  
    # Increment the count if  
    # it is an opening bracket  
    if S[i] == '(':  
        F[i][c_x][c_y] = \ 
            noOfAssignments(S, n, i + 1, c_x + 1, c_y) + \ 
            noOfAssignments(S, n, i + 1, c_x, c_y + 1)  
          
        return F[i][c_x][c_y]  
  
    F[i][c_x][c_y] = 0
  
    # Decrement the count  
    # if it a closing bracket  
    if c_x: 
        F[i][c_x][c_y] += \ 
            noOfAssignments(S, n, i + 1, c_x - 1, c_y)  
  
    if c_y: 
        F[i][c_x][c_y] += \ 
            noOfAssignments(S, n, i + 1, c_x, c_y - 1)  
  
    return F[i][c_x][c_y]  
  
# Driver code  
if __name__ == "__main__": 
  
    S = "(())"
    n = len(S)  
  
    # Intitial value for c_x and c_y is zero  
    print(noOfAssignments(S, n, 0, 0, 0))  
  
# This code is contributed by Rituraj Jain 

