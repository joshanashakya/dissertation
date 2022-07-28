

// Java implementation to sort 
// the given matrix in strict order 
class GFG  
{ 
    // Function to sort the matrix 
    static void sortMat(int[][] data, int row, int col) 
    { 
  
        // Number of elements in matrix 
        int size = row * col; 
  
        // Loop to sort the matrix 
        // using Bubble Sort 
        for (int i = 0; i < size; i++) 
        { 
            for (int j = 0; j < size - 1; j++)  
            { 
  
                // Condition to check 
                // if the Adjacent elements 
                if (data[j / col][j % col] > data[(j + 1)  
                    / col][(j + 1) % col]) 
                { 
  
                    // Swap if previous value is greater 
                    int temp = data[j / col][j % col]; 
                    data[j / col][j % col] = data[(j + 1)  
                        / col][(j + 1) % col]; 
                    data[(j + 1) / col][(j + 1) % col] = temp; 
                } 
            } 
        } 
    } 
  
    static void printMat(int[][] mat, int row, int col) 
    { 
  
        // Loop to print the matrix 
        for (int i = 0; i < row; i++)  
        { 
            for (int j = 0; j < col; j++) 
            { 
                System.out.print(mat[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
          
        int[][] mat = { { 5, 4, 7 },  
                        { 1, 3, 8 }, 
                        { 2, 9, 6 } }; 
          
        int row = mat.length; 
        int col = mat[0].length; 
  
        // Function call to sort 
        sortMat(mat, row, col); 
  
        // Function call to 
        // print matrix 
        printMat(mat, row, col); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

