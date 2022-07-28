

# Python 3 program for left rotation of matrix by 180 
   
R = 4
C = 4
   
# Function to rotate the matrix by 180 degree 
def reverseColumns(arr): 
    for i in range(C): 
        j = 0
        k = C-1
        while j < k: 
            t = arr[j][i] 
            arr[j][i] = arr[k][i] 
            arr[k][i] = t 
            j += 1
            k -= 1
              
# Function for transpose of matrix 
def transpose(arr): 
    for i in range(R): 
        for j in range(i, C): 
            t = arr[i][j] 
            arr[i][j] = arr[j][i] 
            arr[j][i] = t 
   
# Function for display the matrix 
def printMatrix(arr): 
    for i in range(R): 
        for j in range(C): 
            print(arr[i][j], end = " "); 
        print(); 
   
# Function to anticlockwise rotate matrix 
# by 180 degree 
def rotate180(arr): 
    transpose(arr); 
    reverseColumns(arr); 
    transpose(arr); 
    reverseColumns(arr); 
   
# Driven code 
arr = [ [ 1, 2, 3, 4 ], 
        [ 5, 6, 7, 8 ], 
        [9, 10, 11, 12 ], 
        [13, 14, 15, 16 ] ]; 
rotate180(arr); 
printMatrix(arr); 

