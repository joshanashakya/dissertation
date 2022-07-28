

// Java implementation of the approach  
class GFG  
{ 
    static final int MOD = 1000000007;  
      
    // Function to return the number  
    // of ways to reach the kth step  
    static int number_of_ways(int arr[],  
                              int n, int k)  
    {  
        if (k == 1)  
            return 1;  
      
        // Create the dp array  
        int dp[] = new int[k + 1];  
          
        int i; 
          
        for(i = 0; i < k + 1; i++) 
            dp[i] = -1 ; 
  
        // Broken steps  
        for (i = 0; i < n; i++)  
            dp[arr[i]] = 0;  
      
        dp[0] = 1;  
        dp[1] = (dp[1] == -1) ? 1 : dp[1];  
      
        // Calculate the number of ways for  
        // the rest of the positions  
        for (i = 2; i <= k; ++i) 
        {  
      
            // If it is a blocked position  
            if (dp[i] == 0)  
                continue;  
      
            // Number of ways to get to the ith step  
            dp[i] = dp[i - 1] + dp[i - 2];  
      
            dp[i] %= MOD;  
        }  
      
        // Return the required answer  
        return dp[k];  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 3 };  
        int n = arr.length;  
        int k = 6;  
      
        System.out.println(number_of_ways(arr, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

