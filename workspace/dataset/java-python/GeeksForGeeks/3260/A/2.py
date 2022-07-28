

# Python Program to read a suare matrix 
# and prthe main diagonal elements 
  
if __name__ == '__main__': 
  
    matrix = [[0 for i in range(5)] for j in range(5)] 
    x, size = 0, 5; 
  
    # Get the square matrix 
    for row_index in range(size): 
        for column_index in range(size): 
            x += 1; 
            matrix[row_index][column_index] = x; 
  
    # Display the matrix 
    print("The matrix is"); 
    for row_index in range(size): 
        for column_index in range(size): 
            print( matrix[row_index][column_index],end = "\t"); 
  
        print(""); 
  
    # Prthe main diagonal elements 
    print("\nMain diagonal elements are:"); 
  
    for row_index in range(size): 
        for column_index in range(size): 
  
            # check for main diagonal elements 
            if (row_index == column_index): 
                print(matrix[row_index][column_index], end="\t"); 
  
# This code is contributed by 29AjayKumar 

