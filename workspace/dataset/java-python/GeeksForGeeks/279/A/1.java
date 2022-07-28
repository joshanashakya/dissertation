

// Java implementation of the above approach  
class GFG  
{ 
      
    // A function to calculate the maximum value  
    static void findMax(int []a, int n)  
    {  
        int dp[][] = new int[n][2];  
        int i, j; 
          
        for (i = 0; i < n ; i++) 
            for(j = 0; j < 2; j++) 
                dp[i][j] = 0; 
  
        // basecases  
        dp[0][0] = a[0] + a[1];  
        dp[0][1] = a[0] * a[1];  
          
        // Loop to iterate and add the  
        // max value in the dp array  
        for (i = 1; i <= n - 2; i++) 
        {  
            dp[i][0] = Math.max(dp[i - 1][0],  
                                dp[i - 1][1]) + a[i + 1];  
            dp[i][1] = dp[i - 1][0] - a[i] +  
                        a[i] * a[i + 1];  
        }  
      
        System.out.println(Math.max(dp[n - 2][0],  
                                    dp[n - 2][1]));  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    { 
        int arr[] = { 5, -1, -5, -3, 2, 9, -4 };  
        findMax(arr, 7);  
    }  
} 
  
// This code is contributed by AnkitRai01 

