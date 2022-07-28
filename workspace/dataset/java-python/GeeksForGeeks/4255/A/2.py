

# Python3 implementation of the approach  
  
# Function to print the matrix after  
# ignoring first x rows and columns  
def remove_row_col(arr, n, x):  
  
    # Ignore first x rows and columns  
    for i in range(x, n):  
        for j in range(x, n):  
            print(arr[i][j], end = " ")  
          
        print() 
  
# Driver Code  
if __name__ == "__main__": 
  
    # Order of the square matrix  
    n = 3
    MAX = 50
    arr = [[1, 2, 3],  
           [4, 5, 6],  
           [7, 8, 9]]  
  
    x = 1
    remove_row_col(arr, n, x)  
      
# This code is contributed by Rituraj Jain 

