

// Java program to find the maximum 
// and minimum values of an Algebraic 
// expression of given form 
import java.io.*; 
import java.lang.*; 
  
public class GFG { 
      
    static double INF = 1e9; 
    static int MAX = 50; 
  
    static void minMaxValues(int []arr,  
                              int n, int m) 
    { 
          
        // Finding sum of array elements 
        int sum = 0; 
        for (int i = 0; i < (n + m); i++) 
        { 
            sum += arr[i]; 
      
            // shifting the integers by 50 
            // so that they become positive 
            arr[i] += 50; 
        } 
      
        // dp[i][j] represents true if sum 
        // j can be reachable by choosing 
        // i numbers 
        boolean dp[][] =  
             new boolean[MAX+1][MAX * MAX + 1]; 
      
        dp[0][0] = true; 
      
        // if dp[i][j] is true, that means 
        // it is possible to select i numbers 
        // from (n + m) numbers to sum upto j 
        for (int i = 0; i < (n + m); i++) { 
      
            // k can be at max n because the 
            // left expression has n numbers 
            for (int k = Math.min(n, i + 1); k >= 1; k--)  
            { 
                for (int j = 0; j < MAX * MAX + 1; j++) 
                { 
                    if (dp[k - 1][j]) 
                        dp[k][j + arr[i]] = true; 
                } 
            } 
        } 
      
        double max_value = -1 * INF, min_value = INF; 
      
        for (int i = 0; i < MAX * MAX + 1; i++) 
        { 
      
            // checking if a particular sum 
            // can be reachable by choosing 
            // n numbers 
            if (dp[n][i]) { 
      
                // getting the actual sum as 
                // we shifted the numbers by 
                /// 50 to avoid negative indexing 
                // in array 
                int temp = i - 50 * n; 
                max_value = Math.max(max_value, temp * 
                                        (sum - temp)); 
                                              
                min_value = Math.min(min_value, temp *  
                                        (sum - temp)); 
            } 
        } 
          
        System.out.print("Maximum Value: " +  
                     (int)max_value + "\n" +  
          "Minimum Value: " + (int)min_value + "\n"); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 2, m = 2; 
        int []arr = { 1, 2, 3, 4 }; 
        minMaxValues(arr, n, m); 
    } 
} 
  
// This code is contributed by Manish Shaw 
// (manishshaw1) 

