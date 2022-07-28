

// java program to get sum of 
// average of all subsets 
import java.io.*; 
  
class GFG { 
  
    // Returns value of Binomial 
    // Coefficient C(n, k) 
    static int nCr(int n, int k) 
    { 
        int C[][] = new int[n + 1][k + 1]; 
        int i, j; 
  
        // Calculate value of Binomial 
        // Coefficient in bottom up manner 
        for (i = 0; i <= n; i++) { 
            for (j = 0; j <= Math.min(i, k); j++) { 
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
  
                // Calculate value using 
                // previously stored values 
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
            } 
        } 
        return C[n][k]; 
    } 
  
    // method returns sum of average of all subsets 
    static double resultOfAllSubsets(int arr[], int N) 
    { 
        // Initialize result 
        double result = 0.0; 
  
        // Find sum of elements 
        int sum = 0; 
        for (int i = 0; i < N; i++) 
            sum += arr[i]; 
  
        // looping once for all subset of same size 
        for (int n = 1; n <= N; n++) 
  
            /* each element occurs nCr(N-1, n-1) times while 
            considering subset of size n */
            result += (double)(sum * (nCr(N - 1, n - 1))) / n; 
  
        return result; 
    } 
  
    // Driver code to test above methods 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 3, 5, 7 }; 
        int N = arr.length; 
        System.out.println(resultOfAllSubsets(arr, N)); 
    } 
} 
  
// This code is contributed by vt_m 

