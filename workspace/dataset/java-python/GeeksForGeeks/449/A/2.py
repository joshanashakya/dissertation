

# Python3 program to count number of zeros  
# surrounded by 1  
Row = 4
Col = 5
r = [0, 0, 1, -1 ] 
c = [1, -1, 0, 0 ] 
  
def isSafe(x, y, M): 
      
    if (x >= 0 and x < Row and y >= 0 and y < Col): 
        if M[x][y] == 0: 
            return True
      
    return False
  
# DFS function to mark all reachable cells from  
# (x, y)  
def DFS(x, y, M): 
      
    # make it's visited  
    M[x][y] = 1
    for k in range(4): 
        if (isSafe(x + r[k], y + c[k], M)): 
            DFS(x + r[k], y + c[k], M)  
  
# function return count of 0's which are surrounded by 1  
def CountAllZero(M): 
  
    # first we remove all zeros which are not  
    # surrounded by 1 that means we only remove  
    # those zeros which are reachable from  
    # any boundary of given matrix.  
    for i in range(Col): 
        if (M[0][i] == 0): 
            DFS(0, i, M)  
    for i in range(Col): 
        if (M[Row - 1][i] == 0): 
            DFS(Row - 1, i, M)  
    for i in range(Row):  
        if (M[i][0] == 0): 
            DFS(i, 0, M)  
    for i in range(Row):  
        if (M[i][Col - 1] == 0): 
            DFS(i, Col - 1, M)  
      
    # count all zeros which are surrounded by 1  
    result = 0
    for i in range(Row):  
        for j in range(Col): 
            if (M[i][j] == 0): 
                result += 1
      
    return result  
  
# Driver code  
M = [[1, 1, 1, 0, 1], [1, 0, 0, 1, 0 ],  
    [1, 0, 1, 0, 1] , [ 0, 1, 1, 1, 1 ]]  
print(CountAllZero(M)) 
  
# This code is conributed by shubhamsingh10 

