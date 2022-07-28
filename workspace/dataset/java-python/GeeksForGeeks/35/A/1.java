

// Java program find the count of 
// mountains in a given Matrix 
import java.util.*; 
  
class GFG{ 
   
static int MAX = 100; 
   
// Function to count number of mountains 
// in a given matrix of size n 
static int countMountains(int a[][], int n) 
{ 
    int [][]A = new int[n + 2][n + 2]; 
    int count = 0; 
   
    // form another matrix with one extra 
    // layer of border elements. Border 
    // elements will contain Integer.MIN_VALUE value. 
    for (int i = 0; i < n + 2; i++) { 
        for (int j = 0; j < n + 2; j++) { 
   
            if ((i == 0) || (j == 0) 
                || (i == n + 1) 
                || (j == n + 1)) { 
   
                // For border elements, 
                // set value as Integer.MIN_VALUE 
                A[i][j] = Integer.MIN_VALUE; 
            } 
            else { 
   
                // For rest elements, just copy 
                // it into new matrix 
                A[i][j] = a[i - 1][j - 1]; 
            } 
        } 
    } 
   
    // Check for mountains in the modified matrix 
    for (int i = 1; i <= n; i++) { 
        for (int j = 1; j <= n; j++) { 
   
            // check for all directions 
            if ((A[i][j] > A[i - 1][j]) 
                && (A[i][j] > A[i + 1][j]) 
                && (A[i][j] > A[i][j - 1]) 
                && (A[i][j] > A[i][j + 1]) 
                && (A[i][j] > A[i - 1][j - 1]) 
                && (A[i][j] > A[i + 1][j + 1]) 
                && (A[i][j] > A[i - 1][j + 1]) 
                && (A[i][j] > A[i + 1][j - 1])) { 
                count++; 
            } 
        } 
    } 
   
    return count; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int a[][] = { { 1, 2, 3 }, 
                     { 4, 5, 6 }, 
                     { 7, 8, 9 } }; 
    int n = 3; 
   
    System.out.print(countMountains(a, n)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

