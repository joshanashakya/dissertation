

# Python 3 program to Find the minimum number of moves required to  
# reach the destination by the king in a chess board 
  
# function to Find the minimum number of moves required to  
# reach the destination by the king in a chess board 
def MinSteps(SourceX, SourceY, DestX, DestY): 
    # minimum number of steps 
    print(max(abs(SourceX - DestX), abs(SourceY - DestY))) 
  
    # while the king is not in the same row or column  
    # as the destination 
    while ((SourceX != DestX) or (SourceY != DestY)): 
        # Go up 
        if (SourceX < DestX): 
            print('U',end = "") 
            SourceX += 1
          
        # Go down 
        if (SourceX > DestX): 
            print('D',end = "") 
            SourceX -= 1
          
        # Go left 
        if (SourceY > DestY): 
            print('L') 
            SourceY -= 1
          
        # Go right 
        if (SourceY < DestY): 
            print('R',end = "") 
            SourceY += 1
          
  
# Driver code 
if __name__ == '__main__': 
    sourceX = 4
    sourceY = 4
    destinationX = 7
    destinationY = 0
  
    MinSteps(sourceX, sourceY, destinationX, destinationY) 
  
# This code is contributed by 
# Surendra_Gangwar 

