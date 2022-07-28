

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
    public static int N = 4; 
      
    // Function to find the sum of all diagonal 
    // and Boundary elements 
    static void diagonalBoundarySum(int arr[][]){ 
        int requiredSum = 0; 
          
        // Traverse arr[][] 
        // Loop from i to N-1 for rows 
        for (int i = 0; i < N; i++) { 
      
            // Loop from j = N-1 for columns 
            for (int j = 0; j < N; j++) { 
      
                // Condition for diagonal 
                // elements 
                if (i == j || (i + j) == N - 1) { 
                    requiredSum += arr[i][j]; 
                } 
      
                // Condition for Boundary 
                // elements 
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) { 
                    requiredSum += arr[i][j]; 
                } 
            } 
        } 
      
        // Print the final Sum 
        System.out.println(requiredSum); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int arr[][] = { { 1, 2, 3, 4 },{ 1, 2, 3, 4 }, 
                        { 1, 2, 3, 4 },{ 1, 2, 3, 4 } }; 
      
        diagonalBoundarySum(arr); 
          
    } 
} 
  
// This code is contributed by AbhiThakur 

