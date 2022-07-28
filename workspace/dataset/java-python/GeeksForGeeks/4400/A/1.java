

// Java program to Count number of rows and 
// columns having sum is equal to sum of 
// any diagonal in matrix 
  
import java.io.*; 
  
class GFG { 
  
    static int n = 4; 
      
    // function to count number of rows countnd  
    // columns whose sum is equal to sum of any 
    // diagonal 
    static int count(int arr[][]) 
    { 
          
        int diag1 = 0, diag2 = 0; 
        int row = 0, col = 0, count = 0; 
  
        for (int i = 0, j = n - 1; i < n; i++, j--)  
        { 
              
            // sum of principle diagonal 
            diag1 += arr[i][i]; 
  
            // sum of secondary diagonal 
            diag2 += arr[i][j]; 
        } 
  
        // Find the sum of individual 
        // row and column 
        for (int i = 0; i < n; i++) { 
            row = 0; 
            col = 0; 
  
            for (int j = 0; j < n; j++) { 
                row = row + arr[i][j]; 
            } 
              
            for (int j = 0; j < n; j++) { 
                col = col + arr[j][i]; 
            } 
              
            if ((row == diag1) || (row == diag2))  
                count++; 
              
            if ((col == diag1) || (col == diag2)) 
                count++; 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[][] = {{7, 2, 3, 5}, 
                        {4, 5, 6, 3}, 
                        {7, 9, 10, 12}, 
                        {1, 5, 4, 3}}; 
                          
        System.out.println(count(arr)); 
    } 
} 
  
// This code is contributed by vt_m. 

