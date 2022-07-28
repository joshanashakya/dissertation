

// Java implementation of the above approach:  
class GFG  
{ 
  
    // Function to return the minimum number of elements 
    // whose sign must be flipped to get the positive 
    // sum of array elements as close to 0 as possible 
    public static int solve(int[] A, int n)  
    { 
        int[][] dp = new int[2000][2000]; 
  
        // boolean variable used for toggling between maps 
        int flag = 1; 
  
        // Calculate the sum of all elements of the array 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += A[i]; 
  
        // Initializing first map(dp[0]) with INT_MAX because 
        // for i=0, there are no elements in the array to flip 
        for (int i = -sum; i <= sum; i++)  
        { 
            try
            { 
                dp[0][i] = Integer.MAX_VALUE; 
            }  
            catch (Exception e){} 
        } 
  
        // Base Case 
        dp[0][0] = 0; 
  
        for (int i = 1; i <= n; i++) 
        { 
            for (int j = 0; j <= sum; j++) 
            { 
                try 
                { 
                    dp[flag][j] = Integer.MAX_VALUE; 
                    if (j - A[i - 1] <= sum &&  
                        j - A[i - 1] >= -sum) 
                        dp[flag][j] = dp[flag ^ 1][j - A[i - 1]]; 
                    if (j + A[i - 1] <= sum &&  
                        j + A[i - 1] >= -sum && 
                        dp[flag ^ 1][j + A[i - 1]] != Integer.MAX_VALUE) 
                        dp[flag][j] = Math.min(dp[flag][j],  
                                               dp[flag ^ 1][j +  
                                                A[i - 1]] + 1); 
                } catch (Exception e) {} 
            } 
  
            // For toggling 
            flag = flag ^ 1; 
        } 
  
        // Required sum is minimum non-negative 
        // So, we iterate from i=0 to sum and find 
        // the first i where dp[flag ^ 1][i] != INT_MAX 
        for (int i = 0; i <= sum; i++) 
        { 
            if (dp[flag ^ 1][i] != Integer.MAX_VALUE) 
                return dp[flag ^ 1][i]; 
        } 
          
        // In worst case we will flip max n-1 elements 
        return n - 1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println(solve(arr, n)); 
    } 
} 
  
// This code is contributed by sanjeev2552 

