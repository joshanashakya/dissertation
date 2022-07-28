

// Java implementation of the above approach 
import java.io.*; 
  
class GFG  
{ 
  
static int SIZE = 3; 
static int N = 3; 
  
// Function to return the minimized sum 
static int minSum(int A[], int B[], int C[], int i, 
                    int n, int curr, int [][]dp) 
{ 
  
    // If all the indices have been used 
    if (n <= 0) 
        return 0; 
  
    // If this value is pre-calculated 
    // then return its value from dp array 
    // instead of re-computing it 
    if (dp[n][curr] != -1) 
        return dp[n][curr]; 
  
    // Here curr is the array chosen 
    // for the (i - 1)th element 
    // 0 for A[], 1 for B[] and 2 for C[] 
  
    // If A[i - 1] was chosen previously then 
    // only B[i] or C[i] can chosen now 
    // choose the one which leads 
    // to the minimum sum 
    if (curr == 0)  
    { 
        return dp[n][curr]  
                = Math.min(B[i] + minSum(A, B, C, i + 1, n - 1, 1, dp), 
                    C[i] + minSum(A, B, C, i + 1, n - 1, 2, dp)); 
    } 
  
    // If B[i - 1] was chosen previously then 
    // only A[i] or C[i] can chosen now 
    // choose the one which leads 
    // to the minimum sum 
    if (curr == 1) 
        return dp[n][curr]  
                = Math.min(A[i] + minSum(A, B, C, i + 1, n - 1, 0, dp), 
                    C[i] + minSum(A, B, C, i + 1, n - 1, 2, dp)); 
  
    // If C[i - 1] was chosen previously then 
    // only A[i] or B[i] can chosen now 
    // choose the one which leads 
    // to the minimum sum 
    return dp[n][curr]  
                = Math.min(A[i] + minSum(A, B, C, i + 1, n - 1, 0, dp), 
                    B[i] + minSum(A, B, C, i + 1, n - 1, 1, dp)); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int A[] = { 1, 50, 1 }; 
    int B[] = { 50, 50, 50 }; 
    int C[] = { 50, 50, 50 }; 
      
    // Initialize the dp[][] array 
    int dp[][] = new int[SIZE][N]; 
    for (int i = 0; i < SIZE; i++) 
        for (int j = 0; j < N; j++) 
            dp[i][j] = -1; 
      
    // min(start with A[0], start with B[0], start with C[0]) 
    System.out.println(Math.min(A[0] + minSum(A, B, C, 1, SIZE - 1, 0, dp), 
                Math.min(B[0] + minSum(A, B, C, 1, SIZE - 1, 1, dp), 
                    C[0] + minSum(A, B, C, 1, SIZE - 1, 2, dp)))); 
} 
} 
  
// This code is contributed by anuj_67..  

