

# Python3 implementation of above approach 
  
# Function to return the count of  
# total positions the Bishop  
# can visit in a single move 
def countSquares(row, column): 
      
    # Count top left squares 
    topLeft = min(row, column) - 1
      
    # Count bottom right squares 
    bottomRight = 8 - max(row, column) 
      
    # Count top right squares 
    topRight = min(row, 9-column) -1
      
    # Count bottom left squares 
    bottomLeft = 8 - max(row, 9-column)  
  
      
    # Return total count 
    return (topLeft + topRight + bottomRight + bottomLeft) 
  
# Driver code 
  
# Bishop's Position  
row = 4
column = 4
  
print(countSquares(row, column)) 

