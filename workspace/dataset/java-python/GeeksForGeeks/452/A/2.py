

# Python 3 implementation of the approach 
  
# Function to return the count of  
# all identical rows 
def countIdenticalRows(mat): 
  
    count = 0
  
    for i in range(len(mat)): 
  
        # First element of current row 
        first = mat[i][0] 
        allSame = True
  
        # Compare every element of the current 
        # row with the first element of the row 
        for j in range(1, len(mat[i])): 
  
            # If any element is different 
            if (mat[i][j] != first): 
                allSame = False
                break
  
        # If all the elements of the 
        # current row were same 
        if (allSame): 
            count += 1
  
    return count 
  
# Driver code 
if __name__ == "__main__": 
      
    mat = [[ 1, 1, 2 ], 
           [2, 2, 2 ], 
           [5, 5, 2 ]] 
    print(countIdenticalRows(mat)) 
  
# This code is contributed by ita_c 

