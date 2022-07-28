

// Java program to find maximum possible AND  
  
class GFG  
{ 
      
    // Function to check whether a k segment partition  
    // is possible such that bitwise AND is 'mask'  
    static boolean checkpossible(int mask, int arr[],  
                                int prefix[], int n, int k)  
    {  
        int i,j; 
          
        // dp[i][j] stores whether it is possible to partition  
        // first i elements into j segments such that all j  
        // segments are 'good'  
        boolean dp[][] = new boolean[n + 1][k + 1];  
      
        // Initialising dp  
        for(i = 0; i < n + 1; i++) 
        { 
            for(j = 0; j < k + 1; j++) 
            { 
                dp[i][j] = false ; 
            } 
        } 
          
        dp[0][0] = true;  
      
        // Filling dp in bottom-up manner  
        for ( i = 1; i <= n; i++)  
        {  
            for (j = 1; j <= k; j++) 
            {  
                // Finding a cut such that first l elements  
                // can be partitioned into j-1 'good' segments  
                // and arr[l+1]+...+arr[i] is a 'good' segment  
                for (int l = i - 1; l >= 0; --l) 
                {  
                    if (dp[l][j - 1] && (((prefix[i] - prefix[l])  
                            & mask) == mask)) 
                    {  
                        dp[i][j] = true;  
                        break;  
                    }  
                }  
            }  
        }  
      
        return dp[n][k];  
    }  
      
    // Function to find maximum possible AND  
    static int Partition(int arr[], int n, int k)  
    {  
        // Array to store prfix sums  
        int prefix[] = new int[n+1];  
      
        for (int i = 1; i <= n; i++) 
        {  
            prefix[i] = prefix[i - 1] + arr[i];  
        }  
      
        // Maximum no of bits in the possible answer  
        int LOGS = 20;  
      
        // This will store the final answer  
        int ans = 0;  
      
        // Constructing answer greedily selecting  
        // from the higher most bit  
        for (int i = LOGS; i >= 0; --i)  
        {  
            // Checking if array can be partitioned  
            // such that the bitwise AND is ans|(1<<i)  
            if (checkpossible(ans | (1 << i), arr, prefix, n, k))  
            {  
                // if possible, update the answer  
                ans = ans | (1 << i);  
            }  
        }  
      
        // Return the final answer  
        return ans;  
    }  
  
    // Driver code  
    public static void main (String[] args)  
    { 
          
        int arr[] = {0, 1, 2, 7, 10, 23, 21, 6, 8, 7, 3}, k = 2;  
      
        // n = 11 , first element is zero  
        // to make array 1 based indexing. So, number of  
        // elements are 10  
        int n = arr.length - 1 ;  
          
        // Function call  
        System.out.println(Partition(arr, n, k));  
    } 
} 
  
// This code is contributed by AnkitRai01 

