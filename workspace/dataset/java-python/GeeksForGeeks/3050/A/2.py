

# Python3 implementation of above approach  
  
# Function to return the number of  
# squares that the king can reach  
# in the given number of moves  
def Square(row, column, moves) : 
      
    a = 0; b = 0; c = 0;  
    d = 0; total = 0;  
  
    # Calculate initial and final  
    # coordinates  
    a = row - moves;  
    b = row + moves;  
    c = column - moves;  
    d = column + moves;  
  
    # Since chessboard is of size 8X8  
    # so if any coordinate is less than  
    # 1 or greater than 8 make it 1 or 8.  
    if (a < 1) : 
        a = 1;  
    if (c < 1) :  
        c = 1;  
    if (b > 8) : 
        b = 8;  
    if (d > 8) : 
        d = 8;  
  
    # Calculate total positions  
    total = (b - a + 1) * (d - c + 1) - 1;  
    return total;  
  
# Driver code  
if __name__ == "__main__" : 
  
    R = 4; C = 5; M = 2;  
    print(Square(R, C, M));  
      
# This code is contributed by Ryuga 

