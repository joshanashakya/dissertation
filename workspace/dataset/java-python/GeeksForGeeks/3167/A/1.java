

// Java implementation of the approach 
  
class GFG 
{ 
    // Function to return the maximum required sub-array sum 
    static int maxSum(int []a, int n) 
    { 
        int ans = 0; 
        int [] arr = new int[n + 1]; 
      
        // Creating one based indexing 
        for (int i = 1; i <= n; i++) 
            arr[i] = a[i - 1]; 
      
        // 2d array to contain solution for each step 
        int [][] dp = new int [n + 1][3]; 
        for (int i = 1; i <= n; ++i)  
        { 
      
            // Case 1: Choosing current or (current + previous) 
            // whichever is smaller 
            dp[i][0] = Math.max(arr[i], dp[i - 1][0] + arr[i]); 
      
            // Case 2:(a) Altering sign and add to previous case 1 or 
            // value 0 
            dp[i][1] = Math.max(0, dp[i - 1][0]) - arr[i]; 
      
            // Case 2:(b) Adding current element with previous case 2 
            // and updating the maximum 
            if (i >= 2) 
                dp[i][1] = Math.max(dp[i][1], dp[i - 1][1] + arr[i]); 
      
            // Case 3:(a) Altering sign and add to previous case 2 
            if (i >= 2) 
                dp[i][2] = dp[i - 1][1] - arr[i]; 
      
            // Case 3:(b) Adding current element with previous case 3 
            if (i >= 3) 
                dp[i][2] = Math.max(dp[i][2], dp[i - 1][2] + arr[i]); 
      
            // Updating the maximum value of variable ans 
            ans = Math.max(ans, dp[i][0]); 
            ans = Math.max(ans, dp[i][1]); 
            ans = Math.max(ans, dp[i][2]); 
        } 
      
        // Return the final solution 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { -5, 3, 2, 7, -8, 3, 7, -9, 10, 12, -6 }; 
        int n = arr.length; 
        System.out.println(maxSum(arr, n)); 
    } 
} 
  
// This code is contributed by ihritik 

