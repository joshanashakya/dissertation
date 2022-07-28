

// Java implementation of above approach 
class GFG  
{ 
    static final int mod = (int)(1e9 + 7);  
      
    // find the number of ways to reach the end  
    static int ways(int arr[], int n)  
    {  
        // dp to store value  
        int dp[] = new int[n + 1];  
      
        // base case  
        dp[n - 1] = 1;  
      
        // Bottom up dp structure  
        for (int i = n - 2; i >= 0; i--)  
        {  
            dp[i] = 0;  
      
            // F[i] is dependent of  
            // F[i+1] to F[i+k]  
            for (int j = 1; ((j + i) < n &&  
                              j <= arr[i]); j++) 
            {  
                dp[i] += dp[i + j];  
                dp[i] %= mod;  
            }  
        }  
      
        // Return value of dp[0]  
        return dp[0] % mod;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 5, 3, 1, 4, 3 };  
      
        int n = arr.length;  
      
        System.out.println(ways(arr, n) % mod);  
    }  
} 
  
// This code is contributed by AnkitRai01 

