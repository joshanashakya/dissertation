

import java.util.Arrays; 
  
// Java program for finding the maximum number 
// of trailing zeros in the product of the 
// selected subset of size k. 
class GFG { 
  
    final static int MAX5 = 100; 
  
// Function to calculate maximum zeros. 
    static int maximumZeros(int arr[], int n, int k) { 
        // Initializing each value with -1; 
        int subset[][] = new int[k + 1][MAX5 + 5]; 
        // Fill each row with 1.0 
        for (int[] row : subset) { 
            Arrays.fill(row, -1); 
        } 
        //memset(subset, -1, sizeof(subset)); 
  
        subset[0][0] = 0; 
  
        for (int p = 0; p < n; p++) { 
            int pw2 = 0, pw5 = 0; 
  
            // Calculating maximal power of 2 for 
            // arr[p]. 
            while (arr[p] % 2 == 0) { 
                pw2++; 
                arr[p] /= 2; 
            } 
  
            // Calculating maximal power of 5 for 
            // arr[p]. 
            while (arr[p] % 5 == 0) { 
                pw5++; 
                arr[p] /= 5; 
            } 
  
            // Calculating subset[i][j] for maximum 
            // amount of twos we can collect by 
            // checking first i numbers and taking 
            // j of them with total power of five. 
            for (int i = k - 1; i >= 0; i--) { 
                for (int j = 0; j < MAX5; j++) // If subset[i][j] is not calculated. 
                { 
                    if (subset[i][j] != -1) { 
                        subset[i + 1][j + pw5] 
                                = Math.max(subset[i + 1][j + pw5], 
                                        subset[i][j] + pw2); 
                    } 
                } 
            } 
        } 
  
        // Calculating maximal number of zeros. 
        // by taking minimum of 5 or 2 and then 
        // taking maximum. 
        int ans = 0; 
        for (int i = 0; i < MAX5; i++) { 
            ans = Math.max(ans, Math.min(i, subset[k][i])); 
        } 
  
        return ans; 
    } 
  
// Driver function 
    public static void main(String[] args) { 
        int arr[] = {50, 4, 20}; 
        int k = 2; 
        int n = arr.length; 
        System.out.println(maximumZeros(arr, n, k)); 
  
    } 
} 
//this code contributed by 29AJayKumar 

