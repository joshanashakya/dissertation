

# Python3 program for checking if a king  
# can move a valid move or not when  
# N nights are there in a modified chessboard  
  
def checkCheckMate(a, n, kx, ky):  
  
    # Pair of hash to mark the coordinates  
    mpp = {}  
  
    # iterate for Given N knights  
    for i in range(0, n):  
        x = a[i][0]  
        y = a[i][1]  
  
        # mark all the "L" shaped coordinates  
        # that can be reached by a Knight  
  
        # initial position  
        mpp[(x, y)] = 1
  
        # 1-st move  
        mpp[(x - 2, y + 1)] = 1
  
        # 2-nd move  
        mpp[(x - 2, y - 1)] = 1
  
        # 3-rd move  
        mpp[(x + 1, y + 2)] = 1
  
        # 4-th move  
        mpp[(x + 1, y - 2)] = 1
  
        # 5-th move  
        mpp[(x - 1, y + 2)] = 1
  
        # 6-th move  
        mpp[(x + 2, y + 1)] = 1
  
        # 7-th move  
        mpp[(x + 2, y - 1)] = 1
  
        # 8-th move  
        mpp[(x - 1, y - 2)] = 1
      
    # iterate for all possible 8 coordinates  
    for i in range(-1, 2):  
        for j in range(-1, 2):  
            nx = kx + i  
            ny = ky + j  
              
            if i != 0 and j != 0:  
                  
                # check a move can be made or not  
                if not mpp[(nx, ny)]:  
                    return True
      
    # any moves  
    return False
  
# Driver Code  
if __name__ == "__main__":  
  
    a = [[1, 0], [0, 2], [2, 5],  
         [4, 4], [5, 0], [6, 2]]  
  
    n = len(a)  
    x, y = 3, 2
      
    if checkCheckMate(a, n, x, y):  
        print("Not Checkmate!")  
    else: 
        print("Yes its checkmate!") 
  
# This code is contributed by Rituraj Jain 

