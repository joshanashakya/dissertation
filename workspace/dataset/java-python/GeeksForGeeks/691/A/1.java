

// Java implementation to sort the  
// major diagonal of the matrix 
class GFG{ 
   
// Function to sort the major  
// diagonal of the matrix 
static void sortDiagonal(int a[][], int M, int N) 
{ 
    // Loop to find the ith minimum 
    // element from the major diagonal 
    for (int i = 0; i < M; i++) { 
        int sm = a[i][i]; 
        int pos = i; 
           
        // Loop to find the minimum  
        // element from the unsorted matrix 
        for (int j = i + 1; j < N; j++) { 
            if (sm > a[j][j]) { 
                sm = a[j][j]; 
                pos = j; 
            } 
        } 
           
        // Swap to put the minimum 
        // element at the begining of  
        // the major diagonal of matrix 
        swap(a, i, i, pos, pos); 
    } 
   
    // Loop to print the matrix 
    for (int i = 0; i < M; i++) { 
        for (int j = 0; j < N; j++) 
            System.out.print(a[i][j]+ " "); 
        System.out.println(); 
    } 
} 
   
static void swap(int[][] a, int i, int i2, int pos, int pos2) { 
    int temp = a[i][i2]; 
    a[i][i2] = a[pos][pos2]; 
    a[pos][pos2] = temp;     
} 
  
// Driven Code 
public static void main(String[] args) 
{ 
    int a[][] = { { 4, 2 }, 
                    { 3, 1 } }; 
   
    // Sort the major Diagonal 
    sortDiagonal(a, 2, 2); 
} 
} 
  
// This code is contributed by 29AjayKumar 

