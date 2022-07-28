

// Java program to traverse the matrix recursively 
class GFG { 
      
    final static int N = 2; 
    final static int  M = 3; 
      
    // Function to traverse the matrix recursively 
    static int traverseMatrix(int arr[][], int current_row, 
                       int current_col) 
    { 
        // If the entire column is traversed 
        if (current_col >= M) 
            return 0; 
      
        // If the entire row is traversed 
        if (current_row >= N) 
            return 1; 
      
        // Print the value of the current 
        // cell of the matrix 
        System.out.print(arr[current_row][current_col] + ", "); 
      
        // Recursive call to traverse the matrix 
        // in the Horizontal direction 
        if (traverseMatrix(arr, current_row, 
                           current_col + 1) 
            == 1) 
            return 1; 
      
        // Recursive call for changing the 
        // Row of the matrix 
        return traverseMatrix(arr, 
                              current_row + 1, 
                              0); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int arr[][] = { { 1, 2, 3 }, 
                          { 4, 5, 6 } }; 
      
        traverseMatrix(arr, 0, 0); 
    } 
} 
  
// This code is contributed by AnkitRai01 

