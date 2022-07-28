

// Java implementation to find the  
// maximum sum subsequence such that  
// two adjacent element have atleast  
// difference of K in their indices  
class GFG  
{ 
  
    // Function to find the maximum sum  
    // subsequence such that two adjacent  
    // element have atleast difference  
    // of K in their indices  
    static int max_sum(int arr[], int n, int k)  
    {  
        // DP Array to store the maximum  
        // sum obtained till now  
        int dp[] = new int[n];  
      
        // Either select the first element  
        // or Nothing  
        dp[0] = Math.max(0, arr[0]);  
        int i = 1;  
      
        // Either Select the (i - 1) element  
        // or let the previous best answer be  
        // the current best answer  
        while (i < k) 
        {  
            dp[i] = Math.max(dp[i - 1], arr[i]);  
            i++;  
        }  
        i = k;  
      
        // Either select the best sum  
        // till previous_index or select the  
        // current element + best_sum till index-k  
        while (i < n)  
        {  
            dp[i] = Math.max(dp[i - 1],  
                    arr[i] + dp[i - k]);  
            i++;  
        }  
        return dp[n - 1];  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 2, -2, 4, 3, 1 };  
        int n = arr.length;  
        int k = 4;  
        System.out.println(max_sum(arr, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

