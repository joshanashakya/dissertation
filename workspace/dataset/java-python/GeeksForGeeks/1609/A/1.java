

// Java implementation of the approach 
class GFG 
{ 
      
static int N = 3; 
static int M = 7; 
  
// Function that prints the original matrix 
static void printOriginalMatrix(int a[], int b[],  
                                int[][] mat) 
{ 
  
    // Iterate in the row 
    for (int i = 0; i < N; i++)  
    { 
  
        // Iterate in the column 
        for (int j = 0; j < M; j++)  
        { 
  
            // If previously existed an element 
            if (mat[i][j] == 1) 
                System.out.print(Math.min(a[i],  
                                          b[j]) + " "); 
            else
                System.out.print("0" + " "); 
        } 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 2, 1, 3 }; 
    int b[] = { 2, 3, 0, 0, 2, 0, 1 }; 
    int[][] mat = {{ 1, 0, 0, 0, 1, 0, 0 }, 
                   { 0, 0, 0, 0, 0, 0, 1 }, 
                   { 1, 1, 0, 0, 0, 0, 0 }}; 
    printOriginalMatrix(a, b, mat); 
} 
} 
  
// This code is contributed by Code_Mech 

