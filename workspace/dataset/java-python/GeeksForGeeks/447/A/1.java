

// Java program to find 
// trace of matrix formed by 
// adding Row-major and 
// Column-major order of same matrix 
class GFG 
{ 
    // Return the trace of 
    // sum of row-major matrix 
    // and column-major matrix 
    static int trace(int n, int m) 
    { 
      
        int A[][] = new int[n][m]; 
        int B[][] = new int[n][m]; 
        int C[][] = new int[n][m]; 
      
        // Generating the matrix A 
        int cnt = 1; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) { 
                A[i][j] = cnt; 
                cnt++; 
            }  
      
        // Generating the matrix A 
        cnt = 1; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) { 
                B[j][i] = cnt; 
                cnt++; 
            } 
      
        // Finding sum of matrix A and matrix B 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                C[i][j] = A[i][j] + B[i][j];  
      
        // Finding the trace of matrix C. 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                if (i == j) 
                    sum += C[i][j]; 
      
        return sum; 
    } 
      
    // Driver code  
    public static void main (String[] args) 
    { 
        int N = 3, M = 3; 
          
        System.out.println(trace(N, M)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

