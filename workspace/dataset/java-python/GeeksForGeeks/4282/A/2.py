

# Python 3 Program to Check  
# if the given chessboard 
# is valid or not 
MAX = 2
  
# Check if the given chess 
# board is valid or not. 
def isValid(c, n) : 
  
    X = [ 0, -1, 0, 1] 
    Y = [ 1, 0, -1, 0] 
    isValid = True
  
    # Traversing each cell  
    # of the chess board.  
    for i in range(n) : 
        for j in range(n) : 
              
            # for each adjacent cells 
            for k in range(n) : 
                newX = i + X[k] 
                newY = j + Y[k] 
  
                # checking if they have 
                # different color  
                if (newX < n and newY < n and 
                    newX >= 0 and newY >= 0 and 
                    c[newX][newY] == c[i][j]) : 
                    isValid = false 
  
    return isValid 
      
# Driver Code 
if __name__ == "__main__" : 
    n = 2
    c = [ [1, 0], 
          [0, 1] ] 
  
    if isValid(c, n) : 
        print("Yes") 
  
    else : 
        print("No") 
                      
# This code is contributed  
# by ANKITRAI1 

