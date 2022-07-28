

// Java implementation to find the 
// minimum length of the array 
import java.util.*; 
  
class GFG{ 
   
// Function to find the 
// length of minimized array 
static int minimalLength(int a[], int n) 
{ 
   
    // Creating the required dp tables 
    int [][]dp = new int[n + 1][n + 1]; 
    int []dp1 = new int[n]; 
    int i, j, k; 
   
    // Initialising the dp table by -1 
    for (i = 0; i < n + 1; i++) { 
        for (j = 0; j < n + 1; j++) { 
            dp[i][j] = -1; 
        } 
    } 
   
    for (int size = 1; size <= n; size++) { 
        for (i = 0; i < n - size + 1; i++) { 
            j = i + size - 1; 
   
            // base case 
            if (i == j) 
                dp[i][j] = a[i]; 
            else { 
                for (k = i; k < j; k++) { 
   
                    // Check if the two subarray 
                    // can be combined 
                    if (dp[i][k] != -1
                        && dp[i][k] == dp[k + 1][j]) 
   
                        dp[i][j] = dp[i][k] + 1; 
                } 
            } 
        } 
    } 
   
    // Intialising dp1 table with max value 
    for (i = 0; i < n; i++) 
        dp1[i] = (int) 1e7; 
   
    for (i = 0; i < n; i++) { 
        for (j = 0; j <= i; j++) { 
   
            // Check if the subarray can be 
            // reduced to a single element 
            if (dp[j][i] != -1) { 
                if (j == 0) 
                    dp1[i] = 1; 
   
                // Minimal partition 
                // of [1: j-1] + 1 
                else
                    dp1[i] = Math.min( 
                        dp1[i], 
                        dp1[j - 1] + 1); 
            } 
        } 
    } 
   
    return dp1[n - 1]; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int n = 7; 
    int a[] = { 3, 3, 4, 4, 4, 3, 3 }; 
   
    System.out.print(minimalLength(a, n)); 
   
} 
} 
  
// This code contributed by Princi Singh 

