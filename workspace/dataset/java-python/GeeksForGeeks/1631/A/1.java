

// Java implementation to sort the rows 
// of matrix in descending order followed 
// by sorting the columns in ascending order 
import java.util.*; 
  
class GFG 
{ 
  
static int MAX_SIZE = 10; 
  
// function to sort each row of the matrix 
// according to the order specified by 
// descending. 
static void sortByRow(int[][] mat, int n, 
                      boolean descending) 
{ 
    int temp = 0; 
    for (int i = 0; i < n; i++) 
    { 
        if (descending == true) 
        { 
            int t = i; 
            for (int p = 0; p < n; p++)  
            { 
                for (int j = p + 1; j < n; j++)  
                { 
      
                    if (mat[t][p] < mat[t][j])  
                    { 
                        temp = mat[t][p]; 
      
                        mat[t][p] = mat[t][j]; 
      
                        mat[t][j] = temp; 
                    } 
                } 
            } 
        }  
  
        else
            Arrays.sort(mat[i]); 
    } 
} 
  
// function to find transpose of the matrix 
static void transpose(int mat[][], int n) 
{ 
    int temp = 0; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = i + 1; j < n; j++) 
        { 
  
            // swapping element at index (i, j) 
            // by element at index (j, i) 
            temp = mat[i][j]; 
            mat[i][j] = mat[j][i]; 
            mat[j][i] = temp; 
        } 
    } 
} 
  
// function to sort the matrix row-wise 
// and column-wise 
static void sortMatRowAndColWise(int mat[][], 
                                 int n) 
{ 
    // sort rows of mat[][] in  
    // descending order 
    sortByRow(mat, n, true); 
  
    // get transpose of mat[][] 
    transpose(mat, n); 
  
    // again sort rows of mat[][] in  
    // ascending order. 
    sortByRow(mat, n, false); 
  
    // again get transpose of mat[][] 
    transpose(mat, n); 
} 
  
// function to print the matrix 
static void printMat(int mat[][], int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < n; j++) 
            System.out.print(mat[i][j] + " "); 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 3; 
  
    int [][]mat = {{ 3, 2, 1 }, 
                   { 9, 8, 7 }, 
                   { 6, 5, 4 }}; 
  
    System.out.println("Original Matrix:"); 
    printMat(mat, n); 
  
    sortMatRowAndColWise(mat, n); 
  
    System.out.println("\n" + "Matrix After Sorting:"); 
    printMat(mat, n); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

