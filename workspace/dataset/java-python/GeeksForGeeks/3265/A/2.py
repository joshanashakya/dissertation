

# Python3 Program to read a suare matrix 
# and prthe Boundary Elements 
if __name__ == '__main__': 
  
    matrix = [[0 for i in range(5)] for j in range(5)] 
    row_index, column_index, x, size = 0, 0, 0, 5; 
  
    # Get the square matrix 
    for row_index in range(size): 
        for column_index in range(size): 
            x += 1; 
            matrix[row_index][column_index] = x; 
  
    # Display the matrix 
    print("The matrix is"); 
    for row_index in range(size): 
        for column_index in range(size): 
            print(matrix[row_index] 
                        [column_index], end = "\t"); 
        print(""); 
  
    # Prthe Boundary elements 
    print("\nBoundary Elements are:"); 
  
    for row_index in range(size): 
        for column_index in range(size): 
  
            # check for boundary elements 
            if ((row_index == 0 or 
                row_index == size - 1 \ 
                or column_index == 0 or 
                column_index == size - 1)): 
                print(matrix[row_index] 
                            [column_index], end = ", "); 
  
# This code is contributed by 29AjayKumar 

