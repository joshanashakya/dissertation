

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to return the minimum 
    // number of operations required 
    static int minOperations(int n, int m, 
                        int k, int matrix[][]) 
    { 
        // Create another array to 
        // store the elements of matrix 
        int [] arr = new int[n * m]; 
      
        int mod = matrix[0][0] % k; 
      
        for (int i = 0; i < n; ++i) 
        { 
            for (int j = 0; j < m; ++j)  
            { 
                arr[i * m + j] = matrix[i][j]; 
      
                // If not possible 
                if (matrix[i][j] % k != mod)  
                { 
                    return -1; 
                } 
            } 
        } 
      
        // Sort the array to get median 
        Arrays.sort(arr); 
      
        int median = arr[(n * m) / 2]; 
      
        // To count the minimum operations 
        int minOperations = 0; 
        for (int i = 0; i < n * m; ++i)  
            minOperations += Math.abs(arr[i] - median) / k; 
      
        // If there are even elements, then there  
        // are two medians. We consider the best 
        // of two as answer. 
        if ((n * m) % 2 == 0) 
        { 
        int median2 = arr[(n * m) / 2]; 
        int minOperations2 = 0; 
        for (int i = 0; i < n * m; ++i)  
            minOperations2 += Math.abs(arr[i] - median2) / k; 
  
        minOperations = Math.min(minOperations, minOperations2); 
        } 
      
        // Return minimum operations required 
        return minOperations; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int matrix [][] = { { 2, 4, 6 }, 
                            { 8, 10, 12 }, 
                            { 14, 16, 18 }, 
                            { 20, 22, 24 } }; 
                              
        int n = matrix.length; 
        int m = matrix[0].length; 
        int k = 2; 
        System.out.println(minOperations(n, m, k, matrix)); 
    } 
} 
  
// This code is contributed by ihritik 

