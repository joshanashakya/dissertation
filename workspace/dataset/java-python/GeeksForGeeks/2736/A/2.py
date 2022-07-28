

# Python3 implementation of above approach  
  
# For maximum length of input string  
MAX = 10
  
# Declaring the DP table  
F = [[-1 for i in range(MAX)] 
         for j in range(MAX)]  
  
# Declaring the prefix array  
C = [None] * MAX
  
# Function to calculate the  
# number of valid assignments  
def noOfAssignments(S, n, i, c_x):  
  
    if F[i][c_x] != -1: 
        return F[i][c_x]  
  
    if i == n:  
  
        # Return 1 if X is balanced.  
        F[i][c_x] = not c_x  
        return F[i][c_x]  
  
    c_y = C[i] - c_x  
  
    # Increment the count  
    # if it is an opening bracket  
    if S[i] == '(': 
        F[i][c_x] = \ 
            noOfAssignments(S, n, i + 1, c_x + 1) + \ 
            noOfAssignments(S, n, i + 1, c_x)  
          
        return F[i][c_x]  
  
    F[i][c_x] = 0
  
    # Decrement the count if it is a closing bracket  
    if c_x: 
        F[i][c_x] += \ 
            noOfAssignments(S, n, i + 1, c_x - 1)  
  
    if c_y:  
        F[i][c_x] += \ 
            noOfAssignments(S, n, i + 1, c_x)  
  
    return F[i][c_x]  
  
# Driver code  
if __name__ == "__main__":  
  
    S = "()"
    n = len(S)  
  
    C[0] = 0
  
    # Creating the prefix array  
    for i in range(0, n):  
        if S[i] == '(': 
            C[i + 1] = C[i] + 1
        else: 
            C[i + 1] = C[i] - 1
  
    # Initial value for c_x and c_y is zero  
    print(noOfAssignments(S, n, 0, 0)) 
  
# This code is contributed by Rituraj Jain 

