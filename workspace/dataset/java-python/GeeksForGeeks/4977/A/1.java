

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
static int m = 6, n = 4; 
  
// Function to find a row in the 
// given matrix using linear search 
static int linearCheck(int ar[][], int arr[]) 
{ 
    for (int i = 0; i < m; i++) 
    { 
  
        // Assume that the current row matched 
        // with the given array 
        boolean matched = true; 
  
        for (int j = 0; j < n; j++)  
        { 
  
            // If any element of the current row doesn't 
            // match with the corresponding element 
            // of the given array 
            if (ar[i][j] != arr[j]) 
            { 
  
                // Set matched to false and break; 
                matched = false; 
                break; 
            } 
        } 
  
        // If matched then return the row number 
        if (matched) 
            return i + 1; 
    } 
  
    // No row matched with the given array 
    return -1; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int mat[][] = { { 0, 0, 1, 0 }, 
                { 10, 9, 22, 23 }, 
                { 40, 40, 40, 40 }, 
                { 43, 44, 55, 68 }, 
                { 81, 73, 100, 132 }, 
                { 100, 75, 125, 133 } }; 
    int row[] = { 10, 9, 22, 23 }; 
  
    System.out.println (linearCheck(mat, row)); 
} 
} 
  
// This code is contributed BY @Tushil.. 

