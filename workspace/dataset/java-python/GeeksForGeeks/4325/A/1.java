

// Java Program to check if two  
// given matrices are identical 
  
class GFG 
{ 
    static final int N = 4; 
      
    // This function returns 1 if A[][]  
    // and B[][] are identical 
    // otherwise returns 0 
    static int areSame(int A[][], int B[][]) 
    { 
        int i, j; 
        for (i = 0; i < N; i++) 
            for (j = 0; j < N; j++) 
                if (A[i][j] != B[i][j]) 
                    return 0; 
            return 1; 
    } 
      
    // Driver code  
    public static void main (String[] args) 
    { 
        int A[][] = { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}}; 
      
        int B[][] = { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}}; 
      
        if (areSame(A, B) == 1) 
            System.out.print("Matrices are identical"); 
        else
            System.out.print("Matrices are not identical"); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

