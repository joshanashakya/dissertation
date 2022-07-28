

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG  
{ 
  
static int MAX = 50; 
  
// Function to print the matrix after 
// ignoring first x rows and columns 
static void remove_row_col(int arr[][], int n, int x) 
{ 
  
    // Ignore first x rows and columns 
    for (int i = x; i < n; i++)  
    { 
        for (int j = x; j < n; j++) 
        { 
            System.out.print( arr[i][j] + " "); 
        } 
        System.out.println(); 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    // Order of the square matrix 
    int n = 3; 
    int arr[][] = { { 1, 2, 3 }, 
                    { 4, 5, 6 }, 
                    { 7, 8, 9 } }; 
  
    int x = 1; 
    remove_row_col(arr, n, x); 
} 
} 
  
// This code is contributed by  
// shk 

